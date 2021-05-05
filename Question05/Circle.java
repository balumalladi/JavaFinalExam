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
public class Circle {
    public double radius;
    public double area;

    public Circle(double radius, double area) {
        this.radius = radius;
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double calculteArea(){
    area = Math.round(Math.PI * Math.pow(this.radius, 2) * 100) / 100.0;
    return area;
    }
}
