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
public class Bike extends Vehicle {

    public Bike() {
        super();
        System.out.println("Bike class constructor is invoked");
    }
    @Override
    public void type(){
    System.out.println("This is new model vehicle");
    } 
}
