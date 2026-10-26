package com.koda;

public class EmployeeService {
  private String employeeId;
  private String name;
  private String position; 
  private String department;
  private int salary;

  public EmployeeService(String employeeId, String name, String position, String department, int salary){
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.department = department;
    this.salary = salary;
  }

  public String getEmployeeID(){
    return employeeId;
  }

  public String getName(){
    return name;
  }

  public String getPosition(){
    return position;
  }

  public String getDepartment(){
    return department;
  }

  public int getSalary(){
    return salary;
  }

  public void increaseSalary(int amount){
    if (amount >= 0) {
      salary += amount;
    } else {

      System.out.println("Error: Kenaikan gaji harus lebih dari 0");
    }
  }


}
