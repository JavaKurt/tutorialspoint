/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankpractice;

/**
 *
 * @author Kurtis
 * 
 * 
 * 
 * HACKER RANK PRACTICE -- JAVA LOOPS II -- CONCATENATING ALGORITHM'S INDEFINITELY
 */

import java.util.*;
import java.io.*;

public class javaLoops2{
    
    public static void javaloop2(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int test = 0; 
            
                for(int j=0;j<=n-1;j++){
                    
                    test = (int) (Math.pow(2,j) * b + test);
                    System.out.print(a + test + " ");
                
                }
            
        }
        in.close();
    }
}

