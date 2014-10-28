package com.qikemi.packages.utils;

/**
 * System UTIL 
 * @author a.b@hotmail.com xiexianbin
 *
 */
public class SystemUtil {

	private static String rootPath = null;
	
	/**
	 * GET Project Root Path 
	 * @return
	 * 		/var/opt/tomcat/../project_name/
	 */
	public static String getProjectRootPath(){
		if(rootPath == null){
			String classesPath = SystemUtil.class.getClassLoader().getResource("").getPath().replaceFirst("/", "").trim();
			// java
			if(classesPath.endsWith("build/classes/")) {
				rootPath = classesPath.replace("build/classes/", "");
			}else if(classesPath.endsWith("WEB-INF/classes/")){
				// java web 
				rootPath = classesPath.replace("WEB-INF/classes/", "");
			}
		}
		return rootPath;
	}
	
	public static void main(String[] args) {
		System.out.println(getProjectRootPath());
	}
}
