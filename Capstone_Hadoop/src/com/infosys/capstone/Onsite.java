package com.infosys.capstone;

import java.io.IOException;
import java.util.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;

public class Onsite {
    public static class Map extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {        
        public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
        	if (value.toString().contains("\"")) {
        		char[] s = value.toString().toCharArray();
        		for (int i = 0; i < s.length; i++) {
        			if (s[i] == '\"') {
        				System.out.println(i);
        				for (i++;i<s.length;i++) {
        					if (s[i] == ',') {
        						s[i] = '$';
        					}
        					if (s[i] == '\"') {
        						break;
        					}
        				}
        			}
        		}
        		String[] tokens = new String(s).split(",");
	            output.collect(new Text(tokens[11]),new IntWritable(1));
			} else {
				String[] tokens = value.toString().split(",");
	            output.collect(new Text(tokens[11]),new IntWritable(1));
			}
        }
      }

      public static class Reduce extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {
        public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
          int sum = 0;
          while (values.hasNext()) {
            sum += values.next().get();
          }
          output.collect(key, new IntWritable(sum));
        }
      }

      public static void main(String[] args) throws Exception {
        JobConf conf = new JobConf(Onsite.class);
        conf.setJobName("no of attempts");

        conf.setOutputKeyClass(Text.class);
        conf.setOutputValueClass(IntWritable.class);

        conf.setMapperClass(Map.class);
        conf.setReducerClass(Reduce.class);

        conf.setInputFormat(TextInputFormat.class);
        conf.setOutputFormat(TextOutputFormat.class);

        FileInputFormat.setInputPaths(conf, new Path(args[0]));
        FileOutputFormat.setOutputPath(conf, new Path(args[1]));

        JobClient.runJob(conf);
      }
}
