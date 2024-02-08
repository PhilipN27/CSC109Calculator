import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result = 0;
        char operation;

        System.out.println("Enter first number: ");
        number1 = scanner.nextDouble(); //read user input 1

        System.out.println("Enter second number: ");
        number2 = scanner.nextDouble(); //read user input 2

        System.out.println("Would you like to +, -, *, or / the numbers? (Enter '+' or '-', '*', or '/')");
        operation = scanner.next().charAt(0);

        switch(operation)
        {
        case '+':
            result = number1 + number2;
            break;
        case '-':
            result = number1 - number2;
            break;
        case '*':
            result = number1 * number2;
            break;
        case '/':
            if (number2 != 0)
            {
                result = number1 / number2;
            }
            else
            {
                System.out.println("Cannot divide by zero.");
                return;
            }
            break;
        default:
            System.out.println("Invalid operation.");
            return;
        }
        System.out.println("The result is: " + result);
    }
}