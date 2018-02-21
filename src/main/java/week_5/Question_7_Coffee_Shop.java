package week_5;




/**
 *
 *
 Write a program that creates a sales report for a coffee shop.
 The coffee shop will use this at the end of every day to calculate sales, expenses, and profit.

 The coffee shop sells 12 different drinks. The name of each drink, the price the shop
 charges the customer, and how much it costs to make each drink, are saved in the file
 coffee_price_data.txt. It's in the root directory of this project.

 The data is in the format

 name;cost to make;price charged

 As in this example,

 Cappuccino;1.56;3.50

 So the cappuccino drink costs the coffee shop $1.56 to make, and they charge the customer $3.50.

 The file coffee_sales_data.txt contains the sales data for one day. This file is in the format

 name;number sold

 As in this example,

 Cappuccino;100

 The coffee shop sold 100 cappuccino drinks.


 Your program should read this data from coffee_price_data.txt, and coffee_sales_data.txt, and
 store it all in some kind of data structure.

 You should deal with any file-related exceptions properly.

 Once you have gathered all the data, generate a report that will be written out to a new file called
 daily_sales_report.txt. For each drink, record the number of drinks sold, the total that it cost to
 make the total quantity of those drinks (expenses), and the total amount (revenue) spent by
 customers on that drink.

 So, for example, if the coffee shop sold 100 cappuccinos today, you'll write a line that says

 Cappuccino: Sold 100, Expenses $150.60, Revenue $350.00, Profit $190.40

 You may wish to use this String formatting template,

 "%s: Sold %d, Expenses $%.2f, Revenue $%.2f, Profit $%.2f"


 And a similar line for each of the drinks. The autograder is looking for this exact format.

 At the bottom of the file, write the total expenses, total revenue, and total profit for all drinks,
 for example, like this,

 All Drinks: Sold 1000, Expenses $1000, Revenue $2500, Profit $1500

 You should use try-with-resources exception handling for both file reading, and file writing.

 Use methods to organize your code. The autograder will call the salesReport() method, and will examine
 the output file your program creates.   The instructor will assess the quality of your code and solution.

 You should probably write some extra helper methods for the subtasks of this problem.

 Optional: write unit tests for your helper methods. Ask if you need help.

 Test and comment your code.

 */

public class Question_7_Coffee_Shop {

    static String reportLineTemplate = "%s: Sold %d, Expenses $%.2f, Revenue $%.2f, Profit $%.2f";


    public static void main(String[] args) {
        Question_7_Coffee_Shop q7 = new Question_7_Coffee_Shop();
        q7.salesReport();
    }



    String price_data_file = "coffee_price_data.txt";
    String sales_data_file = "coffee_sales_data.txt";

    String output_report_file = "daily_sales_report.txt";

    public void salesReport() {

        // Suggested outline of program. You can use any data structure you like.
        // You may need to combine more than one type of data structure.

        // readCoffeeDataFiles and writeReportFile may get quite long and complex. So,
        // it is likely you will need to add some more helper methods that readCoffeeDataFiles
        // and writeReportFile will call.

        // Replace 'Object' with the data type of the data structure you use.

        Object allDrinkData = readCoffeeDataFiles(price_data_file, sales_data_file);
        // TODO replace Object with the type of your data structure


        writeReportFile(allDrinkData, output_report_file);

    }


    // Don't change the name, arguments, or purpose of this method. You should change the return type.
    // The test expects it to be in your code, and have the behavior defined in the requirements.
    public Object readCoffeeDataFiles(String dataFile, String salesFile) {

        // TODO read in the data from the files, organize it into a data structure, and return it.
        // TODO change the return type of this method to the type of your data structure.

        // You can call other methods from this method to help write the file.

        return null;



    }

    // Don't change the name, return type, or purpose of this method.
    // You should change the first argument to the data structure you decide to use
    // The test expects it to be in your code, and have the behavior defined in the requirements.
    public void writeReportFile(Object drinkData, String filename) {

        // TODO finish this method.
        // TODO change the first argument to the data type of your data structure.

        // You may find the reportLineTemplate String (a global variable) useful,
        // the tests expect the output to follow that format.

        // You can call other methods from this method to help write the file.


    }


}
