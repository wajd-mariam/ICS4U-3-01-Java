/*
* Copyright (c) 2021
*
* The Recursion file reverses a word and prints it
* out to the user.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2021/01/04
*/

public class Recursion {
  
  /**
   * This function reverses the string passed in using recursion.
   */
  static String reverseString(String string) {
    if (string.length() == 0) {
      return string;
    } else {
      return reverseString(string.substring(1)) + string.charAt(0);
    }
  }
  
  /**
   * This function prints a string, calls a function to reverse it, and print the 
   * reversed string.
   */
  public static void main(String[] args) {
    String recursionWord = "recursion";
    // Printing the initial string before reversing it.
    System.out.println("The original string is: " + recursionWord);
    // Calling reverseString function to reverse recursionWord.
    String newWord = reverseString(recursionWord);
    // Printing the new reversed string.
    System.out.println("The reversed string (using recursion) is :" + newWord);
  }
}