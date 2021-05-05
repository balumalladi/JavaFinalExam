/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public class question10_1 {
  public static void main(String[] args)  {  
    System.out.println("OUTPUT OF EXAMPLE1 FROM QUESTION10 BY BALA SHANKAR MALLADI");
    int c=0,a,temp;  
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n=scan.nextInt();
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
} 
