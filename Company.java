package company_EMS;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Iterator;

public class Company {
    public String name;
    //public static Map<Department> departments = new ArrayList<Department>();
    public Map<String, Department> departments;
    //departments = new ArrayList<departments>();

    public Company(String name){
        this.name = name;
        this.departments = new TreeMap<String, Department>();
    }
    public void addDepartment(String deptName){
        Department newDept = new Department(deptName);

    try{
        this.departments.put(deptName, newDept);
        }catch (Exception e){
            System.out.println("Department already exist.");
        }
    }

    public void hire(String firstName,String lastName, int salary, String deptName){
        Employee newEmployee = new Employee(firstName,lastName, salary);
        Department assignedDepartment = departments.get(deptName);
        assignedDepartment.addEmployee(newEmployee);
    }
    public void randomHire(String Name){

        Random rand = new Random();
        int salary = rand.nextInt(200000);
        int departmentIndex = rand.nextInt(departments.size()-1);
        Employee newEmployee = new Employee(firstName,lastName, salary);
        Department assignedDepartment = departments.get(departmentIndex);
        assignedDepartment.addEmployee(newEmployee);
    }

    public void fire(Integer id){
        
        for(Map.Entry<String, Department> deptEntry: this.departments.entrySet()){
            TreeMap<Integer, Employee> employList = deptEntry.getValue().getEmployeeListById();
            if(employList.containsKey(id)){
                employList.remove(id);
                return;
            }
        }
        
        System.out.println("Employee not found");
        return;
    }

    public void changeFund(String deptName, int amount){
        this.departments.get(deptName).updateBudget(amount);
    }

    public Department getDept(String deptName){
        try{

            return this.departments.get(deptName);

        }catch(Exception e){
            System.out.println("Department not found, please enter the correct department name.");
            return null;
        }

    }
    


    public void printDepartmentList(){
        for(Map.Entry<String, Department>deptEntry:this.departments.entrySet()){
            System.out.println(deptEntry.getValue().getName()+ ": [ phone: " + deptEntry.getValue().getPhoneNumber() + " budget: " + deptEntry.getValue().getBudge() + " ]");
            System.out.println("Department size: "+ deptEntry.getValue().getMemberSize());
            if(deptEntry.getValue().getMemberSize() >0){
                
                System.out.print("Member: ");
                for(Map.Entry<Integer,Employee>entry:deptEntry.getValue().employeeListById.entrySet()){

                    System.out.print(entry.getValue().getName()+", ID: " +entry.getKey()+" ");
                }

            }
            System.out.println("");
        }
    }
   
    public void companyInfo(){
        System.out.println("Company name: "+ this.name);
        System.out.println("");
        printDepartmentList();
    }
    // public Department getDepartment(String DeptName){

    //     return 
    // }
}
