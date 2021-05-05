/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;
/**
 *
 * @author Bala Shankar Malladi
 */
public class Question2Driver {
   public static void main(String args[]){
   GeometricObject[] geometricObject = new GeometricObject[5];
   
   geometricObject[0] = new Square(1.2, true);
   geometricObject[1] = new Square(2.3, false);
   geometricObject[2] = new Square(3.4, true);
   geometricObject[3] = new Square(4.5, false);
   geometricObject[4] = new Square(5.6, true);
   
   for (GeometricObject object : geometricObject) {
            System.out.println("Area is : " + object.calculateArea());
            if (object.isColorable() == true) {
                Square square = (Square) object;
                square.howToColor();
   } 
}
}
}
