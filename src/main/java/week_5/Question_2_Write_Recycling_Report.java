package week_5;



/**
 *
 Start with your recycling truck program from last time.
 Add code so that it writes the data as a report to a file.
 The report file should look like this example.
 Note that it should use "crate" for 1 crate, "crates" otherwise.
 

 House 0 recycled 1 crate
 House 1 recycled 2 crates
 House 2 recycled 1 crate
 House 3 recycled 2 crates
 House 4 recycled 3 crates
 House 5 recycled 3 crates
 House 6 recycled 2 crates
 House 7 recycled 1 crate
 Total crates recycled: 15
 
 
 Add try-catch blocks for IOException.  The try-with-resources version is recommended.

 */
public class Question_2_Write_Recycling_Report {


    public String filename = "recycling_report.txt";

    // TODO you can add your methods from the recycling truck program you wrote last lab


    public static void main(String[] args) {
        new Question_2_Write_Recycling_Report().recycling();
    }

    public void recycling() {

        int numberOfHouses = 8;

        int[] cratesPerHouse = getRecyclingPerHouse(numberOfHouses);

        int totalCrates = calculateTotal(cratesPerHouse);

        int maxCrates = calculateMax(cratesPerHouse);

        int minCrates = calculateMin(cratesPerHouse);

        int houseWithMostRecycling = calculateHouseWithMostRecycling(cratesPerHouse);

        System.out.println("Total crates from all houses = " + totalCrates);
        System.out.println("Max crates at any house = " + maxCrates);
        System.out.println("Min crates at any house = " + minCrates);
        System.out.println("House with most recycling = " + houseWithMostRecycling);

        writeReport(cratesPerHouse, totalCrates, filename);

    }


    // Ask user for number of crates for each house. Store in array and return this array.
    public int[] getRecyclingPerHouse(int houses) {

        // TODO ask user for input.
        return null;  // Replace with your code
    }

    //Add up all of the numbers in the array and return that
    public int calculateTotal(int[] cratesPerHouse) {

        // TODO calculate and return the total.
        return 0;   // Replace with your code
    }

    //Which is the largest number in the array?
    public int calculateMax(int[] cratesPerHouse) {

        // TODO identify the largest number in the array.
        return 0; // Replace with your code
    }

    //Which is the smallest number in the array?
    public int calculateMin(int[] cratesPerHouse) {

        // TODO identify the smallest number
        return 0; // Replace with your code
    }

    //Use the array to figure out which house number - or array element number - has the most recycling
    public int calculateHouseWithMostRecycling(int[] cratesPerHouse) {

        // TODO which house had the most recycling? If more than one house
        // had the max number, return either house number.

        return 0; // Replace with your code
    }

    public void writeReport(int[] cratesPerHouse, int totalCrates, String filename) {

        // TODO write report to file with the name in the filename variable.
        
        /* Your lines should look exactly like this
        
        House 0 recycled 1 crate
        House 1 recycled 2 crates
        
        and the last in the file should look like this
        
        Total crates recycled: 15
 
        The grader is looking for this exact format.
 
        */

        // TODO you could write a new method to generate one line, e.g. "House 0 recycled 1 crate" to write to the file

    }


}