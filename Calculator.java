import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) 
    {
        int num1, num2, sum;
        //Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = scanner.nextInt(); //read user input 1

        System.out.println("Enter second number: ");
        num2 = scanner.nextInt(); //read user input 2

        sum = num1 + num2; //calculate sum of number 1 and 2

        System.out.println("The sum is: " + sum); //Prints sum
    }
}