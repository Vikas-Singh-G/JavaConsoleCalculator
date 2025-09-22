import java.util.Scanner;

public class Calculator {
    
    //Methods for Operations
    public static double add(double a, double b){
        return a+b;
    }
    
    public static double substract(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        if( b == 0) {
            System.out.println("Error:Division by zero is not allowed.");
            
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        boolean running=true;


        System.out.println("=====Java Console Calculator=====");
        while(running){
            System.out.println("\n Choose an Operation:");
            System.out.println("1. Addition");
             System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice:__\b\b ");

            int choice= scanner.nextInt();
            if(choice ==5) {
                System.out.println("Exiting Calculator... Goodbye, Have a Nice Day!!");
                running = false;
                continue;
            }

            System.out.print("enter first number:");
            double num1 = scanner.nextDouble();

            System.out.print("enter second number:");
            double num2 = scanner.nextDouble();

            double result=0;
            switch (choice){
                case 1:
                    result =add(num1 , num2);
                    break;
                case 2:
                    result =substract(num1 , num2);
                    break;
                case 3:
                    result =multiply(num1 , num2);
                    break;
                case 4:
                    result =divide(num1 , num2);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;

            }
            System.out.println("Result :" + result);
        }
        scanner.close();

    }
}//https://github.com/Vikas-Singh-G/JavaConsoleCalculator.git