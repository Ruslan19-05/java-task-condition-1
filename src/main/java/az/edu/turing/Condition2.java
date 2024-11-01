package az.edu.turing;

import java.util.Scanner;

public class Condition2 {

    public static void main(String[]args){
        //input task1
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result="";
        //prosess
        switch(number%2){
            case 1:
                result= "Number is odd";
            case 0:
                result="Number is even";
        }
        if(number<0){
            result="Number is negative";

        }else
            result="Number is pozitive";
        if(number==0){
            result="Number equal to zero";
        }
        //output
        System.out.println(result);
    }
}
