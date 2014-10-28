package com.qikemi.packages.junit.objectUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.qikemi.packages.utils.validate.ObjectValidateUtil;

public class ObjectValidateUtilJunit {

	@Test
	public void t1(){
//		System.out.println(ObjectUtil.isEmpty(null));
//		System.out.println(ObjectUtil.isEmpty(""));
//		System.out.println(ObjectUtil.isEmpty(new String[]{""}));
//		List<Object> o = new ArrayList<Object>();
//		o.add(1);
//		System.out.println(ObjectUtil.isEmpty(o));
//		Map<Object, Object> map = new HashMap<Object, Object>();
//		map.put("a", new String[]{});
//		System.out.println(ObjectValidateUtil.isEmpty(map));
		Set<Object> set = new HashSet<Object>();
		set.add("s");
		System.out.println(ObjectValidateUtil.isEmpty(set));
		
		
		
	}
}
