package az.edu.turing;

import java.util.Scanner;

public class LoopApp1 {

    public static void main (String[]args){
        //task3
        //input
        Scanner scanner=new Scanner(System.in);
        //prosess
        //Big letter
        char[] azerbaijanalFB={'A','B','C','Ç','D','E','Ə','F','G','Ğ','H','X','J','K','Q','L','I','İ','L','M','N','O','Ö','U','Ü','P','S','R','T','V','Y','Z'};
        //little letter
        char[] azerbaijanalfb={'a','b','c','ç','d','e','ə','f','g','ğ','h','x','j','k','q','l','ı','i','l','m','n','o','ö','u','ü','p','s','r','t','v','y','z',};
        for( int i=0;i<=31;i++ ){
            System.out.println(azerbaijanalFB[i]+"-"+azerbaijanalfb[i]);
        }
    }
}
