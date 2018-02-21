package week_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import test_utils.FileUtils;

import java.io.*;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by clara on 8/3/17.
 */
public class Question_7_Coffee_ShopTest {
    
    
    String testPriceFilename;
    String testSalesFilename;
    String testOutputFile;
    
    
    @Before
    public void createFilenames() {
        testPriceFilename = FileUtils.uniqueFilename("temporary_file_for_testing_test_price_data");
        testSalesFilename = FileUtils.uniqueFilename("temporary_file_for_testing_test_sales_data.txt");
        testOutputFile = FileUtils.uniqueFilename("temporary_file_for_testing_report.txt");
    }
    
    
    @Test
    public void salesReport() throws Exception {
        
        Question_7_Coffee_Shop q7 = new Question_7_Coffee_Shop();
        
        String originalReportFilename = q7.output_report_file;
        
        //Create some example input files
        
        String priceData = "Coke;0.1;2\n" +
                "Sprite;0.2;2.50";
        
        String salesData = "Coke:4\n" +
                "Sprite:7";
        
        FileWriter writer = new FileWriter(testPriceFilename);
        writer.write(priceData);
        writer.close();
        
        writer = new FileWriter(testSalesFilename);
        writer.write(salesData);
        writer.close();
        
        
        // Replace the original filenames with these testing files
        
        q7.output_report_file = testOutputFile;
        q7.sales_data_file = testSalesFilename;
        q7.price_data_file = testPriceFilename;
        
        // Contents of expected sales report, based on the data above
        
        String expectedSalesReport =
                "Coke: Sold 4, Expenses $0.40, Revenue $8.00, Profit $7.60\n" +
                "Sprite: Sold 7, Expenses $1.40, Revenue $17.50, Profit $16.10\n" +
                "All Drinks: Sold 13, Expenses $1.80, Revenue $25.50, Profit $23.70";
        
        
        q7.salesReport();
        
        // Read the file and compare to expectedSalesReport
        
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(q7.output_report_file));
            
            StringBuilder builder = new StringBuilder();
            
            String line = reader.readLine();
            while (line != null) {
                
                builder.append(line);
                builder.append("\n");
                
                line = reader.readLine();
            }
            
            String data = builder.toString().trim().replace("\r", "");  // remove trailing white space and Windows '\r' characters
            
            reader.close();
            
            assertEquals("Make sure you write the data in the exact format requested, and verify your math is correct.", expectedSalesReport, data);
            
        } catch (FileNotFoundException f) {
            
            fail("Write the report to a file called " + originalReportFilename + ". Use the variable output_report_file for the file name.");
        }
        
    }
    
    
    @Test
    public void checkMethodDoesNotThrowException() throws Exception {
        //Verify readCoffeeDataFiles and writeReportFile do not throw exceptions
        
        // TODO verify try-with-resources is used.
        
        Class q7 = Class.forName("week_5.Question_7_Coffee_Shop");
        
        Method mRead = q7.getMethod("readCoffeeDataFiles", String.class, String.class);
        assertEquals("Add try-catch blocks to your readCoffeeDataFiles method. Handle any possible exceptions with try-catch statements within the method.", 0, mRead.getExceptionTypes().length);
        
        
        // since the return type has changed, have to search the methods in the class, instead of being able to specify a particular method.
        Method[] allMethods = q7.getMethods();
        for (Method m : allMethods) {
            if (m.getName().equals("writeReportFile")) {
                assertEquals("Add try-catch blocks to your writeReportFile method. " +
                        "Handle any possible exceptions with try-catch statements within the method.", 0, m.getExceptionTypes().length);
                
            }
        }
        
    }
    
    
    // Since the implementation of the code is mostly up to you, it's impossible for me to write any more
    // detailed tests. Maybe you could write some tests for your methods?
    
    
    @After
    public void cleanupFiles() {
        
        // Move temporary files used for the tests.
        
        FileUtils.moveToTemporaryTestFolder(testOutputFile);
        FileUtils.moveToTemporaryTestFolder(testPriceFilename);
        FileUtils.moveToTemporaryTestFolder(testSalesFilename);
        
    }
    
    
    
}

