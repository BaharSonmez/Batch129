package practice.practiceDTNT;

import java.util.Scanner;

public class Tester01 {
    public static void main(String[] args) {
        //Ex HH:40 tan 23 e kadar tum cift sayilari ekrana yazdiran kodu yaziniz.
        for (int i = 40; i >23; i--) {
            if (i%2==0){
                System.out.println(i);
            }

        }
        int a= 40;
        while(a>23){
            if(a%2==0){
                System.out.println(a+" ");
            }
            a--;
        }
        // Size verilen kucuk harfle yazilmis Stringin index i cift sayi olan karakterlerini buyuk harf yapiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime yaziniz");
        String str = input.next().toUpperCase();

        for (int i = 0; i < str.length() ; i++) {
            if(i%2==0){
                System.out.println(i);
            }

            
        }

        











        




























    }
}
