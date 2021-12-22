package io.pattern;
/*

print below format
    *
   **
  ***
 ****
*****

*/

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Any Number:  ");
        int m=scn.nextInt();
        for (int i=0;i<m;i++){
            for(int j=0;j<m-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
