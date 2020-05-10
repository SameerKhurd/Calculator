package Calculator;

import java.io.*;
import java.util.Scanner;

public class App
{
    static Calculator calculator;
    public static void main( String[] args ) {
        calculator = new Calculator();
        start();
    }

    public static  void start(){
        Scanner sc = new Scanner(System.in);
        int operation;
        int x, y;

        while(true) {
            System.out.println("\n-------------------------------------- Calculator --------------------------------------------------");
            System.out.println("[1] Add");
            System.out.println("[2] Subtract");
            System.out.println("[0] Exit");
            System.out.print("Enter the option : ");

            operation = sc.nextInt();

            if (operation == 0)
                return;
            else if (operation > 3 || operation < 1) {
                System.out.println("Invalid option!");
                continue;
            }

            System.out.print("Enter 1st value : ");
            x = sc.nextInt();
            System.out.print("Enter 2nd value : ");
            y = sc.nextInt();
            switch (operation) {
                case 1: {
                    System.out.println("Result : " + calculator.add(x, y));
                    break;
                }
                case 2: {
                    System.out.println("Result : " + calculator.subtract(x, y));
                    break;
                }
                default: {
                    System.out.println("Invalid option!");
                }
            }
        }
    }
}
