package week_5;

import org.junit.Test;
import test_utils.ArrayListUtils;
import test_utils.FileUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by clara on 8/3/17.
 */
public class Question_3_Read_Recycling_ReportTest {
    
    @Test
    public void readRecyclingFile() throws Exception {
    
        String filename = FileUtils.uniqueFilename("q3");
    
        try {
           
            // Write some example data to a temporary file
            ArrayList<String> examples = ArrayListUtils.newStringArrayList("House 0 recycled 2 crates", "House 1 recycled 4 crates", "House 2 recycled 0 crates");
    
            FileWriter writer = new FileWriter(filename);
            for (String line : examples) {
                writer.write(line + "\n");
            }
            writer.close();
    
    
            Question_3_Read_Recycling_Report q3 = new Question_3_Read_Recycling_Report();
            ArrayList<String> dataReadFromFile = q3.readLinesFromRecyclingDataFile(filename);
            
            FileUtils.moveToTemporaryTestFolder(filename);
            
            assertTrue("Read in each line from the file, and add each line to an ArrayList. Don't modify the lines",
                    ArrayListUtils.stringArrayListEqual(examples, dataReadFromFile));
            
            
        }
        
        catch (IOException e) {
            FileUtils.moveToTemporaryTestFolder(filename);
        }
                
        
    }
    
    
    @Test
    public void extractCrateData() throws Exception {
    
        ArrayList<String> examples = ArrayListUtils.newStringArrayList("House 0 recycled 2 crates", "House 1 recycled 4 crates", "House 2 recycled 0 crates");
    
        ArrayList<Integer> expectedCrates = ArrayListUtils.newIntegerArrayList(2, 4, 0);
        
        Question_3_Read_Recycling_Report q3 = new Question_3_Read_Recycling_Report();
        
        ArrayList<Integer> crateData = q3.extractCrateQuantityData(examples);
        
        assertTrue("Extract the number of crates from each String, convert to an integer, and add to a new ArrayList.",
                ArrayListUtils.intArrayListEqual(expectedCrates, crateData));
    
    
    }
    
    @Test
    public void calculateMax() throws Exception {
    
        Question_3_Read_Recycling_Report q3 = new Question_3_Read_Recycling_Report();
    
        ArrayList<Integer> exampleCrates = ArrayListUtils.newIntegerArrayList(2, 4, 0);
        assertEquals("Verify calculateMax returns the highest number in the ArrayList", q3.calculateMax(exampleCrates), 4);
        
        exampleCrates = ArrayListUtils.newIntegerArrayList(2, 4, 0, 6, 5, 2, 6, 0);
        assertEquals("Verify calculateMax returns the highest number in the ArrayList", q3.calculateMax(exampleCrates), 6);
        
        exampleCrates = ArrayListUtils.newIntegerArrayList(-2, -4, -6);
        assertEquals("Verify calculateMax returns the highest number in the ArrayList. Make your code as general as possible - what if the ArrayList is all negative numbers?", q3.calculateMax(exampleCrates), -2);
    
    
    }
    
    
    @Test
    public void calculateMaxHouses() throws Exception {
    
        Question_3_Read_Recycling_Report q3 = new Question_3_Read_Recycling_Report();
        
        ArrayList<Integer> exampleCrates = ArrayListUtils.newIntegerArrayList(2, 4, 0, 6, 5, 2, 6, 0);
    
        // Elements 3 and 6 have the maximum value of 6
        ArrayList<Integer> exampleMaxHouses = ArrayListUtils.newIntegerArrayList(3, 6);
        
        ArrayList<Integer> maxHouses = q3.copyIndexesToNewArrayList(exampleCrates, 6);
    
        assertTrue("For a list of crates " + exampleCrates + " copying indexes of every " + 6 + ", the indexes " + exampleMaxHouses + " should be copied. The values copied were " + maxHouses ,
                ArrayListUtils.intArrayListEqual(exampleMaxHouses, maxHouses));
    
    
        // Another example
        
        exampleCrates = ArrayListUtils.newIntegerArrayList(2, 4, 10, 6, 0);
    
        // Element 2 has the maximum value of 10
        exampleMaxHouses = ArrayListUtils.newIntegerArrayList(2);
    
        maxHouses = q3.copyIndexesToNewArrayList(exampleCrates, 10);
    
        assertTrue("For a list of crates " + exampleCrates + " copying indexes of every " + 10 + ", the indexes " + exampleMaxHouses + " should be copied. The values copied were " + maxHouses ,
                ArrayListUtils.intArrayListEqual(exampleMaxHouses, maxHouses));
    
    
        // Another example: copyIndexesToNewArrayList is general and doesn't have to operate on the max value in the ArrayList.
    
        exampleCrates = ArrayListUtils.newIntegerArrayList(2, 4, 10, 6, -2, 4, 0);
        
        exampleMaxHouses = ArrayListUtils.newIntegerArrayList(1, 5);
    
        maxHouses = q3.copyIndexesToNewArrayList(exampleCrates, 4);
    
        assertTrue("For a list of crates " + exampleCrates + " copying indexes of every " + 4 + ", the indexes " + exampleMaxHouses + " should be copied. The values copied were " + maxHouses ,
                ArrayListUtils.intArrayListEqual(exampleMaxHouses, maxHouses));
        
    
    }
    
    
    @Test
    public void testUsesTryCatchBlocks() throws Exception {
        
        Class q3 = Class.forName("week_5.Question_3_Read_Recycling_Report");
        Method mWrite = q3.getMethod("readLinesFromRecyclingDataFile", String.class);
        assertEquals("Add try-catch blocks to your writeToFile method. Handle any possible exceptions within the method.", 0, mWrite.getExceptionTypes().length);
        
        
    }
    
    
    
}