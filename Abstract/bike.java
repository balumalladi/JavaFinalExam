/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;
/**
 *
 * @author Bala Shankar Malladi
 */
public class bike extends Vehicle {
    public static final String bikeModel="NEW";
    public static final String bikeType="Avenger";
    
    public void type(){
    System.out.println("Bike type is "+bikeType);
    }
    public void model(){
    System.out.println("Bike model is "+bikeModel);
    }
}