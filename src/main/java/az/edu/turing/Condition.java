package az.edu.turing;

import java.util.Scanner;

public class Condition {

    public static void main(String[]args) {
        //input-task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int number = scanner.nextInt();
        //prosess
        if (number < 0)
            System.out.println("Number is negative");
            else if (number > 0)
            System.out.println("Number is pozitiv");
            if (number % 2 == 1)
                System.out.println("Number is odd");
            if (number % 2 == 0 && number != 0)
                System.out.println("Number is even");
            if (number == 0)
                System.out.println("Number equal to zero");

            //output

        }
    }

