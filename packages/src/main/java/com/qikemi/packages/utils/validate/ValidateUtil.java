package com.qikemi.packages.utils.validate;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 所有类型的工具类，如判空或Null等 
 * 
 * @create date : 2014年10月28日 上午9:11:58
 * @Author XieXianbin<a.b@hotmail.com>
 * @Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class ValidateUtil {

	/**
	 * 判断所传的类型是否为空或为Null
	 * @return
	 */
	public static boolean isEmpty(Object object){
		
		if(null == object){
			return true;
		}
		
		if(object instanceof String){
			return "".equals(object);
		}
		if(object instanceof String[]){
			return 0 == ((String[])object).length;
		}
		if(object instanceof List<?>){
			return 0 == ((List<?>)object).size();
		}
		if(object instanceof Map<?, ?>){
			return 0 == ((Map<?, ?>)object).size();
		}
		if(object instanceof Set<?>){
			return 0 == ((Set<?>)object).size();
		}
		
		return false;
	}
}
