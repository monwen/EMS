package company_EMS;
import java.util.InputMismatchException;

public class MenuChoiceException extends Exception{
    private static int lastNumber;

    public MenuChoiceException(int lastNumber){
        super("Please enter from 1 to "+ lastNumber+".");

        lastNumber = lastNumber;
    }
}
