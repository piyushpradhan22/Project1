// ORM class for table 'CDPCompletionStatus'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Nov 25 18:55:44 IST 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CDPCompletionStatus extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("EmpNo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.EmpNo = (Integer)value;
      }
    });
    setters.put("RoleCapability", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.RoleCapability = (String)value;
      }
    });
    setters.put("EmpPUCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.EmpPUCode = (String)value;
      }
    });
    setters.put("SBUCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.SBUCode = (String)value;
      }
    });
    setters.put("CertificationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.CertificationCode = (String)value;
      }
    });
    setters.put("CertificationTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.CertificationTitle = (String)value;
      }
    });
    setters.put("Competency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.Competency = (String)value;
      }
    });
    setters.put("CertificationType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.CertificationType = (String)value;
      }
    });
    setters.put("CerttificationGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.CerttificationGroup = (String)value;
      }
    });
    setters.put("ContactBasedProgram_Y_N", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.ContactBasedProgram_Y_N = (String)value;
      }
    });
    setters.put("ExamDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.ExamDate = (String)value;
      }
    });
    setters.put("Onsite_Offshore", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.Onsite_Offshore = (String)value;
      }
    });
    setters.put("AttendanceStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.AttendanceStatus = (String)value;
      }
    });
    setters.put("Marks", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.Marks = (Integer)value;
      }
    });
    setters.put("Result", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.Result = (String)value;
      }
    });
    setters.put("Status1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.Status1 = (String)value;
      }
    });
    setters.put("txtPlanCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.txtPlanCategory = (String)value;
      }
    });
    setters.put("SkillID1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.SkillID1 = (Integer)value;
      }
    });
    setters.put("Complexity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.Complexity = (String)value;
      }
    });
    setters.put("test", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CDPCompletionStatus.this.test = (java.sql.Date)value;
      }
    });
  }
  public CDPCompletionStatus() {
    init0();
  }
  private Integer EmpNo;
  public Integer get_EmpNo() {
    return EmpNo;
  }
  public void set_EmpNo(Integer EmpNo) {
    this.EmpNo = EmpNo;
  }
  public CDPCompletionStatus with_EmpNo(Integer EmpNo) {
    this.EmpNo = EmpNo;
    return this;
  }
  private String RoleCapability;
  public String get_RoleCapability() {
    return RoleCapability;
  }
  public void set_RoleCapability(String RoleCapability) {
    this.RoleCapability = RoleCapability;
  }
  public CDPCompletionStatus with_RoleCapability(String RoleCapability) {
    this.RoleCapability = RoleCapability;
    return this;
  }
  private String EmpPUCode;
  public String get_EmpPUCode() {
    return EmpPUCode;
  }
  public void set_EmpPUCode(String EmpPUCode) {
    this.EmpPUCode = EmpPUCode;
  }
  public CDPCompletionStatus with_EmpPUCode(String EmpPUCode) {
    this.EmpPUCode = EmpPUCode;
    return this;
  }
  private String SBUCode;
  public String get_SBUCode() {
    return SBUCode;
  }
  public void set_SBUCode(String SBUCode) {
    this.SBUCode = SBUCode;
  }
  public CDPCompletionStatus with_SBUCode(String SBUCode) {
    this.SBUCode = SBUCode;
    return this;
  }
  private String CertificationCode;
  public String get_CertificationCode() {
    return CertificationCode;
  }
  public void set_CertificationCode(String CertificationCode) {
    this.CertificationCode = CertificationCode;
  }
  public CDPCompletionStatus with_CertificationCode(String CertificationCode) {
    this.CertificationCode = CertificationCode;
    return this;
  }
  private String CertificationTitle;
  public String get_CertificationTitle() {
    return CertificationTitle;
  }
  public void set_CertificationTitle(String CertificationTitle) {
    this.CertificationTitle = CertificationTitle;
  }
  public CDPCompletionStatus with_CertificationTitle(String CertificationTitle) {
    this.CertificationTitle = CertificationTitle;
    return this;
  }
  private String Competency;
  public String get_Competency() {
    return Competency;
  }
  public void set_Competency(String Competency) {
    this.Competency = Competency;
  }
  public CDPCompletionStatus with_Competency(String Competency) {
    this.Competency = Competency;
    return this;
  }
  private String CertificationType;
  public String get_CertificationType() {
    return CertificationType;
  }
  public void set_CertificationType(String CertificationType) {
    this.CertificationType = CertificationType;
  }
  public CDPCompletionStatus with_CertificationType(String CertificationType) {
    this.CertificationType = CertificationType;
    return this;
  }
  private String CerttificationGroup;
  public String get_CerttificationGroup() {
    return CerttificationGroup;
  }
  public void set_CerttificationGroup(String CerttificationGroup) {
    this.CerttificationGroup = CerttificationGroup;
  }
  public CDPCompletionStatus with_CerttificationGroup(String CerttificationGroup) {
    this.CerttificationGroup = CerttificationGroup;
    return this;
  }
  private String ContactBasedProgram_Y_N;
  public String get_ContactBasedProgram_Y_N() {
    return ContactBasedProgram_Y_N;
  }
  public void set_ContactBasedProgram_Y_N(String ContactBasedProgram_Y_N) {
    this.ContactBasedProgram_Y_N = ContactBasedProgram_Y_N;
  }
  public CDPCompletionStatus with_ContactBasedProgram_Y_N(String ContactBasedProgram_Y_N) {
    this.ContactBasedProgram_Y_N = ContactBasedProgram_Y_N;
    return this;
  }
  private String ExamDate;
  public String get_ExamDate() {
    return ExamDate;
  }
  public void set_ExamDate(String ExamDate) {
    this.ExamDate = ExamDate;
  }
  public CDPCompletionStatus with_ExamDate(String ExamDate) {
    this.ExamDate = ExamDate;
    return this;
  }
  private String Onsite_Offshore;
  public String get_Onsite_Offshore() {
    return Onsite_Offshore;
  }
  public void set_Onsite_Offshore(String Onsite_Offshore) {
    this.Onsite_Offshore = Onsite_Offshore;
  }
  public CDPCompletionStatus with_Onsite_Offshore(String Onsite_Offshore) {
    this.Onsite_Offshore = Onsite_Offshore;
    return this;
  }
  private String AttendanceStatus;
  public String get_AttendanceStatus() {
    return AttendanceStatus;
  }
  public void set_AttendanceStatus(String AttendanceStatus) {
    this.AttendanceStatus = AttendanceStatus;
  }
  public CDPCompletionStatus with_AttendanceStatus(String AttendanceStatus) {
    this.AttendanceStatus = AttendanceStatus;
    return this;
  }
  private Integer Marks;
  public Integer get_Marks() {
    return Marks;
  }
  public void set_Marks(Integer Marks) {
    this.Marks = Marks;
  }
  public CDPCompletionStatus with_Marks(Integer Marks) {
    this.Marks = Marks;
    return this;
  }
  private String Result;
  public String get_Result() {
    return Result;
  }
  public void set_Result(String Result) {
    this.Result = Result;
  }
  public CDPCompletionStatus with_Result(String Result) {
    this.Result = Result;
    return this;
  }
  private String Status1;
  public String get_Status1() {
    return Status1;
  }
  public void set_Status1(String Status1) {
    this.Status1 = Status1;
  }
  public CDPCompletionStatus with_Status1(String Status1) {
    this.Status1 = Status1;
    return this;
  }
  private String txtPlanCategory;
  public String get_txtPlanCategory() {
    return txtPlanCategory;
  }
  public void set_txtPlanCategory(String txtPlanCategory) {
    this.txtPlanCategory = txtPlanCategory;
  }
  public CDPCompletionStatus with_txtPlanCategory(String txtPlanCategory) {
    this.txtPlanCategory = txtPlanCategory;
    return this;
  }
  private Integer SkillID1;
  public Integer get_SkillID1() {
    return SkillID1;
  }
  public void set_SkillID1(Integer SkillID1) {
    this.SkillID1 = SkillID1;
  }
  public CDPCompletionStatus with_SkillID1(Integer SkillID1) {
    this.SkillID1 = SkillID1;
    return this;
  }
  private String Complexity;
  public String get_Complexity() {
    return Complexity;
  }
  public void set_Complexity(String Complexity) {
    this.Complexity = Complexity;
  }
  public CDPCompletionStatus with_Complexity(String Complexity) {
    this.Complexity = Complexity;
    return this;
  }
  private java.sql.Date test;
  public java.sql.Date get_test() {
    return test;
  }
  public void set_test(java.sql.Date test) {
    this.test = test;
  }
  public CDPCompletionStatus with_test(java.sql.Date test) {
    this.test = test;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CDPCompletionStatus)) {
      return false;
    }
    CDPCompletionStatus that = (CDPCompletionStatus) o;
    boolean equal = true;
    equal = equal && (this.EmpNo == null ? that.EmpNo == null : this.EmpNo.equals(that.EmpNo));
    equal = equal && (this.RoleCapability == null ? that.RoleCapability == null : this.RoleCapability.equals(that.RoleCapability));
    equal = equal && (this.EmpPUCode == null ? that.EmpPUCode == null : this.EmpPUCode.equals(that.EmpPUCode));
    equal = equal && (this.SBUCode == null ? that.SBUCode == null : this.SBUCode.equals(that.SBUCode));
    equal = equal && (this.CertificationCode == null ? that.CertificationCode == null : this.CertificationCode.equals(that.CertificationCode));
    equal = equal && (this.CertificationTitle == null ? that.CertificationTitle == null : this.CertificationTitle.equals(that.CertificationTitle));
    equal = equal && (this.Competency == null ? that.Competency == null : this.Competency.equals(that.Competency));
    equal = equal && (this.CertificationType == null ? that.CertificationType == null : this.CertificationType.equals(that.CertificationType));
    equal = equal && (this.CerttificationGroup == null ? that.CerttificationGroup == null : this.CerttificationGroup.equals(that.CerttificationGroup));
    equal = equal && (this.ContactBasedProgram_Y_N == null ? that.ContactBasedProgram_Y_N == null : this.ContactBasedProgram_Y_N.equals(that.ContactBasedProgram_Y_N));
    equal = equal && (this.ExamDate == null ? that.ExamDate == null : this.ExamDate.equals(that.ExamDate));
    equal = equal && (this.Onsite_Offshore == null ? that.Onsite_Offshore == null : this.Onsite_Offshore.equals(that.Onsite_Offshore));
    equal = equal && (this.AttendanceStatus == null ? that.AttendanceStatus == null : this.AttendanceStatus.equals(that.AttendanceStatus));
    equal = equal && (this.Marks == null ? that.Marks == null : this.Marks.equals(that.Marks));
    equal = equal && (this.Result == null ? that.Result == null : this.Result.equals(that.Result));
    equal = equal && (this.Status1 == null ? that.Status1 == null : this.Status1.equals(that.Status1));
    equal = equal && (this.txtPlanCategory == null ? that.txtPlanCategory == null : this.txtPlanCategory.equals(that.txtPlanCategory));
    equal = equal && (this.SkillID1 == null ? that.SkillID1 == null : this.SkillID1.equals(that.SkillID1));
    equal = equal && (this.Complexity == null ? that.Complexity == null : this.Complexity.equals(that.Complexity));
    equal = equal && (this.test == null ? that.test == null : this.test.equals(that.test));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CDPCompletionStatus)) {
      return false;
    }
    CDPCompletionStatus that = (CDPCompletionStatus) o;
    boolean equal = true;
    equal = equal && (this.EmpNo == null ? that.EmpNo == null : this.EmpNo.equals(that.EmpNo));
    equal = equal && (this.RoleCapability == null ? that.RoleCapability == null : this.RoleCapability.equals(that.RoleCapability));
    equal = equal && (this.EmpPUCode == null ? that.EmpPUCode == null : this.EmpPUCode.equals(that.EmpPUCode));
    equal = equal && (this.SBUCode == null ? that.SBUCode == null : this.SBUCode.equals(that.SBUCode));
    equal = equal && (this.CertificationCode == null ? that.CertificationCode == null : this.CertificationCode.equals(that.CertificationCode));
    equal = equal && (this.CertificationTitle == null ? that.CertificationTitle == null : this.CertificationTitle.equals(that.CertificationTitle));
    equal = equal && (this.Competency == null ? that.Competency == null : this.Competency.equals(that.Competency));
    equal = equal && (this.CertificationType == null ? that.CertificationType == null : this.CertificationType.equals(that.CertificationType));
    equal = equal && (this.CerttificationGroup == null ? that.CerttificationGroup == null : this.CerttificationGroup.equals(that.CerttificationGroup));
    equal = equal && (this.ContactBasedProgram_Y_N == null ? that.ContactBasedProgram_Y_N == null : this.ContactBasedProgram_Y_N.equals(that.ContactBasedProgram_Y_N));
    equal = equal && (this.ExamDate == null ? that.ExamDate == null : this.ExamDate.equals(that.ExamDate));
    equal = equal && (this.Onsite_Offshore == null ? that.Onsite_Offshore == null : this.Onsite_Offshore.equals(that.Onsite_Offshore));
    equal = equal && (this.AttendanceStatus == null ? that.AttendanceStatus == null : this.AttendanceStatus.equals(that.AttendanceStatus));
    equal = equal && (this.Marks == null ? that.Marks == null : this.Marks.equals(that.Marks));
    equal = equal && (this.Result == null ? that.Result == null : this.Result.equals(that.Result));
    equal = equal && (this.Status1 == null ? that.Status1 == null : this.Status1.equals(that.Status1));
    equal = equal && (this.txtPlanCategory == null ? that.txtPlanCategory == null : this.txtPlanCategory.equals(that.txtPlanCategory));
    equal = equal && (this.SkillID1 == null ? that.SkillID1 == null : this.SkillID1.equals(that.SkillID1));
    equal = equal && (this.Complexity == null ? that.Complexity == null : this.Complexity.equals(that.Complexity));
    equal = equal && (this.test == null ? that.test == null : this.test.equals(that.test));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.EmpNo = JdbcWritableBridge.readInteger(1, __dbResults);
    this.RoleCapability = JdbcWritableBridge.readString(2, __dbResults);
    this.EmpPUCode = JdbcWritableBridge.readString(3, __dbResults);
    this.SBUCode = JdbcWritableBridge.readString(4, __dbResults);
    this.CertificationCode = JdbcWritableBridge.readString(5, __dbResults);
    this.CertificationTitle = JdbcWritableBridge.readString(6, __dbResults);
    this.Competency = JdbcWritableBridge.readString(7, __dbResults);
    this.CertificationType = JdbcWritableBridge.readString(8, __dbResults);
    this.CerttificationGroup = JdbcWritableBridge.readString(9, __dbResults);
    this.ContactBasedProgram_Y_N = JdbcWritableBridge.readString(10, __dbResults);
    this.ExamDate = JdbcWritableBridge.readString(11, __dbResults);
    this.Onsite_Offshore = JdbcWritableBridge.readString(12, __dbResults);
    this.AttendanceStatus = JdbcWritableBridge.readString(13, __dbResults);
    this.Marks = JdbcWritableBridge.readInteger(14, __dbResults);
    this.Result = JdbcWritableBridge.readString(15, __dbResults);
    this.Status1 = JdbcWritableBridge.readString(16, __dbResults);
    this.txtPlanCategory = JdbcWritableBridge.readString(17, __dbResults);
    this.SkillID1 = JdbcWritableBridge.readInteger(18, __dbResults);
    this.Complexity = JdbcWritableBridge.readString(19, __dbResults);
    this.test = JdbcWritableBridge.readDate(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.EmpNo = JdbcWritableBridge.readInteger(1, __dbResults);
    this.RoleCapability = JdbcWritableBridge.readString(2, __dbResults);
    this.EmpPUCode = JdbcWritableBridge.readString(3, __dbResults);
    this.SBUCode = JdbcWritableBridge.readString(4, __dbResults);
    this.CertificationCode = JdbcWritableBridge.readString(5, __dbResults);
    this.CertificationTitle = JdbcWritableBridge.readString(6, __dbResults);
    this.Competency = JdbcWritableBridge.readString(7, __dbResults);
    this.CertificationType = JdbcWritableBridge.readString(8, __dbResults);
    this.CerttificationGroup = JdbcWritableBridge.readString(9, __dbResults);
    this.ContactBasedProgram_Y_N = JdbcWritableBridge.readString(10, __dbResults);
    this.ExamDate = JdbcWritableBridge.readString(11, __dbResults);
    this.Onsite_Offshore = JdbcWritableBridge.readString(12, __dbResults);
    this.AttendanceStatus = JdbcWritableBridge.readString(13, __dbResults);
    this.Marks = JdbcWritableBridge.readInteger(14, __dbResults);
    this.Result = JdbcWritableBridge.readString(15, __dbResults);
    this.Status1 = JdbcWritableBridge.readString(16, __dbResults);
    this.txtPlanCategory = JdbcWritableBridge.readString(17, __dbResults);
    this.SkillID1 = JdbcWritableBridge.readInteger(18, __dbResults);
    this.Complexity = JdbcWritableBridge.readString(19, __dbResults);
    this.test = JdbcWritableBridge.readDate(20, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(EmpNo, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(RoleCapability, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EmpPUCode, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SBUCode, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationCode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationTitle, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Competency, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationType, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CerttificationGroup, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ContactBasedProgram_Y_N, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ExamDate, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Onsite_Offshore, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AttendanceStatus, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Marks, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Result, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Status1, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(txtPlanCategory, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SkillID1, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Complexity, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(test, 20 + __off, 91, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(EmpNo, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(RoleCapability, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EmpPUCode, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SBUCode, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationCode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationTitle, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Competency, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CertificationType, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CerttificationGroup, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ContactBasedProgram_Y_N, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ExamDate, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Onsite_Offshore, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AttendanceStatus, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Marks, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Result, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Status1, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(txtPlanCategory, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SkillID1, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Complexity, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(test, 20 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.EmpNo = null;
    } else {
    this.EmpNo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.RoleCapability = null;
    } else {
    this.RoleCapability = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EmpPUCode = null;
    } else {
    this.EmpPUCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SBUCode = null;
    } else {
    this.SBUCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CertificationCode = null;
    } else {
    this.CertificationCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CertificationTitle = null;
    } else {
    this.CertificationTitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Competency = null;
    } else {
    this.Competency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CertificationType = null;
    } else {
    this.CertificationType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CerttificationGroup = null;
    } else {
    this.CerttificationGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ContactBasedProgram_Y_N = null;
    } else {
    this.ContactBasedProgram_Y_N = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ExamDate = null;
    } else {
    this.ExamDate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Onsite_Offshore = null;
    } else {
    this.Onsite_Offshore = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AttendanceStatus = null;
    } else {
    this.AttendanceStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Marks = null;
    } else {
    this.Marks = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Result = null;
    } else {
    this.Result = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Status1 = null;
    } else {
    this.Status1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.txtPlanCategory = null;
    } else {
    this.txtPlanCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SkillID1 = null;
    } else {
    this.SkillID1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Complexity = null;
    } else {
    this.Complexity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.test = null;
    } else {
    this.test = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.EmpNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.EmpNo);
    }
    if (null == this.RoleCapability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RoleCapability);
    }
    if (null == this.EmpPUCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EmpPUCode);
    }
    if (null == this.SBUCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SBUCode);
    }
    if (null == this.CertificationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationCode);
    }
    if (null == this.CertificationTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationTitle);
    }
    if (null == this.Competency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Competency);
    }
    if (null == this.CertificationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationType);
    }
    if (null == this.CerttificationGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CerttificationGroup);
    }
    if (null == this.ContactBasedProgram_Y_N) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ContactBasedProgram_Y_N);
    }
    if (null == this.ExamDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ExamDate);
    }
    if (null == this.Onsite_Offshore) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Onsite_Offshore);
    }
    if (null == this.AttendanceStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AttendanceStatus);
    }
    if (null == this.Marks) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Marks);
    }
    if (null == this.Result) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Result);
    }
    if (null == this.Status1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Status1);
    }
    if (null == this.txtPlanCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, txtPlanCategory);
    }
    if (null == this.SkillID1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SkillID1);
    }
    if (null == this.Complexity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Complexity);
    }
    if (null == this.test) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.test.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.EmpNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.EmpNo);
    }
    if (null == this.RoleCapability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, RoleCapability);
    }
    if (null == this.EmpPUCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EmpPUCode);
    }
    if (null == this.SBUCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SBUCode);
    }
    if (null == this.CertificationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationCode);
    }
    if (null == this.CertificationTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationTitle);
    }
    if (null == this.Competency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Competency);
    }
    if (null == this.CertificationType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CertificationType);
    }
    if (null == this.CerttificationGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CerttificationGroup);
    }
    if (null == this.ContactBasedProgram_Y_N) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ContactBasedProgram_Y_N);
    }
    if (null == this.ExamDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ExamDate);
    }
    if (null == this.Onsite_Offshore) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Onsite_Offshore);
    }
    if (null == this.AttendanceStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AttendanceStatus);
    }
    if (null == this.Marks) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Marks);
    }
    if (null == this.Result) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Result);
    }
    if (null == this.Status1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Status1);
    }
    if (null == this.txtPlanCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, txtPlanCategory);
    }
    if (null == this.SkillID1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SkillID1);
    }
    if (null == this.Complexity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Complexity);
    }
    if (null == this.test) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.test.getTime());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(EmpNo==null?"null":"" + EmpNo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RoleCapability==null?"null":RoleCapability, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EmpPUCode==null?"null":EmpPUCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SBUCode==null?"null":SBUCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationCode==null?"null":CertificationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationTitle==null?"null":CertificationTitle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Competency==null?"null":Competency, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationType==null?"null":CertificationType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CerttificationGroup==null?"null":CerttificationGroup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ContactBasedProgram_Y_N==null?"null":ContactBasedProgram_Y_N, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ExamDate==null?"null":ExamDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Onsite_Offshore==null?"null":Onsite_Offshore, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AttendanceStatus==null?"null":AttendanceStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Marks==null?"null":"" + Marks, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Result==null?"null":Result, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Status1==null?"null":Status1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(txtPlanCategory==null?"null":txtPlanCategory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SkillID1==null?"null":"" + SkillID1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Complexity==null?"null":Complexity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(test==null?"null":"" + test, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(EmpNo==null?"null":"" + EmpNo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RoleCapability==null?"null":RoleCapability, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EmpPUCode==null?"null":EmpPUCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SBUCode==null?"null":SBUCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationCode==null?"null":CertificationCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationTitle==null?"null":CertificationTitle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Competency==null?"null":Competency, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CertificationType==null?"null":CertificationType, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CerttificationGroup==null?"null":CerttificationGroup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ContactBasedProgram_Y_N==null?"null":ContactBasedProgram_Y_N, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ExamDate==null?"null":ExamDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Onsite_Offshore==null?"null":Onsite_Offshore, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AttendanceStatus==null?"null":AttendanceStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Marks==null?"null":"" + Marks, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Result==null?"null":Result, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Status1==null?"null":Status1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(txtPlanCategory==null?"null":txtPlanCategory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SkillID1==null?"null":"" + SkillID1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Complexity==null?"null":Complexity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(test==null?"null":"" + test, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EmpNo = null; } else {
      this.EmpNo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.RoleCapability = null; } else {
      this.RoleCapability = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.EmpPUCode = null; } else {
      this.EmpPUCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SBUCode = null; } else {
      this.SBUCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationCode = null; } else {
      this.CertificationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationTitle = null; } else {
      this.CertificationTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Competency = null; } else {
      this.Competency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationType = null; } else {
      this.CertificationType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CerttificationGroup = null; } else {
      this.CerttificationGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ContactBasedProgram_Y_N = null; } else {
      this.ContactBasedProgram_Y_N = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ExamDate = null; } else {
      this.ExamDate = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Onsite_Offshore = null; } else {
      this.Onsite_Offshore = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.AttendanceStatus = null; } else {
      this.AttendanceStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Marks = null; } else {
      this.Marks = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Result = null; } else {
      this.Result = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Status1 = null; } else {
      this.Status1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.txtPlanCategory = null; } else {
      this.txtPlanCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SkillID1 = null; } else {
      this.SkillID1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Complexity = null; } else {
      this.Complexity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.test = null; } else {
      this.test = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EmpNo = null; } else {
      this.EmpNo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.RoleCapability = null; } else {
      this.RoleCapability = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.EmpPUCode = null; } else {
      this.EmpPUCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.SBUCode = null; } else {
      this.SBUCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationCode = null; } else {
      this.CertificationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationTitle = null; } else {
      this.CertificationTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Competency = null; } else {
      this.Competency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CertificationType = null; } else {
      this.CertificationType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.CerttificationGroup = null; } else {
      this.CerttificationGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ContactBasedProgram_Y_N = null; } else {
      this.ContactBasedProgram_Y_N = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ExamDate = null; } else {
      this.ExamDate = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Onsite_Offshore = null; } else {
      this.Onsite_Offshore = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.AttendanceStatus = null; } else {
      this.AttendanceStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Marks = null; } else {
      this.Marks = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Result = null; } else {
      this.Result = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Status1 = null; } else {
      this.Status1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.txtPlanCategory = null; } else {
      this.txtPlanCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SkillID1 = null; } else {
      this.SkillID1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Complexity = null; } else {
      this.Complexity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.test = null; } else {
      this.test = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    CDPCompletionStatus o = (CDPCompletionStatus) super.clone();
    o.test = (o.test != null) ? (java.sql.Date) o.test.clone() : null;
    return o;
  }

  public void clone0(CDPCompletionStatus o) throws CloneNotSupportedException {
    o.test = (o.test != null) ? (java.sql.Date) o.test.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("EmpNo", this.EmpNo);
    __sqoop$field_map.put("RoleCapability", this.RoleCapability);
    __sqoop$field_map.put("EmpPUCode", this.EmpPUCode);
    __sqoop$field_map.put("SBUCode", this.SBUCode);
    __sqoop$field_map.put("CertificationCode", this.CertificationCode);
    __sqoop$field_map.put("CertificationTitle", this.CertificationTitle);
    __sqoop$field_map.put("Competency", this.Competency);
    __sqoop$field_map.put("CertificationType", this.CertificationType);
    __sqoop$field_map.put("CerttificationGroup", this.CerttificationGroup);
    __sqoop$field_map.put("ContactBasedProgram_Y_N", this.ContactBasedProgram_Y_N);
    __sqoop$field_map.put("ExamDate", this.ExamDate);
    __sqoop$field_map.put("Onsite_Offshore", this.Onsite_Offshore);
    __sqoop$field_map.put("AttendanceStatus", this.AttendanceStatus);
    __sqoop$field_map.put("Marks", this.Marks);
    __sqoop$field_map.put("Result", this.Result);
    __sqoop$field_map.put("Status1", this.Status1);
    __sqoop$field_map.put("txtPlanCategory", this.txtPlanCategory);
    __sqoop$field_map.put("SkillID1", this.SkillID1);
    __sqoop$field_map.put("Complexity", this.Complexity);
    __sqoop$field_map.put("test", this.test);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("EmpNo", this.EmpNo);
    __sqoop$field_map.put("RoleCapability", this.RoleCapability);
    __sqoop$field_map.put("EmpPUCode", this.EmpPUCode);
    __sqoop$field_map.put("SBUCode", this.SBUCode);
    __sqoop$field_map.put("CertificationCode", this.CertificationCode);
    __sqoop$field_map.put("CertificationTitle", this.CertificationTitle);
    __sqoop$field_map.put("Competency", this.Competency);
    __sqoop$field_map.put("CertificationType", this.CertificationType);
    __sqoop$field_map.put("CerttificationGroup", this.CerttificationGroup);
    __sqoop$field_map.put("ContactBasedProgram_Y_N", this.ContactBasedProgram_Y_N);
    __sqoop$field_map.put("ExamDate", this.ExamDate);
    __sqoop$field_map.put("Onsite_Offshore", this.Onsite_Offshore);
    __sqoop$field_map.put("AttendanceStatus", this.AttendanceStatus);
    __sqoop$field_map.put("Marks", this.Marks);
    __sqoop$field_map.put("Result", this.Result);
    __sqoop$field_map.put("Status1", this.Status1);
    __sqoop$field_map.put("txtPlanCategory", this.txtPlanCategory);
    __sqoop$field_map.put("SkillID1", this.SkillID1);
    __sqoop$field_map.put("Complexity", this.Complexity);
    __sqoop$field_map.put("test", this.test);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
