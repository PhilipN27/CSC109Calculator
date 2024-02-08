import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) 
    {
        int num1, num2, result;
        //Create a Scanner object
        String operation;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = scanner.nextInt(); //read user input 1

        System.out.println("Enter second number: ");
        num2 = scanner.nextInt(); //read user input 2

        System.out.println("Would you like to add or subtract the numbers? (Enter 'add' or 'subtract')");
        operation = scanner.next();

        if ("add".equalsIgnoreCase(operation))
        {
            result = num1 + num2;
            System.out.println("The result of adding is: " + result);
        }
        else if ("subtract".equalsIgnoreCase(operation))
        {
            result = num1 - num2;
            System.out.println("The result of subtraction is: " + result);
        }
        else
        {
            System.out.println("Invalid operation entered. Please enter 'add' or 'subtract'.");
        }

    }
}