package week_5;

import org.junit.Test;
import test_utils.FileUtils;
import test_utils.PrintUtils;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.*;

public class Question_1_Write_Name_Color_Class_CodeTest {


    @Test
    public void testWriteToFile() throws Exception {

        Question_1_Write_Name_Color_Class_Code q1 = new Question_1_Write_Name_Color_Class_Code();

        String filename = FileUtils.uniqueFilename("name_color_class_code_write");
        
        q1.writeToFile(filename, "alice", "blue", 2545);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            ArrayList<String> data = new ArrayList<String>();

            while (((line = reader.readLine()) != null)) {
                data.add(line);
            }

            // Remove temporary file
            FileUtils.moveToTemporaryTestFolder(filename);
    
    
            ArrayList<String> expected = newArrayList("alice", "blue", "2545");

            for (String d : data) {

                for (String ex : expected) {
                    if (d.contains(ex)) {
                        expected.remove(ex);
                        break;
                    }
                }
            }
    
            // expected list should be empty.
            assertEquals("Make sure you have written all the data, one item per line" +
                    "\nMake sure you close the file when you are done writing" +
                    "\nCheck what gets written for the class code. Is it 2525?", 0, expected.size());



        } catch (IOException ioe) {
    
            FileUtils.moveToTemporaryTestFolder(filename);
    
            fail("IOException with message " + ioe.getMessage() +
                    "\nCheck your writeToFile method, make sure it's creating a file, and closing the file once the data has been written. " +
                    "\nAnd, check for any errors it might throw");

        }
        
    }

    
    @Test
    public void testPrintDataFromFile() throws Exception {

        PrintUtils.catchStandardOut();

        Question_1_Write_Name_Color_Class_Code q1 = new Question_1_Write_Name_Color_Class_Code();

        String filename = FileUtils.uniqueFilename("name_color_class_code_read");
      
        // Write example data to a test file
        FileWriter writer = new FileWriter(filename);
        writer.write("alice\nblue\n2545");
        writer.close();
    
        q1.printDataFromFile(filename);
    
        FileUtils.moveToTemporaryTestFolder(filename);
        
        String out = PrintUtils.resetStandardOut();

        assertTrue("Print your name, from the file", out.contains("alice"));
        assertTrue("Print your favorite color, from the file", out.contains("blue"));
        assertTrue("Print this class code, from the file", out.contains("2545"));
        
    }

    
    @Test
    public void testUsesTryCatchBlocks() throws Exception {

        // More accurately, check that the method doesn't declare that it throws an exception.
        
        Class Q1 = Class.forName("week_5.Question_1_Write_Name_Color_Class_Code");
        Method mWrite = Q1.getMethod("writeToFile", String.class, String.class, String.class, int.class);
        assertEquals("Add try-catch blocks to your writeToFile method. Handle any possible exceptions within the method.", 0, mWrite.getExceptionTypes().length);

        Method mRead = Q1.getMethod("printDataFromFile", String.class);
        assertEquals("Add try-catch blocks to your writeToFile method. Handle any possible exceptions within the method.", 0, mRead.getExceptionTypes().length);

        Method fileio = Q1.getMethod("fileIO");
        assertEquals("Add try-catch blocks to your file reading and writing methods. Handle any possible exceptions within the method.", 0, fileio.getExceptionTypes().length);

        Method main = Q1.getMethod("main", String[].class);
        assertEquals("Add try-catch blocks to your file reading and writing methods. Handle any possible exceptions within the method.", 0, main.getExceptionTypes().length);

    }


}