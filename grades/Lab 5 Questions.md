# Lab 5

### Question 1 

Write a program that uses the buffered classes to write out your name, your favorite color, and this class's code (2545) to a new file.   
Write one item per line.

Now, read in all of the data, line by line, and display it.

Add try-catch blocks for IOException to the writing code, and the reading code. Recommended to use the try-with-resources version.

### Question 2 Write Recycling Report
    
Start with your recycling truck program from last week. Add code so that it writes the data as a report to a file. The report file will look something like this example,
N
ote that it should use "crate" for 1 crate, "crates" otherwise.
 
```
House 0 recycled 1 crate
House 1 recycled 2 crates
House 2 recycled 1 crate
House 3 recycled 2 crates
House 4 recycled 3 crates
House 5 recycled 3 crates
House 6 recycled 2 crates
House 7 recycled 1 crate

Total crates recycled: 15

```

Use try-catch blocks for IOException. The try-with-resources version is recommended.


### Question 3 Read Recycling Report


There is a file called recycling-report-main-street.txt in the root 
 directory of this project. 
 
 This file contains data for a much longer street. Again, the house numbers correspond to array or ArrayList indexes.
 Read it into your program, analyze the data, and then display the numbers of the house(s) that recycled the most crates?
 
 Make sure you use try-catch blocks for IOException.
 

### Question 4 Exception Handling

 Java doesn't make you deal with possible NullPointerException,or ArrayIndexOutOfBoundsException in your code.
 If these exceptions happen, and are not caught, your code crashes.
 NullPointerException, ArrayIndexOutOfBoundsException, and several other exceptions, are called unchecked exceptions.
 
 It's possible to add try-catch blocks for NullPointerException, and other unchecked exceptions.
 You can also declare that a method throws NullPointerException.
 
 But, Java insists that you deal with IOException – which is a checked exception - in some way.
 The compiler checks that you have indeed done something about code that can throw IOException.
 You either have to surround your file IO code with a try-catch block, or declare that the method throws IOException.
 If your method throws IOException, then a method that calls this method also has to add a try-catch block, or declare that it also throws IOException.
 
 There are other checked exceptions, for example SQLException, which you'll see when we work with databases.
 
 Java's decision to implement two types of exceptions (checked and unchecked) is unusual.
 Other languages like C#, Python, JavaScript... have exceptions, but it's always up to you how to deal with them.
 You are never required to add try-catch blocks or declare that a method throws a particular exception;
 the responsibility is left to the programmer to implement whatever exception/error handling mechanism is appropriate.

 Questions:
 
 Considering many other languages don't require you to deal with exceptions,
 think about why Java does make you deal with at least some.
 
 1. List at least 1 benefit of checked exceptions
 2. List at least 2 negative consequences of checked exceptions
 3. What is your opinion on Java's decision to use checked exceptions?
 
 Usually, it's better to anticipate and try to prevent errors. Almost all unchecked exceptions can be
 prevented (in theory) by careful programming.  And many checked exceptions can also be prevented with careful coding.
 
 It's more common for programmers to try to prevent unchecked exceptions (e.g. NullPointerException)
 than to write a try-catch block for code that may throw that type of exception.
 
 4. For unchecked exceptions, why is it usually better to anticipate and avoid errors when possible,
 instead of using try-catch blocks? At least 2 reasons.
 
 Questions on this subject are common in Java job interviews!

### Question 5 Fix Code with Exception Handling

 This program has two example methods. Both throw exceptions when you run the code.
 
 Fix by adding a try-catch block in each method.  Don't modify any of the existing code. Here, you will be adding new code.
 
 For the printLanguageList method, add try-catch statements. 
 In the catch block, print a message that the LinkedList is empty. You don't need to do anything else, just let the method return.
 
 For the wordCount method, add try-catch statements so the NullPointerException thrown when the list is empty, is caught.
 In the catch block, return 0. So if the sentence is null, your method will return 0.
 
 
### Question 6 Fix Loop, No Exception Handling

 
This question uses the same code as Question 5 in Question_5_Add_Exception_Handling.java

Instead of waiting for an exception and catching it, it is usually better to try and prevent problems.

Can you think of a better way to stop this code crashing?
 
Modify the printLanguageList and wordCount methods so that both methods work correctly without using a try-catch statements.


