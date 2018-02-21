package week_5;

/**
 *
 * Read the following, and answer the questions by filling in the Strings in the code.
 
 Java doesn't make you deal with possible NullPointerException, or ArrayIndexOutOfBoundsException in your code.
 If these exceptions happen, and are not caught, your program crashes.
 NullPointerException, ArrayIndexOutOfBoundsException, and several other exceptions, are called unchecked exceptions.
 
 It's possible to add try-catch blocks for NullPointerException, and other unchecked exceptions.
 You can also declare that a method throws NullPointerException, or any other unchecked exception
 
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
 

 */
public class Question_4_Exception_Handling_Questions {
    
    
    // Questions on checked and unchecked exceptions
    
    String q1_pros_of_checked_exceptions = "it helps to take appropriate actions on " +
            "the problems that you cannot predict ahead of time such as IOException";   //TODO Fill this in with your answer
    String q2_cons_of_checked_exceptions = "it will lead to compilation error if Exceptions are not handled correctly" +
            " and it makes the code bulkier and difficult to read";   //TODO Fill this in with your answer, at least 2 reasons
    String q3_your_opinion_on_java_having_checked_and_unchecked_exceptions = "Exceptions are beneficial in a sense that they enable us" +
            " to handle the abnormal conditions even before the program runs and if we handle exceptions on our own then we can do various things when an exception is caught such as printing a custom defined message rather than the toString method" +
            " of the Exception object which will make more sense to a user using the program."; // TODO fill this in with your opinion
    
    // Why is it usually better to anticipate and try to prevent errors, vs. letting exceptions be thrown and then catch them?
    

    String[] q4_why_is_it_better_to_anticipate_and_prevent_errors = { "tjawisafafa " +
            "a try-catch block", "jlaljsfj;OJFPJOAGK JJJdkf" };
    // TODO fill this in. At least 2 reasons.
    
}
