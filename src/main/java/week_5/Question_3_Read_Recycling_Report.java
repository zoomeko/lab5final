package week_5;


import java.util.ArrayList;


import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;



/**
 
 There is a file called recycling-report-main-street.txt in the root
 directory of this project.
 
 This file contains data for a much longer street. Again, the house numbers correspond to array or ArrayList indexes.
 Read it into your program, analyze the data, and then display the numbers of the house(s) that recycled the most crates?
 
 Make sure you use try-catch blocks for IOException.
 
 */
public class Question_3_Read_Recycling_Report {

    String filename = "recycling-report-main-street.txt";

    public static void main(String[] args) {

        new Question_3_Read_Recycling_Report().recyclingReport();

    }

    public void recyclingReport() {

// Read the file into

        ArrayList<String> lines = readLinesFromRecyclingDataFile(filename);

        ArrayList<Integer> crateQuantities = extractCrateQuantityData(lines);

        int max = calculateMax(crateQuantities);

        ArrayList<Integer> housesWithMax = copyIndexesToNewArrayList(crateQuantities, max);

        System.out.println("The maximum number of crates is " + max);

        System.out.println("The houses with this max number of crates is " + housesWithMax);

    }

    public ArrayList<String> readLinesFromRecyclingDataFile(String filename) {

        BufferedReader in;

        ArrayList<String> list = new ArrayList<String>();

        try {

            in = new BufferedReader(new FileReader(filename));
            // TODO read the lines of the file, given by filename, into an ArrayList.
            // Don't modify the lines. Each element in the ArrayList is one line from the file.
            // Return the ArrayList.


            String str;

            while ((str = in.readLine()) != null) {

                list.add(str);

            }

        } catch (FileNotFoundException e1) {

            System.out.println("FileNotFoundException occured..");

        } catch (IOException e) {

            System.out.println("IOException occured..");

        }

        return list;

    }

    public ArrayList<Integer> extractCrateQuantityData(ArrayList<String> lines) {


        ArrayList<Integer> cratesQuantities = new ArrayList<Integer>();

        for (String line : lines) {

            String quantity = line.split(":")[1]; // change the split character


            int quant = Integer.parseInt(quantity);

            cratesQuantities.add(quant);

        }

        return cratesQuantities;

    }

    public int calculateMax(ArrayList<Integer> crates) {
        // TODO calculate the largest value in the crates ArrayList, and return it


        int max = crates.get(0);

        for (int i = 1; i < crates.size(); i++) {

            if (crates.get(i) > max) {

                max = crates.get(i);

            }

        }

        return max;

    }

    public ArrayList<Integer> copyIndexesToNewArrayList(ArrayList<Integer> quantities, int value) {

        //TODO copy the indexes of the houses with this maximum number into a new ArrayList and return this.

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < quantities.size(); i++) {

            if (quantities.get(i) == value) {

                list.add(i);

            }

        }

        return list;

    }

}

