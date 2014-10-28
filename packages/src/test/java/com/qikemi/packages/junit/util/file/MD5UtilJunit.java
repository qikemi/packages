package com.qikemi.packages.junit.util.file;

import org.junit.Test;

import com.qikemi.packages.utils.file.MD5Util;

public class MD5UtilJunit {

	@Test
	public void t1(){
		String md5 = MD5Util.getFileMd5("D://mysql-connector-java-5.1.33.jar");
		System.out.println(md5);
	}
}
