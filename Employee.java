package company_EMS;

public class Employee{
    private static Integer count= 1;
    private String firstName;
    private String lastName;
    private Integer id;
    private int salary;

    public Employee(String firstName,String lastName, int salary){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = count;
        this.salary = salary;
        count +=1;
    }
    public String getName(){
        String fullName = this.firstName+ this.lastName;
        return fullName;
    }

    public Integer getId(){
        return this.id;
    }

    public void setName(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName = lastName;
    }
    public void setSalary(int salary){
        this.salary =  salary;
    }

    
}