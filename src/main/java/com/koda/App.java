package com.koda;

public class App 
{
    public static void main( String[] args )
    {
        EmployeeService employee1 = new EmployeeService("EMP001", "Prabroro", "Presiden", "Pemerintah(babu)", 5000000);

        Employee employeesatu = new Employee(employee1, employee1, employee1, employee1, employee1);

        employeesatu.showEmployee();

        // System.out.println("Salary Increase: Rp1000000");
        // employee1.increaseSalary(1000000);
        // System.out.println("Current Salary: Rp" + employee1.getSalary() + "\n");

        // System.out.println("Salary Increase: Rp-500000");
        // employee1.increaseSalary(-500000);
        // System.out.println("Current Salary: Rp" + employee1.getSalary() + "\n");

        employeesatu.giveRaise(1000000);
        employeesatu.giveRaise(-500000);
    }
}
