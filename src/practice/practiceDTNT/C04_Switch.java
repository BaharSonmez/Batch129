package practice.practiceDTNT;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {
        for(   int i=21   ; i<181       ;  i++ ){

            if(i%4==0 && i%6==0){
                System.out.print(i +" ");



            }


        }

        System.out.println();
        String s = "ankara";
        for( int i=0 ; i<s.length();  i++ ){

            String ch = s.substring(i, i+1);


            if(i%2==0 ){
                System.out.println(ch.toUpperCase());


            }
        }









    }
}
