package ExcelDataprovider;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelUSingdataFormatter {
    private XSSFWorkbook wb;
    private XSSFSheet sheet;

    public ExcelUSingdataFormatter() throws IOException {
        FileInputStream file = new FileInputStream(new File("/Users/poonamsharma/eclipse-workspace/MobileHybridDataDriven/Testdata/Mobile.xlsx"));
        wb = new XSSFWorkbook(file);
        sheet = wb.getSheetAt(0);
    }

    public List<String[]> getStringData() {
        DataFormatter dd = new DataFormatter();
        List<String[]> data = new ArrayList<>();

        for (Row row : sheet) {
            String[] rowData = new String[row.getLastCellNum()];
            for (int colIndex = 0; colIndex < row.getLastCellNum(); colIndex++) {
                Cell cell = row.getCell(colIndex);
                rowData[colIndex] = dd.formatCellValue(cell);
            }
            data.add(rowData);
        }
        return data;
    }

//    public void setStringData(List<String[]> newData) throws IOException {
//        int rowCount = sheet.getLastRowNum();
//
//        for (String[] rowData : newData) {
//            Row row = sheet.createRow(rowCount + 1); // Start from the next row
//            for (int colIndex = 0; colIndex < rowData.length; colIndex++) {
//                Cell cell = row.createCell(colIndex);
//                cell.setCellValue(rowData[colIndex]);
//            }
//            rowCount++;
//        }

//        try {
//            // Write changes back to the Excel file
//            FileOutputStream fileOut = new FileOutputStream("Users/poonamsharma/eclipse-workspace/MobileHybridDataDriven/Testdata/Mobile.xlsx");
//            wb.write(fileOut);
//            fileOut.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
