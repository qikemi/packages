package com.qikemi.packages.junit.alibaba.aliyun.oss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.aliyun.openservices.oss.OSSClient;
import com.aliyun.openservices.oss.model.Bucket;
import com.aliyun.openservices.oss.model.ObjectListing;
import com.aliyun.openservices.oss.model.PutObjectResult;
import com.qikemi.packages.alibaba.aliyun.oss.BucketService;
import com.qikemi.packages.alibaba.aliyun.oss.OSSClientFactory;
import com.qikemi.packages.alibaba.aliyun.oss.ObjectService;

public class OSSJunit {

	@Test
	public void t1(){
		OSSClient client = OSSClientFactory.createOSSClient();
		
//		Bucket bucket = BucketService.create(client, "bucketmy-bucket-nameamesdfswers");
		
//		try {
//			PutObjectResult result = ObjectService.putObject(client, bucket.getName(), "jar/mysql-connector-java-5.1.33.jar", "D://mysql-connector-java-5.1.33.jar");
//			// 4F472D3ADF434264A7DDD2C8EE2B480A
//			// 4F472D3ADF434264A7DDD2C8EE2B480A
//			System.out.println(result.getETag());
//			
//			
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		ObjectListing listObject = ObjectService.listObject(client, "bucketmy-bucket-nameamesdfswers", null, "jar");
		
//		try {
//			ObjectService.getObject(client, "bucketmy-bucket-nameamesdfswers", "mysql-connector-java-5.1.33.jar");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		String path = "D://mysql-connector-java-5.1.33.jar";
		try {
			InputStream inputStream = new FileInputStream(new File(path));
			
			System.out.println(inputStream);
			
		} catch (FileNotFoundException e) {
		}
		
	}
	
}
