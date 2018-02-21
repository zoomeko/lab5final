package week_5;

/**
 *
 
 The short version:
 
 Write the name of the operating system that's running this code, to a file
 called os.txt, in the /data/ directory of this project.
 
 The file called placeholder.file in the data directory may be ignored, and should not affect this assignment.
 The text in the file should explain why it's there.
 
 
 
 
 The long version:
 
 All of the code so far has assumed that we are working with a file in the root directory of your project.
 But, a file could be anywhere on your system, so Java needs to support reading files anywhere on your
 computer (and even on remote computers).
 
 Perhaps your program needs several data files, and it would be nice to organize them into one /data directory in your project directory.
 
 There's a /data/ directory in the root of this project. Write a program that creates and stores a test f
 ile in this directory.
 
 FileWriter can take a filename as an argument. The filename can only be a file in your current directory.
 So this doesn't work:
 
 new FileWriter fw = new FileWriter(“/data/testing.txt”);   // Error
 
 But, FileWriter can also take a File object as an argument, and a File object can store a path to a file
 elsewhere on your system (or even on a remote system).
 
 Here’s how to create a File object;
 
 File f = new File(“/mydirectory/mysubdirectory/textfile.txt”);
 
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
 
 
 (Note: In general, it is possible, but not recommended, to use absolute path names, for example
 
 C:\program files\java\textfile.txt on Windows, or
 /users/admin/Documents/textfile.txt on a Unix-based system like Linux or Mac,
 
 but if you do that, your program will almost certainly not work on anyone else's computer! )
 
 (Another note - the File class has a built-in way to join path components, which is usually the safest way,
 but for this lab, use system properties.)

 */


public class Question_8_Write_Operating_System_Info_To_File_In_Data_Directory {
    
    public static void main(String[] args) {
        Question_8_Write_Operating_System_Info_To_File_In_Data_Directory q8 = new Question_8_Write_Operating_System_Info_To_File_In_Data_Directory();
        q8.writeOSName();
    }
    
    public void writeOSName() {
        
        // TODO write the name of the operating system running this code to a file /data/os.txt
        // The file has to be in the /data directory of this project
        // Use system properties to generate the path data\os.txt for Windows or data/os.txt for Linux/Mac
        
        // Test your code on both types of operating systems: Windows, and Mac/Linux
    }
    
}
