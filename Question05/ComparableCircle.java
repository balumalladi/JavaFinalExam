
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
public class ComparableCircle extends Circle implements
        Comparable<ComparableCircle> {

    public ComparableCircle(double radius, double area) {
        super(radius, area);
    }
      @Override
    public int compareTo(ComparableCircle obj) {
        return Double.compare(super.getArea(), obj.getArea());
    }
}
