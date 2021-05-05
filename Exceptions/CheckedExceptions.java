/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public class CheckedExceptions {
       public static void main(String[] args) throws FileNotFoundException{
   System.out.println("OUTPUT OF CHECKED EXCEPTION  BY BALA SHANKAR MALLADI");
   try {
            Scanner scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
   } 
}
