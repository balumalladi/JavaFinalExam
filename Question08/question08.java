/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public class question08 {
   public static void main(String[] args) throws ArithmeticException,
           ArrayIndexOutOfBoundsException {
       System.out.println("OUTPUT OF QUESTION08 BY BALA SHANKAR MALLADI");
       System.out.print("Enter a number : ");
       Scanner scan=new Scanner(System.in);
       int number=scan.nextInt();
       int array[]={1,2,3,4,5};
       System.out.print("Enter the index to retrieve : ");
       int newnum=scan.nextInt();
       try{
       int result=9/number;
       System.out.println("Answer is : "+result);
       array[newnum]=result;
       System.out.println("Answer of array is : "+array);
       }
       catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){
       System.out.println(exception);
       }
   } 
}
