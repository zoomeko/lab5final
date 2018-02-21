package week_5;

import java.util.LinkedList;

/**
 
 This question uses the same code as Question 5 in Question_5_Add_Exception_Handling.java

 Instead of waiting for an exception and catching it, it is usually better to try and prevent problems.

 Can you think of a better way to stop this code crashing?
 
 Modify the printLanguageList and wordCount methods program so that both methods work correctly without using a try-catch statements.


 */
public class Question_6_Fix_Code_No_Exception_Handling {

    public static void main(String[] args) {

        Question_6_Fix_Code_No_Exception_Handling q6 = new Question_6_Fix_Code_No_Exception_Handling();

// Test the printLanguageList() method

        q6.printLanguageList();

// Test the wordCount() method

        String sentence1 = "This is an example sentence.";

        String sentence2 = null;

        int words1 = q6.wordCount(sentence1);

        int words2 = q6.wordCount(sentence2);

        System.out.println(sentence1 + " has this many words: " + words1);

        System.out.println(sentence2 + " has this many words: " + words2);

    }

/* Adds some example programming languages to a LinkedList, and then prints them in reverse order.

*/

//Start of printLanguageList. Don't change or move this comment.

    public void printLanguageList() {

// TODO stop this code crashing by modifying it

// to check for possible errors before they happen.

// Make sure you still print all of the languages from the list.

        LinkedList<String> languages = new LinkedList<String>();

        languages.push("JavaScript");

        languages.push("Python");

        languages.push("C#");

/*We can get the size of the languages linked list here to avoid iterating

the while loop over a non existent element

This code was earlier giving this exception:

Exception in thread "main" java.util.NoSuchElementException

*/

        int sizeLanguages = languages.size();

        int countLanguages = 0; /*This is a counter for the languages popped out of languages linked list.

Here run the loop only for the calculated size of language linked list*/

        while (countLanguages < sizeLanguages) {

            String oneLanguage = languages.pop();

            System.out.println(oneLanguage);

            countLanguages++; /*Increase the counter as the languages are

popped out.*/

        }

    }

//Start of printLanguageList. Don't change or move this comment. The Autograder needs it.

/* A very simple word count function.

This function should return the number of words in a string.

For this program, each word is assumed to be separated by a single space character.

If the String sentence is null, this method should return 0.

Counting words in real-world situations can be a much trickier problem,

with various special cases to consider.

For example, is "sugar-free" one word, or two? How many words in "D. B. Cooper" ? */

//Start of wordCount. Don't change or move this comment, the Autograder needs it.

    public int wordCount(String sentence) {

// TODO This code throws a NullPointerException if the String sentence is null.

// Modify this code to test if the String is null before splitting it.

// Return 0 if the String is null.

/*

Here, just check whether the input sentence is null. If it is null,

return 0 as asked in the above comment. Else, calculate the

number of words as it was previously being done and return the

calculated length.

*/

        if(sentence == null)

        {

            return 0;

        }

        else

        {

            String[] words = sentence.split(" ");

            return words.length;

        }

    }

//End of wordCount. Don't change or move this comment,

}

