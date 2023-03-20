package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
                int n=scanner.nextInt();
                System.out.println("Factorial of "+n+" is : " + calculator.factorial(n));
            }
            else{
                System.out.println("Exiting....");
                break;
            }
        }
    }
}