/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09Example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Throws {
   public static void main(String[] args) throws FileNotFoundException{
   System.out.println("OUTPUT OF EXAMPLE 2 IN QUESTION09 BY BALA SHANKAR MALLADI");
   Scanner scan=new Scanner(new File("input.txt"));
   while(scan.hasNext()){
   System.out.println(scan.nextLine());
   }
   } 
}
