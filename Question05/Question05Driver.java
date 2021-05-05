/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;
/**
 *
 * @author Bala Shankar Malladi
 */
public class Question05Driver {
    public static void main(String[] args){
     System.out.println("OUTPUT OF QUESTION05 BY BALA SHANKAR MALLADI");
     ComparableCircle circle1= new ComparableCircle(12.3,12.3);
     ComparableCircle circle2=new ComparableCircle(23.4,56.7);
     
     System.out.println("Area of circle1 is "+circle1.calculteArea());
     System.out.println("Area of circle2 is "+circle2.calculteArea());
     if (circle1.compareTo(circle2) == 0) {
            System.out.println("Both the circles have same area");
        } else if (circle1.compareTo(circle2) > 0) {
            System.out.println("Area of circle1 is greater than the area of circle2");
        } else {
            System.out.println("Area of circle1 is smaller than area of circle2");
        }
    }
}
