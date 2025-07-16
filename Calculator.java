import java.util.Scanner;

public class Calculator{
    public static void main(String []a){
        Scanner input  = new Scanner(System.in);
        String again = "y";

        while(again.equalsIgnoreCase("y")){
            System.out.println("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.println("Chose operation (+, -, *, /): ");
            char ch = input.next().charAt(0);

            if(ch == '+'){
                System.out.println("Result: "+ (num1 + num2));
            }
            else if(ch == '-'){
                System.out.println("Result: "+ (num1 - num2));
            }
            else if(ch == '*'){
                System.out.println("Result: "+ (num1 * num2));
            }
            else if(ch == '/'){
                if(num2==0){
                    System.out.println("Cannot divide by zero");
                }
                else
                    System.out.println("Result: "+ (num1 / num2));
            }
            else{
                System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue again? (y/n)");
            again = input.next();
        }
    }
}