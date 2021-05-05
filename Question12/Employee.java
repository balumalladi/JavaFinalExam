/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Employee implements Comparable<Employee> {
    public int empId;
    public String empName;
    public double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }
    
    @Override
    public String toString() {
        return "Employee id: " + empId + " Name: " + empName
                + " Salary: " + empSalary;
    }

    @Override
    public int compareTo(Employee obj) {
        return Integer.compare(this.empId, obj.getEmpId());

    }

}
