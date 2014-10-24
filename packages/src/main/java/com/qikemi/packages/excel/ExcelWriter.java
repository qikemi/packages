package com.qikemi.packages.excel;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.Boolean;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.NumberFormat;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelWriter {

	public boolean writer(String targetFilePath){
		
		WritableWorkbook wwb = null;
		try {
			
			wwb = Workbook.createWorkbook(new File(targetFilePath));
			WritableSheet ws = wwb.createSheet("Test Sheet 1", 0);
			
			//1.添加Label对象 
			Label labelC = new Label(0, 0, "This is a Label cell");
			ws.addCell(labelC);
			//添加带有字型Formatting的对象 
			WritableFont wf = new WritableFont(WritableFont.TIMES, 18, WritableFont.BOLD, true);
			WritableCellFormat wcfF = new WritableCellFormat(wf);
			Label labelCF = new Label(1, 0, "This is a Label Cell", wcfF);
			ws.addCell(labelCF);
			//添加带有字体颜色Formatting的对象 
			WritableFont wfc = new WritableFont(WritableFont.ARIAL, 10, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE, jxl.format.Colour.RED); 
			WritableCellFormat wcfFC = new WritableCellFormat(wfc);
			Label labelCFC = new Label(2, 0, "This is a Label Cell", wcfFC);
			ws.addCell(labelCFC);
			//2.添加Number对象 
			Number labelN = new Number(0, 1, 3.1415926);
			ws.addCell(labelN);
			//添加带有formatting的Number对象 
			NumberFormat nf = new NumberFormat("#.##");
			WritableCellFormat wcfN = new WritableCellFormat(nf);
			Number labelNF = new Number(1, 1, 3.1415926, wcfN);
			ws.addCell(labelNF);
			//3.添加Boolean对象 
			Boolean labelB = new Boolean(0, 2, false);
			ws.addCell(labelB);
			//4.添加DateTime对象 
			DateTime labelDT = new DateTime(0, 3, new java.util.Date());
			ws.addCell(labelDT);
			//添加带有formatting的DateFormat对象 
			DateFormat df = new DateFormat("dd MM yyyy hh:mm:ss");
			WritableCellFormat wcfDF = new WritableCellFormat(df);
			DateTime labelDTF = new DateTime(1, 3, new java.util.Date(), wcfDF);
			ws.addCell(labelDTF);
			
			//写入Exel工作表 
			wwb.write();
			//关闭Excel工作薄对象 
			wwb.close();
			
			
		} catch (IOException | WriteException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return false;
	}
}
