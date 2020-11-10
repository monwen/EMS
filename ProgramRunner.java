package company_EMS;
import java.util.List;
import java.util.ArrayList;

class ProgramRunner {
  public static ArrayList<String> hireList(){
    ArrayList<String> list = new ArrayList<String>();
    list.add("Daniel");
    list.add("Barun");
    list.add("Rodney");
    list.add("Jolina");
    list.add("Ken");
    list.add("Thomas");
    list.add("Edson");
    list.add("Orquidia");
    list.add("Charles");
    list.add("Mathew");
    return list;
  }
  public static void main(String[] args){
      // Employee bob = new Employee("bob", 10000);
      // Employee mary = new Employee("marry", 100000);
      // System.out.println("This is " + bob.getName()+ " id: " + bob.getId());
      // System.out.println("This is " + mary.getName()+ " id: " + mary.getId());
      // Department sales = new Department("sales");
      // sales.add(bob);
      // sales.add(mary);

      Company company = new Company("Shen Co");
      company.addDepartment("Sales");
      company.addDepartment("Human Resource");
      company.addDepartment("IT");
      company.addDepartment("Engineer");
      company.addDepartment("Marketing");
      ArrayList<String> employees = hireList();
      // for(String employee:employees){
      //   company.hire(employee);
      // }
      company.changeFund("Engineer", 100000000);
      company.printDepartmentList();
      company.changeFund("Engineer", -100000);
      company.printDepartmentList();
      
      //company.employeeCount();
      Menu.mainMenu(company);
      
  }
}
