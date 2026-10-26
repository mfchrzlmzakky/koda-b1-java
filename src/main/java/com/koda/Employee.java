package com.koda;

public class Employee {

  private EmployeeService employeeId;
  private EmployeeService name;
  private EmployeeService position; 
  private EmployeeService department;
  private EmployeeService salary;

  public Employee(EmployeeService employeeId, EmployeeService name, EmployeeService position, EmployeeService department, EmployeeService salary) {
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.department = department;
    this.salary = salary;
  }

  public void showEmployee(){
    System.out.println("================================");
    System.out.println("KODA ENTERPRISE");
    System.out.println("================================");
    System.out.println("Employee ID: " + employeeId.getEmployeeID());
    System.out.println("Name: " + name.getName());
    System.out.println("Position: " + position.getPosition());
    System.out.println("Department: " + department.getDepartment());
    System.out.println("Salary: Rp" + salary.getSalary() + "\n");
  }

  public void giveRaise(int amount){
    System.out.println("Salary Increase: Rp" + amount);
    salary.increaseSalary(amount);
    System.out.println("Current Salary: Rp" + salary.getSalary() + "\n");
  }
}
