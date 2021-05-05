/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Bala Shankar Malladi
 */
public class question11 {
      
      public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("OUTPUT OF QUESTION11 BY BALA SHANKAR MALLADI");
        /**
         * Following are the objects to illustrate equals and hashcode.
         */
        Vehicle vehicle1 = new Vehicle("new","sedan");
        Vehicle vehicle2 = new Vehicle("old","hatchback");
        Vehicle vehicle3= new Vehicle("new","sedan");
        /**
         * Printing the hashcodes of the objects, this will invoke the hashcode
         */
        System.out.println("Hash code of str1: " + vehicle1.hashCode());
        System.out.println("Hash code of str2: " + vehicle2.hashCode());
        System.out.println("Hash code of str2: " + vehicle3.hashCode());
        /**
         * Checking the objects with equals method
         */
        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle1.equals(vehicle2));
         System.out.println(vehicle1.equals(vehicle3));      
    }
}
