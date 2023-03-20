package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        while(true){
            System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                    "5. Exit\nEnter your choice: ");
            int choice;
            choice= scanner.nextInt();
            if(choice==1){
                System.out.print("Enter a number : ");
                double n=scanner.nextDouble();
                System.out.println("Factorial of "+n+" is : " + calculator.factorial(n));
            }
            else if(choice==2){
                System.out.print("Enter a number : ");
                double n=scanner.nextDouble();
                System.out.println("Square root of "+n+" is : " + calculator.squareroot(n));
            }
            else if(choice==3){
                System.out.print("Enter a number : ");
                double n=scanner.nextDouble();
                System.out.print("Enter power : ");
                double p=scanner.nextDouble();
                System.out.println(n+" raised to the power "+p+" is: " + calculator.power(n,p));
            }
            else if(choice==4){
                System.out.print("Enter a number : ");
                double n=scanner.nextDouble();
                System.out.println("Square root of "+n+" is : " + calculator.log(n));
            }
            else{
                System.out.println("Exiting....");
                break;
            }
        }
    }
}