import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) 
    {
        int num1, num2, result;
        double divResult;
        String operation;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = scanner.nextInt(); //read user input 1

        System.out.println("Enter second number: ");
        num2 = scanner.nextInt(); //read user input 2

        System.out.println("Would you like to add, subtract, multiply, or divide the numbers? (Enter 'add' or 'subtract', 'multiply', or 'divide')");
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
        else if("multiply".equalsIgnoreCase(operation))
        {
            result = num1 * num2;
            System.out.println("The result of multiplication is: " + result);
        }
        else if("divide".equalsIgnoreCase(operation))
        {
            if (num2 != 0)
            {
                divResult = (double) num1 / num2;
                System.out.println("The result of division is: " + divResult);
            }
        }
        else
        {
            System.out.println("Cannot divide by zero.");
        }
    }
}