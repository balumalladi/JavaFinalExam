/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;
/**
 *
 * @author Bala Shankar Malladi
 */
public class Bike implements vehicle, maker{
    public static final String bikemodel="NEW";
    public static final String biketype="Duke";
     public static final int year=2000;
    public void type(){
    System.out.println("Bike Type is :"+biketype);
    }
    public void model(){
    System.out.println("Bike model is :"+bikemodel);
    }
    public void makeYear(){
    System.out.println("Bike made  year is :"+year);
    }
}
