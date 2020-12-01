package com.infosys.capstone;


import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Job;

public class Extract {
    public static class TransformMapper extends Mapper<LongWritable,Text,NullWritable,Text>
    
    {
                        
        public void map(LongWritable key,Text value,Context context)
        throws IOException, InterruptedException 
    {
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
	            String extract = tokens[0]+","+tokens[1]+","+tokens[2]+","+tokens[4]+","+tokens[5]+","+tokens[14];
	            context.write(NullWritable.get(),new Text(extract.replace("$", ",")));
			} else {
				String[] tokens = value.toString().split(",");
	            String extract = tokens[0]+","+tokens[1]+","+tokens[2]+","+tokens[4]+","+tokens[5]+","+tokens[14];
	            context.write(NullWritable.get(),new Text(extract)); 
			}
        }
    }
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = new Job(conf,"MyCSV job");    
        job.setJarByClass(Extract.class);
        job.setJobName("CSV creation");
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        job.setMapperClass(TransformMapper.class);

        job.setNumReduceTasks(0);
        job.setOutputKeyClass(NullWritable.class);
        job.setOutputValueClass(Text.class);
        
        System.exit(job.waitForCompletion(true) ? 0 : 1);
        }
}
