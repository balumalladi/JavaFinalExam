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
public class question10_2 {
    int sum = 0, j = 0;
    public static void main(String[] args) 
    {
        System.out.println("OUTPUT FOR EXAMPLE 2 OF QUESTION 10 BY BALA SHANKAR MALLADI");
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of elements you want : ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter all the elements you want : ");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        question10_2 obj = new question10_2();
        int x = obj.add(a, a.length, 0);
        System.out.println("Sum:"+x);
    }
    int add(int a[], int n, int i)
    {
        if(i < n)
        {
            return a[i] + add(a, n, ++i);
        }   
        else
        {
            return 0;
        }
    }
}

