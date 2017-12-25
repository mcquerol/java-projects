package com.Main.compression;

import java.util.Scanner;

public class count_chars{
  
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in); // create input object
    int count;
    int sum;
    String str;
    char ch;
    System.out.println("Type some text");
    str = scan.nextLine();
    sum=0;
    for (ch=32; ch<=254; ch++){  // loop for every printable ASCII char (32 to 254)           
     count=0;
      for (int i=0; i<str.length(); i++){    // loop until the string ends  
        if ((char)ch == str.charAt(i)){      // check if ASCII char matches string[i]
          count++;   // how many times each char appears in the string
          sum++;   // the total 
        }  
      }
      if (count>0){
        if (ch == 32){
          System.out.println("[SPACE] = " + count);
        }else{
          System.out.println((char)ch + " = " + count); // output the count for the corresponding char of the string 
        }
      }
    }
    System.out.println("Total is " + sum + " bytes"); // output the sum, because variable is used outside of the big loop it shows the total
    System.out.println("");
    scan.close();
  }
  
}  
