package lab.main;

import lab.Employee;

public class Main {

public static void main(String[] args) {

    Employee[]e1 = new Employee[5];
    e1[0] = new Employee("Ivanov", 1000, true);
    e1[1] = new Employee("Petrov", 1500, false);
    e1[2] = new Employee("Sidorov", 2000, false);
    e1[3] = new Employee("Pupkin", 1700);
    e1[4] = new Employee();
    e1[0].print();
    System.out.println(Employee.totalSalary/Employee.numberOfEmployees);
    System.out.println(Employee.amountWithChildren);
    // Николя лох
    } }

