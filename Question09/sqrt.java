/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public class sqrt {
    public static void main(String[] args){
    System.out.println("OUTPUT OF QUESTION 09 BY BALA SHANKAR MALLADI");
    Scanner scan =new Scanner(System.in);
    System.out.print("Please Enter Number : ");
    int number=scan.nextInt();
    if (number<=0) {
            throw new ArithmeticException("we cannot calculate square root for negative numbers ");
        }
    System.out.println("Square root of given number is: " + Math.sqrt(number));

    }
}
