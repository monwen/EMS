package company_EMS;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;


public class Department {
    private String departmentName;
    //private List<Employee> employeeList;
    private int budget;
    private String phone;
    public Map<Integer, Employee> employeeListById;
    //private Map<String,ArrayList<Employee>> employeeListByName;

    public Department(String departmentName, int budget, String phone){
        this.departmentName = departmentName;
        this.budget = budget;
        this.phone = phone;
        //this.employeeList = new ArrayList<Employee>();
        this.employeeListById = new TreeMap<Integer,Employee>();
        //this.employeeListByName = new TreeMap<String,ArrayList<Employee>>();
    }
    public Department(String departmentName){
        this.departmentName = departmentName;
        this.budget = 0;
        this.phone = null;
        //this.employeeList = new ArrayList<Employee>();
        this.employeeListById = new TreeMap<Integer,Employee>();
        //this.employeeListByName = new TreeMap<String,ArrayList<Employee>>();
    }
    public Department(String departmentName, int budget){
        this.departmentName = departmentName;
        this.budget = budget;
        this.phone = null;
        //this.employeeList = new ArrayList<Employee>();
        this.employeeListById = new TreeMap<Integer,Employee>();
        //this.employeeListByName = new TreeMap<String,ArrayList<Employee>>();
    }
    public Department(String departmentName, String phone){
        this.departmentName = departmentName;
        this.budget = 0;
        this.phone = phone;
        //this.employeeList = new ArrayList<Employee>();
        this.employeeListById = new TreeMap<Integer,Employee>();
        //this.employeeListByName = new TreeMap<String,ArrayList<Employee>>();
    }
    public String getName(){
        return this.departmentName;
    }
    public String getPhoneNumber(){
        return this.phone;
    }
    public int getBudge(){
        return this.budget;
    }
    public int getMemberSize(){
        return this.employeeListById.size();
    }

    public TreeMap<Integer, Employee> getEmployeeListById(){
        return this.employeeListById;
    }

    public Employee getEmployee(int id){
        return this.employeeListById.get(id);
    }


    public void addEmployee(Employee person){
        this.employeeListById.put(person.getId(),person);
        //new array
        // if(!this.employeeListByName.containsKey(person.getName())){
        //     ArrayList<Employee> tempArray = new ArrayList<Employee>();
        //     tempArray.add(person);
        //     this.employeeListByName.put(person.getName(),tempArray);
        // }else{
        //     ArrayList<Employee> tempArray = this.employeeListByName.get(person.getName());
        //     tempArray.add(person);
        //     this.employeeListByName.put(person.getName(),tempArray);
        // }
        System.out.println(this.employeeListById.get(person.getId()).getName());
    }
    public void removeEmployee(Integer id){
        Employee removeEmployee = this.employeeeListById.get(id);
        // int size = this.employeeListByName.get(removeEmployee.getName()).size();
        // if(size > 1){
        //     this.employeeListByName.get(this.employeeListById.get(id).getName()).remove(this.employeeListById.get(id));
        // }else{
        //     this.employeeListByName.remove(removeEmployee.getName());
        // }
        this.employeeListById.remove(id);
    }

    
    public void updateName(String name){
        this.departmentName = name;
    }
    public void updateBudget(int budget){
        this.budget += budget;
    }
    public void updatePhone(String phone){
        this.phone = phone;
    }
}
