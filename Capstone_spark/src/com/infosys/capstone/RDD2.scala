package com.infosys.capstone

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.functions._

object RDD2 {
  case class CreditCarddetails(CustomerName:String, DOB:String, SSN:String, MailID:String, PhoneNumber:Long, City:String, 
      State:String, ZipCode:String, CreditLimit:Long)
  case class CustomerReference(CustomerName:String, DOB:String,SSN:String, City:String, State:String, ZipCode:Long, 
      ExistingProducts:String, OtherBankProducts1:String, CreditSpent1:Long, OtherBankProducts2:String, CreditSpent2:Long, 
      OtherBankProducts3:String, CreditSpent3:Long, DefaulterFlag:String);
  
  def main(args: Array[String]) {
    // create Spark context with Spark configuration
    val sc = new SparkContext(new SparkConf().setAppName("Spark Scala Application").setMaster("local"))
    def isAllDigits(x: String) = x forall Character.isDigit
    val rdd1 = sc.textFile("hdfs://localhost:9000/spark_1037786/CreditCardApplicationData.csv").map(_.split(","))
      .map(r=> (CreditCarddetails(r(0),r(1),r(2),r(3),r(4).toLong,r(5),r(6),r(7),r(8).toLong)));
    val rdd2 = sc.textFile("hdfs://localhost:9000/spark_1037786/CustomerRefererenceData.csv").map(_.split(","))
      .map(r=> if( isAllDigits(r(6)) ) (CustomerReference(r(0),r(1),r(2),r(3),r(4),(r(5)+r(6)).toLong,r(7),r(8),r(9).toLong,r(10),
          r(11).toLong,r(12),r(13).toLong,r(14))) 
          else (CustomerReference(r(0),r(1),r(2),r(3),r(4),r(5).toLong,r(6),r(7),r(8).toLong,r(9),r(10).toLong,r(11),r(12).toLong,r(13))));
    val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._
    val df1 = rdd1.toDF();
    val df2 = rdd2.toDF();
    df1.registerTempTable("CreditDetails")
    sqlContext.sql("select distinct(*) from CreditDetails").registerTempTable("CreditData");//Application
    df2.registerTempTable("CustomerReference")
    sqlContext.sql("select *,(CreditSpent1+CreditSpent2+CreditSpent3) as TotalSpent from CustomerReference").registerTempTable("CustomerData")
    sqlContext.sql("select CreditData.SSN,CreditData.CustomerName,CreditData.CreditLimit,CustomerData.TotalSpent,CustomerData.DefaulterFlag from CreditData join CustomerData on CreditData.SSN = CustomerData.SSN").registerTempTable("TotalData")
    val finalDF = sqlContext.sql("select SSN,CustomerName from TotalData where DefaulterFlag='N' and CreditLimit < TotalSpent").toDF().withColumn("Status", lit("Approved"))
    .union(sqlContext.sql("select SSN,CustomerName from TotalData where DefaulterFlag='Y' or CreditLimit > TotalSpent").toDF().withColumn("Status", lit("Rejected")))
    //finalDF.write.format("csv").save("hdfs://localhost:9000/spark_1037786/application_status.csv")
    finalDF.show()
  }
}
