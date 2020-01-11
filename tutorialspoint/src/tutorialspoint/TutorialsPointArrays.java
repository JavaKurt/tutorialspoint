/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialspoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Kurtis
 */
public class TutorialsPointArrays {
    
    
    
/*
   Syntax for declaring an array 
   dataType[] arrayRefVar; 
    
    arrayRefVar = new dataType[arraySize];
    
    The above statement creates an array using new dataType[arraySize]. It also assigns the reference of the newly created array to the variable arrayRefVar.
    This can all be done in one statement. 
    
    dataType[] arrayRefVar = new dataType[arraySize];
    
    or
    
    dataType[] arrayRefVar = {value0, value1, ..., valuek};
    
    array elements are accessed through the index. Array indeces are -based; starting from 0 to arrayRefVar.length-1.
    
    to process array elements, the forloop or foreach loop is used because all of the elements in an array are the same type and the size of the array is known.

*/    
    
    public static void createAndPrintArray(){
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        
        //Print all of the array elements
        for(int i=0; i < myList.length; i ++){
            System.out.println(myList[i] + " ");
        }      
    }
    
    public static void totalSumOfArray(){
        //summing all of the elements in an array
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        
        double total = 0;
        for(int i=0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("Total is " + total);
    }
    
    public static void findLargestElement(){
        //Finding the largest element
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        double max = myList[0];
        for(int i = 1; i < myList.length; i++){
            if(myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }
    
    /*
       ----------------------- FOR EACH LOOP ------------------------------
    The foreach loop enables traversing thourhg the complete array without using an index variable.
    
    */
    
    public static void forEachLoop(){
        double[] myList = {2, 3, 4, 5, 6};
        
        //print all the array elements
        
        for(double element: myList){
            System.out.println(element);
        }
    }
   
    
    /*
    PASSING AN ARRAY TO A METHOD
    */
    
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        
        //this can be invoked using the following example:  printArray(new int[]{3,1,2,6,4,2});
    }
    
    /* 
        A method may also return an array. For example, the following method returns an array that is the reversal of another array - 
    */

    
    public static int[] reverse(int[] list){
        int[]result = new int[list.length];
        for(int i = 0, j = result.length - 1; i < list.length; i++, j--){
            result[j] = list[i];
        }
        
        printArray(result);
        
        return result;
        
    }
    
    
    
    
// CHANGING EVERY OTHER CHARACTER IN A STRING TO A CAPITAL     
    public static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
          if (Character.isLetter(chars[i])) {
            chars[i] = Character.toUpperCase(chars[i]);
            
          } 
          else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
            chars[i] = Character.toLowerCase(chars[i]);
            i++;
          }
        }
        
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i]);
        }
        
        return String.valueOf(chars);
}
    
// CONVERTING STRING TO CHAR ARRAY AND CAPITALISING FIRST CHAR
    
    public static String cap1stChar(String userIdea)
            
        {
            char[] stringArray = userIdea.toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            System.out.println(stringArray);
            return userIdea = new String(stringArray);
            
            
        }
    
   // public static void main(String[] args){
   //     int[] myList = {10, 2, 99, 1, 3};
   //     reverse(myList);
        
   // }
    
    
    /* 
1   public static int binarySearch(Object[] a, Object key)
    Searches the specified array of Object ( Byte, Int , double, etc.) for the specified value using the binary search algorithm. 
    The array must be sorted prior to making this call. This returns index of the search key, if it is contained in the list; 
    otherwise, it returns ( – (insertion point + 1)).

2   public static boolean equals(long[] a, long[] a2)

    Returns true if the two specified arrays of longs are equal to one another. 
    Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal. 
    This returns true if the two arrays are equal. Same method could be used by all other primitive data types (Byte, short, Int, etc.)

3   public static void fill(int[] a, int val)

    Assigns the specified int value to each element of the specified array of ints. The same method could be used by all other primitive data types (Byte, short, Int, etc.)

4   public static void sort(Object[] a)

    Sorts the specified array of objects into an ascending order, according to the natural ordering of its elements. 
    The same method could be used by all other primitive data types ( Byte, short, Int, etc.)
    */
    
}
