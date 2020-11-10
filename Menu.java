package company_EMS;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public static void mainMenu(Company comp){
        System.out.println("\033[H\033[2J");
        System.out.println("Please choose an action from the following:");
        System.out.println("1. Company");
        System.out.println("");
        System.out.println("2. Department");
        System.out.println("");
        System.out.println("3. Exit");
        int e = prompt(3);
        switch(e){
            case 1:
                System.out.println("choosing 1");
                companyMenu(comp);
                break;
            case 2:
                System.out.println("choosing 2");
                break;
            case 3:
            System.out.println("Exiting program.");
                return;
        }
    };
    public static void companyMenu(Company comp){
        System.out.println("\033[H\033[2J");
        System.out.println("Please choose an action from the following: ");
        System.out.println("1. Company Information");
        System.out.println("");
        System.out.println("2. change funding to a department");
        System.out.println("");
        System.out.println("3. Transfer a employee");
        System.out.println("");
        System.out.println("4. Look up an employee");
        System.out.println("");
        System.out.println("5. Assign new employee to a department");
        System.out.println("");
        System.out.println("6. Save company information to a file");
        System.out.println("");
        System.out.println("7. Back to main menu");
        System.out.println("");
        System.out.println("8. Exit");
        int e = prompt(8);
        switch(e){
            case 1:
                System.out.println("choosing 1");
                comp.companyInfo();
                Scanner sc1 = new Scanner(System.in);
                sc1.nextLine();
                //sc.close();
                companyMenu(comp);
                //prompt(limit)

                break;
            case 2:
                System.out.println("choosing 2");

                break;
            case 3:
                System.out.println("choosing 2");
                break;
            case 4:
                System.out.println("Exiting program.");
                break;
            case 5:
                System.out.println("choosing 2");
                break;
            case 6:
                System.out.println("choosing 2");
                break;
            case 7:
                mainMenu(comp);
                System.out.println("Back to main menu");
                return;
        }

        return;
    }



    public static int prompt(int limit){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Please choose from the list:");
        int choice;
        while(true){
            try{
                choice = sc.nextInt();
                getChoice(choice, limit);
                break;
            }catch(MenuChoiceException e){
                sc.nextLine();
                System.out.println(e.getMessage());
            }catch(Exception e){
                sc.nextLine();
                System.out.println("Please enter a number.");
            }
        }
        //sc.close();
        return choice;
    }

    public static deptUpdatePromp(Company comp){
        Scanner sc2 = new Scanner(System.in);
        List<String> parameterList= new List<>();

        while(true){
            System.out.print("Please enter department name: ");
            try{
                Department prevDept = comp.getDept(sc2.nexLint());

            }catch(Exception e){
                
            }

        }
        parameterList.add(sc2.nextLine());
        }
        System.out.print("Please enter changed amount: ");

        parameterList.add(sc2.nextLine());


        Department prevDept = comp.getDept(parameterList.get[0]);
        System.out.println("before:");
        System.out.println("Department: " + prevDept.getName() + " Budget: " + prevDept.getBudge());
        System.out.println(" ");
        preDept.updateBudget(parameterList.get[1]);
        System.out.println("After:");
        System.out.println("Department: " + prevDept.getName() + " Budget: " + prevDept.getBudge());
        System.out.println("Department: " + prevDept.getName() + " Budget: " + prevDept.getBudge());

    }


    public static void getChoice(int input, int limit) throws MenuChoiceException{  
                if(input > limit || input < 1){
                    throw new MenuChoiceException(limit);
                } 
    }

}
