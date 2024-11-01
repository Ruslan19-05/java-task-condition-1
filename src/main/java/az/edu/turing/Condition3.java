package az.edu.turing;

import java.util.Scanner;

public class Condition3 {

    public static void main(String[]args){
        //task2
        //input
        System.out.print("Which mounth tell me:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result="";
        switch(number){
            case 1:
                result="Janvar";
                break;
            case 2:
                result="Febrauary";
                break;
            case 3:
                result="Mart";
                break;
            case 4:
                result="April";
                break;
            case 5:
                result="May";
                break;
            case 6:
                result="June";
                break;
            case 7:
                result="July";
                break;
            case 8:
                result="Aughst";
                break;
            case 9:
                result="September";
                break;
            case 10:
                result="Octeber";
                break;
            case 11:
                result="November";
                break;
            case 12:
                result="december";
                break;
        }
        if(number==3 || number==4 || number==5){
            System.out.println("Spring");
        }else if(number==6 || number==7 || number==8){
            System.out.println("Summer");
        }else if(number==9 || number==10 || number==11){
            System.out.println("Autumn");
        }else
            System.out.println("Winter");
        //output
        System.out.print("Mounth:"+result);

    }

        }
