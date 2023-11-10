package Test_POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Data_Reading 
{

	public static void main(String[] args) throws  IOException
	
	{

		
		
		XSSFWorkbook workbook=null;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;// = null;
		

		File f1=new File("C:\\Users\\vilas\\OneDrive\\Desktop\\test.xlsx");
		FileInputStream fis= new FileInputStream(f1);
		
		workbook=new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		
		int totalrow= sheet.getLastRowNum();
		
		int totalcol= sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<totalrow;i++)
		{
			for(int j=0;j<totalcol;j++)
			{
			 System.out.print(sheet.getRow(i).getCell(j).toString());
			
			 System.out.print("\t");
			}
			System.out.println();
		}
	}

}
