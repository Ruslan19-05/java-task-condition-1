package az.edu.turing;

import java.util.Scanner;

public class LoopApp {
    public static void main(String[]args){
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int number=scanner.nextInt();
        //prosess
        if (number%2==1){
            System.out.println("Number is odd");
        }else if(number%2==0 && number!=0){
            System.out.println("Number is even");
        }else if(number<0){
            System.out.println("Number is negative");
        }else if(number>0){
            System.out.println("Number is pozitiv");
        }else if(number==0){
            System.out.println("Number equal to zero");
        }
        //output

    }
}