### Question 7 Coffee Shop

 Write a program that creates a sales report for a coffee shop.
 The coffee shop will use this at the end of every day to calculate sales, expenses, and profit.
 
 The coffee shop sells 12 different drinks. The name of each drink, the price the shop
 charges the customer, and how much it costs to make each drink, are saved in the file
 coffee_price_data.txt. It's in the root directory of this project.
 
 The data is in the format
 
 `
 name;cost to make;price charged
 `
 
 As in this example,
 
 `
 Cappuccino;1.56;3.50
 `
 
 So the cappuccino drink costs the coffee shop $1.56 to make, and they charge the customer $3.50.
 
 The file coffee_sales_data.txt contains the sales data for one day. This file is in the format
 
 `
 name;number sold
 `
 
 As in this example,
 
 `
 Cappuccino;100
 `
 
 Which means that the coffee shop sold 100 cappuccino drinks.
 
 
 Your program should read this data from coffee_price_data.txt, and coffee_sales_data.txt, and
 store it all in some kind of data structure.
 
 You should deal with any file-related exceptions properly.
 
 Once you have gathered all the data, generate a report that will be written out to a new file called
 daily_sales_report.txt. For each drink, record the number of drinks sold, the total that it cost to
 make the total quantity of those drinks (expenses), and the total amount (revenue) spent by
 customers on that drink.
 
 So, for example, if the coffee shop sold 100 cappuccinos today, you'll write a line that says
 
 `
 Cappuccino: Sold 100, Expenses $150.60, Revenue $350.00, Profit $190.40
 `
 
 perhaps using this String formatting template...
 
 `
 "%s: Sold %d, Expenses $%.2f, Revenue $%.2f, Profit $%.2f"
 `
 
 And a similar line for each of the drinks. The autograder is looking for this exact format.
 
 At the bottom of the file, write the total expenses, total revenue, and total profit for all drinks,
 for example, like this,
 
 `
 All Drinks: Total Sold 1000, Expenses $1000, Revenue $2500, Profit $1500
 `
 
 You should use try-with-resources exception handling for both file reading, and file writing.
 
 Use methods to organize your code. The autograder will call the salesReport() method, and will examine
 the output file your program creates.   The instructor will assess the quality of your code and solution.
 
 You should probably write some extra helper methods for the subtasks of this problem.
 
 Test and comment your code.

### Question 8 Write your Operating System's Name to a File in Another Directory

 **The short version**: 
  
  Write the name of the operating system that's running this code, to a file
  called os.txt, in the /data/ directory of this project.
  
  The file called placeholder.file in the data directory may be ignored, and should not affect this assignment.
  The text in the file should explain why it's there.
  
  
  **The long version**:
  
  All of the code so far has assumed that we are working with a file in the root directory of your project.
  But, a file could be anywhere on your system, so Java needs to support reading files anywhere on your
  computer (and even on remote computers).
  
  Perhaps your program needs several data files, and it would be nice to organize them into one /data directory in your project directory.
  
  There's a /data/ directory in the root of this project. Write a program that creates and stores a test f
  ile in this directory.
  
  FileWriter can take a filename as an argument. The filename can only be a file in your current directory.
  So this doesn't work:
  
  `
  new FileWriter fw = new FileWriter(“/data/testing.txt”);   // Error
  `
  
  But, FileWriter can also take a File object as an argument, and a File object can store a path to a file
  elsewhere on your system (or even on a remote system).
  
  Here’s how to create a File object;
  
  `
  File f = new File(“/mydirectory/mysubdirectory/textfile.txt”);
  `
  
  Assuming these directories exist, you can create and write that file in this location.  The location
  is relative to the root directory of your project.
  
  But before you can write your file, do you know what file system your program is running on?
  
  Linux, Max, and Unix-based computers use / to separate path components, e.g. /Bob/Documents/homework1.doc
  Windows uses backslashes \ to separate path components, e.g. \Bob\Documents\homework1.doc
  
  If you code a forward slash, or backslash, your program will work fine on one system, but crash on the other.
  
  Java is architecture-neutral and the same code is supposed to run in the same way on PC and Mac and Linux,
  and anything else a JVM can be installed on, like a TV, Android device, refrigerator, car, toaster...
  
  Until we got to files, all of our code will run the same on any device, and we'd like to maintain
  that as we work with files.
  
  How can your code know what operating system it is running on, and specify files with backslash or
  forward slashes?
  
  Java code can get information about the system it running on - system properties - which include the
  file path separator for the current system, the name and version of the operating system, and various others,
  
  http://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
  
  Make sure you catch and handle any exceptions.
  
  To recap: write a program that writes the name of the operating system running your code to
  a file called os.txt in the /data directory of your project; your code should work on Mac/Linux and Windows.
  
  
  Test your program on a Windows and a Mac or Linux computer. There are Macs and PCs in the hallway outside T3050.
  
  
  ( Note: In general, it is possible, but not recommended, to use absolute path names, for example
  
  C:\program files\java\textfile.txt on Windows, or
  /users/admin/Documents/textfile.txt on a Unix-based system like Linux or Mac,
  
  but if you do that, your program will almost certainly not work on anyone else's computer! )
