/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Bala Shankar Malladi
 */
public class EmployeeDriver {
    public static void main(String[] args){
    ArrayList<Employee> list = new ArrayList<>();
    System.out.println("OUTPUT OF QUESTION12 BY BALA SHANKAR MALLADI");
    list.add(new Employee(111, "Steve Smith", 5000));
    list.add(new Employee(555, "John wick", 7000));
    list.add(new Employee(333, "Stephen", 4000));
    list.add(new Employee(666, "Morgan Charles", 6000));
    list.add(new Employee(222, "Chris Stephen", 2000));
    list.add(new Employee(444, "Hongkong", 3000));
    System.out.println("The original list is ");
    for (Employee employee : list) {
            System.out.println(employee);

    }
        System.out.println("Sorted based on id is");
        Collections.sort(list);
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
            }
        });
        System.out.println("sorted based on salary is ");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                return arg0.getEmpName().compareTo(arg1.getEmpName());
            }
        });
        System.out.println("sorted based on name is");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

}



