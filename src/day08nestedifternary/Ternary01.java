
package day08nestedifternary;

import java.util.Objects;
import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1.Yol: if-else
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2.Yol: Ternary
        //             Condition   ?  Condition true ise calisir    :    Condition false ise calisir     ;
        double result =    a<b     ?               a                :                  b                 ;
        System.out.println(result);


        int m = 5 ;
        int n = 6 ;
       Object r3 = (m>0 && n>0) || (m<0&& n<0) ? a*b : "Farkli isaretli sayilari carpamiyorum..";

    }

}
