package ExcelDataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	XSSFWorkbook wb ;
	
	public Excel() {
		File src = new File("/Users/poonamsharma/eclipse-workspace/MobileHybridDataDriven/Testdata/Mobile.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		 } catch (FileNotFoundException e) {
		        e.printStackTrace();
		        System.err.println("File not found: " + src.getAbsolutePath());
		    } catch (IOException e) {
		        e.printStackTrace();
		        System.err.println("Error reading file: " + src.getAbsolutePath());
		    } catch (Exception e) {
		        e.printStackTrace();
		        System.err.println("Unknown error while initializing XSSFWorkbook");
		    }
	}
	

public String getStringData(int sheetindex, int row, int cell ) {
//	if (wb == null) {
//        System.err.println("Workbook (wb) is not properly initialized.");
//        return null;
//    }
  //  System.err.println("Workbook (wb) is not properly initialized.");
	//return wb.getSheetAt(sheetindex).getRow(row).getCell(cell).getStringCellValue();
	try {
        // Get the cell at the specified row and column
        XSSFCell cellValue = wb.getSheetAt(sheetindex).getRow(row).getCell(cell);

        // Check the cell type before retrieving its value
        if (cellValue.getCellType() == CellType.STRING) {
            return cellValue.getStringCellValue();
        } else if (cellValue.getCellType() == CellType.NUMERIC) {
            if (DateUtil.isCellDateFormatted(cellValue)) {
                // Handle date cells
                return cellValue.getDateCellValue().toString();
          } else {
             // Handle numeric values other than dates
             return String.valueOf(cellValue.getNumericCellValue());
         }
        }
      else {
            // Handle other cell types if needed
            return ""; // Return an empty string for other types
        }
    } catch (Exception e) {
        e.printStackTrace();
       
}
	return "";
}	

}
