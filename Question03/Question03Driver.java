/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Question03Driver {
    public static void main(String[] args){
    System.out.println("OUTPUT OF QUESTION03 BY BALA SHANKAR MALLADI");
    //Implicit type casting
        System.out.println("Implicit type casting");
        Vehicle vehicle = new Bike();
        vehicle.type();
    //Explicit type casting
        System.out.println("After explicit type casting");
        Bike bike = (Bike) vehicle;
        bike.type();
    }
 }

