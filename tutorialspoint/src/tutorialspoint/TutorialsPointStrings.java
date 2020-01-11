/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialspoint;

/**
 *
 * @author Kurtis
 */
public class TutorialsPointStrings {
    public static void main(String[] args){
        creatingAFormat();
        oneTimeFormat();
        
    }
    
    public static void lowercaseStringToCaps(){
        String str = new String("Welcome to Tutorialspoint.com");
        
        System.out.print("Return value: ");
        System.out.println(str.toUpperCase());
    }
/*
    String revisions
    Strings are treated as objects
    The string class has 11 consutrctors that allow you to provide the initial value of the string using different sources, such as an array of characters
*/
    public static void printCharArray()
    {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        
    }
    
/*
    The string class is immutable, thus cannot be changed when created. If required, you can use String buffer and Stirng builders classes 
    to make lots of modifications to Strings of characters.
    https://www.tutorialspoint.com/java/java_string_buffer.htm
    
    Methods used to obtain information about an object are known as accessor methods. 
    length() can be used to check the length of a string
    it returns the number of characters contained in the string object 
*/
    public static void lengthOfString(){
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println("String Length is : " + len);
    }
    
/*
    
 -----------------   CONCATENATE STRINGS    ---------------------- 
    The String class contains a method for concatenating two strings - 
    string1.concat(string2);
    
    This will return a new string that is string1 with string2 added at the end. 
    
    concat() can be used with string literals:
    "my name is ".concat("Zara");
    
    Strings are more commonly concatenated with the + operator, I.E, "Hello" + "world" 
    
 -------------------   FORMAT STRINGS    ------------------------
    
    printf() and format() methods print output with formatted numbers. 
    Using String's static format() method allows you to create a formatted string that is reusable, opposed to a one time print statement. 
    For example, instead of:
*/
    
    public static void oneTimeFormat(){
        float floatVar = 10;
        int intVar = 10;
        String stringVar = "hi";
        
        System.out.printf("The value of the float variable is " +
                "%f, while the value of the integer " + 
                "variable is %d and the string " + 
                "is %s", floatVar, intVar, stringVar);
    }

    //You can write :
    
    public static void creatingAFormat(){
        float a = 10;
        int b = 10;
        String c = "hi";
        String fs;
        
        
        fs = String.format("The value of the float variable is " + 
                "%f, while the value of the integer " + 
                "variable is %d, and the string" +
                "is %s", a, b ,c);

        System.out.println(fs);
    }
   
  /* 
    LIST OF STRING METHODS SUPPORTED BY STRING CLASS
    
    1. char charAt(int index) - returns the character at the specified index
    2. int compareTo(Object o) - Compares this String to another Object.
    3. int compareTo(String anotherString) - compares two strings lexicographically.
    4. int compareToIgnoreCases(String str) - compares two strings lexicographically, ignoring case differences
    5. boolean contentEquals(StringBuffer sb) - Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer
    6. static String copyValueOf(char[] data) - Returns a String that represents the character sequence in the array specified.
    7. static String copyValueOf(char[] data, int offset, int count)- Returns a String that represents the character sequence in the array specified.
    8. boolean equals(Object anObject) - Compares this string to the specified object.   
    9. String replace(char oldChar, char newChar) - Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
    10. String replaceAll(String regex, String replacement - Replaces each substring of this string that matches the given regular expression with the given replacement.
    11. String replaceFirst(String regex, String replacement) - Replaces the first substring of this string that matches the given regular expression with the given replacement.
    12. String substring(int beginIndex) - Returns a new string that is a substring of this string.
    13. String substring(int beginIndex, int endIndex) - Returns a new string that is a substring of this string.
    14. char[] toCharArray() - Converts this string to a new character array.
    15. String toLowerCase() - Converts all of the characters in this String to lower case using the rules of the default locale.
    16. String toLowerCase(Locale locale) - Converts all of the characters in this String to lower case using the rules of the given Locale.
    17. String toUpperCase(Locale locale) - Converts all of the characters in this String to upper case using the rules of the given Locale.
    18. String toUpperCase() - Converts all of the characters in this String to upper case using the rules of the default locale.

 */  
    
  }
    

