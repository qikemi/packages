package com.qikemi.packages.junit.excel;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.qikemi.packages.excel.ExcelWriter;
import com.qikemi.packages.excel.Member;

public class ExlTest {

//	@Test
//	public void t1(){
//		
//		ExcelParser ep = new ExcelParser();
//		
//		List<Member> members = ep.parse("E://member.xls");
//		
//		for(Member m : members){
//			System.out.println(m.getId() + "-" + m.getName() + "-" + m.getAddress() + "-" + m.getTel());
//		}
//		
//	}
	
	@Test
	public void t2(){
		List<Member> members = new ArrayList<Member>();
		members.add(new Member(1, "name1", "中国", "12345"));
		members.add(new Member(2, "name1", "中国", "12345"));
		members.add(new Member(3, "name1", "中国", "12345"));
		members.add(new Member(4, "name1", "中国", "12345"));
		
		ExcelWriter excelWriter = new ExcelWriter();
		
		excelWriter.writer("a.xls");
		
	}
}
