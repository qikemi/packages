package com.qikemi.packages.alibaba.aliyun.oss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.aliyun.openservices.oss.OSSClient;
import com.aliyun.openservices.oss.model.ObjectMetadata;
import com.aliyun.openservices.oss.model.PutObjectResult;

/**
 * Object是OSS中最基本的数据单元，你可以把它简单地理解为文件<br>
 * 
 * @create date : 2014年10月28日 下午2:03:24
 * @Author XieXianbin<a.b@hotmail.com>
 * @Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ObjectService {

	public void putObject(OSSClient client, String bucketName, String key, String filePath) throws FileNotFoundException {

	    // 获取指定文件的输入流
	    File file = new File(filePath);
	    InputStream content = new FileInputStream(file);

	    // 创建上传Object的Metadata
	    ObjectMetadata meta = new ObjectMetadata();

	    // 必须设置ContentLength
	    meta.setContentLength(file.length());

	    // 上传Object.
	    PutObjectResult result = client.putObject(bucketName, key, content, meta);

	    // 打印ETag
	    System.out.println(result.getETag());
	}
}
