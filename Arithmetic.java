package arithmetic;

import java.util.Scanner;
import arithmetic.ArithmeticBase.Operation;

public class Arithmetic 
{
    public static void main(String[] args) 
    {
        ArithmeticBase calculator = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        

        System.out.println("Enter first number: ");
        double num1 = in.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = in.nextDouble();
        
        System.out.println("\n" + "=".repeat(50));

        calculator.performAllOperations(num1, num2);
        
        System.out.println("\n" + "=".repeat(50));

        System.out.println("INDIVIDUAL OPERATIONS USING ENUM:");
        double result1 = calculator.calculate(num1, num2, Operation.PLUS);
        double result2 = calculator.calculate(num1, num2, Operation.MINUS);
        double result3 = calculator.calculate(num1, num2, Operation.TIMES);
        double result4 = calculator.calculate(num1, num2, Operation.DIVIDE);
        
        System.out.println("\nFINAL RESULTS SUMMARY:");
        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
        
        in.close();
    }
}