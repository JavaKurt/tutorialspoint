/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Kurtis
 */


/*
    1. small method to find the letters between a range of indicies within a string, using the substring(a,b) method.
    2. substring comparison method.
*/
public class javaSubstring {
    
    private static String s;
    private static int start; 
    private static int end;
    private static int k;
    
    private static Scanner in = new Scanner(System.in);
    
    public static void printSubstring() throws IOException{

        s = in.next();
        start = in.nextInt();
        end = in.nextInt();
        
        s = s.trim();
        
        System.out.println(s.substring(start, end));
        
        }
    
//Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k. 

      public static String getSmallestAndLargest(String s, int k) {
 
        int len = s.length();
        
        //sorted set allows ordering for the elements in the set
        //sorted set must know how to sort its elements as they are added by checking two interfaces:
        //if its elements implement the comparable interface, it will use compareTo() methods to sort items. sorting in natural order.
        //we can pass in a comparator to do custom sorting.
        
        
        SortedSet<String> sets = new TreeSet<String>();
        
        for(int i=0; i<s.length() - k ; i++){
            sets.add(s.substring(i, i+k));
        }
        
        
        String smallest = sets.first();
        String largest = sets.last();


        return smallest + "\n" + largest;
    }
      
      
      
      public static void isPalindrome(){
          
          String A = in.next();

          // is string A a palindrome
          
          for(int i = A.length(); i > 0; i--){
              System.out.print(A.charAt(i));
          }

          
      }
      
      public static void main(String[]args){
          isPalindrome();
      }
}



//    public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
//      
//        System.out.println(getSmallestAndLargest(s, k));
//    }
//}
//    

