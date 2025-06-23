package com.durgasoft;

import java.util.Scanner;

import static com.durgasoft.calculator.calculator.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean countineucalculator=true;

        while(countineucalculator){

            System.out.print("Enter firs number");
            double num1=scanner.nextDouble();

            System.out.print("Enter operator (+ , -, *, /)");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number");
            double num2=scanner.nextDouble();

            double resulte;
            switch((int) operator){
                case '+':
                    resulte = add(num1,num2);
                    break;
                case '-':
                    resulte = subtrack(num1,num2);
                    break;
                case '*':
                    resulte = multiply(num1,num2);
                    break;
                case '/':
                    resulte = divide(num1,num2);
                    break;
                default:
                    System.out.print("Invalid operator");
                    continue;
            }

            if(!Double.isNaN(resulte)) {
                System.out.print("Result :" + resulte);
                System.out.println();
            }


            System.out.print(" Do you want to continue? (yes/no)");
            String choice = scanner.next();
            if(!choice.equalsIgnoreCase("yes")) {
                countineucalculator=false;
                System.out.print("thank you for using calculator!");
            }


        }
    }
}