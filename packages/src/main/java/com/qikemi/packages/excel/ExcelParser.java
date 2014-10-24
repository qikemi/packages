package com.qikemi.packages.excel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.CellType;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelParser {

	public List<Member> parse(String excelPath) {
		// 工作表 
		Workbook workbook = null;
		// 所有表单 
		Sheet[] allSheets;
		// 单元格 
		Cell cell = null;
		// 获取sheet的总列数 
		int columns = 0;
		// 获取Sheet的总行数 
		int raws = 0;
		// 存储数据的List集合 
		List<Member> targerList = new ArrayList<Member>();
		// 
		Member member = null;
		
		try {
			// 通过Workbook的静态方法getWorkbook选取Excel文件
			workbook = Workbook.getWorkbook(new File(excelPath));
			// 通过Workbook的getSheet方法选择第一个工作簿（从0开始）
			allSheets = workbook.getSheets();
			// 遍历表单 
			for(Sheet sheet : allSheets){
				// 获取sheet的总列数 
				columns = sheet.getColumns();
				// 获取Sheet的总行数
				raws = sheet.getRows();
				
				for(int r=0; r<raws; r++){
					member = new Member();
					// 获取某一行的所有单元格，返回的是单元格对象数组
					Cell[] cellRaws = sheet.getRow(r);
					
					// 通过Sheet方法的getCell方法选择位置为C2的单元格（两个参数都从0开始）
					cell = sheet.getCell(0, r); // id
					if (cell.getType() == CellType.NUMBER) {
						NumberCell nc = (NumberCell) cell;
						member.setId((int) nc.getValue());
					}
					cell = sheet.getCell(1, r); // name
					member.setName(cell.getContents().toString());
					cell = sheet.getCell(2, r); // address
					member.setAddress(cell.getContents().toString());
					cell = sheet.getCell(3, r); // tel
					member.setTel(cell.getContents().toString());
					targerList.add(member);
				}
			}
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭workbook以释放资源 
			workbook.close();
		}
		return targerList;
	}
}
