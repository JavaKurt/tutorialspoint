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
public class stringManipulation {
    

// A PROGRAM TO CAPITALISE EVERY OTHER LETTER IN A STRING, STARTS WITH A CAPITAL AT THE FRONT OF THE STRING
// SKIPS WHITESPACES 
    
    
    public static void capitaliseEveryOtherLetter() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        
        while ((line = in.readLine()) != null) {
            
           char[] chars = line.toCharArray();
           
           chars[0] = Character.toUpperCase(chars[0]);
           
           for(int i =1; i < chars.length; i++){
               
               if(Character.isLetter(chars[i])){
     
                   if(Character.isUpperCase(chars[i-1])){
                        chars[i] = Character.toLowerCase(chars[i]);
                    }
                   else if(Character.isLowerCase(chars[i-1])){
                       chars[i] = Character.toUpperCase(chars[i]);
                   }

               }
               else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
                    
                    i++; 
                    
                   if(Character.isUpperCase(chars[i-2])){
                        chars[i] = Character.toLowerCase(chars[i]);
                    }
                   else if(Character.isLowerCase(chars[i-2])){
                       chars[i] = Character.toUpperCase(chars[i]);
                   }
                  }
           }
           
           for(int i=0; i < chars.length; i++){
               System.out.print(chars[i]);
           }

        }
  }
}
