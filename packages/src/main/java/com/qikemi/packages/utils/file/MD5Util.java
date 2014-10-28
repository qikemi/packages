package com.qikemi.packages.utils.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

import org.apache.log4j.Logger;

/**
 * 获取指定文件的MD5值<br>
 * 校检文件的完整性<br>
 * 
 * @create date : 2014年10月28日 下午2:51:52
 * @Author XieXianbin<a.b@hotmail.com>
 * @Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class MD5Util {

	private static Logger logger = Logger.getLogger(MD5Util.class);
	
	/**
	 * 获取指定文件的MD5
	 * @param file
	 * @return
	 */
	public static String getFileMd5 (File file) {
		String value = null;
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			MappedByteBuffer byteBuffer = in.getChannel().map(
					FileChannel.MapMode.READ_ONLY, 0, file.length());
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(byteBuffer);
			BigInteger bi = new BigInteger(1, md5.digest());
			value = bi.toString(16);
		} catch (Exception e) {
			logger.error("--> Exception: " + e.getMessage());
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					logger.error("--> IOException: " + e.getMessage());
				}
			}
		}
		return value.toUpperCase();
	}
	
	/**
	 * 获取指定文件的MD5<br>
	 * 
	 * @param pathname
	 * @return
	 */
	public static String getFileMd5(String pathname) {
		return getFileMd5(new File(pathname));
	}
	
}
