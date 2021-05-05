/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public class question7 {
    public static void main(String[] args){
     int numbers[]= new int[100];
     for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int)(Math.random() * 100);
        }
        System.out.println("OUTPUT OF QUESTION07 BY BALA SHANKAR MALLADI");

        System.out.print("Enter an index of array to find the integer : ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        try {
            System.out.println("Integer at " + index + " is "+ numbers[index]);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
