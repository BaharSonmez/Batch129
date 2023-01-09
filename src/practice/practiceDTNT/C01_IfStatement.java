package practice.practiceDTNT;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {


        /*
        KullanicidaN bir gun alin eger gun Cuma ise "muslumanlar icin mubarek gun"
                                  eger gun cumartesi ise "Yahudiler icin Kutsal  gun"
                                  eger gun pazar ise "Hiristiyanlar icin kutsal gun" yazdirin

         */


        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz....");
        String gun = input.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar Icin Kutsal Gun");
        }else if(gun.equals("cumartesi ")) {
             System.out.println("Yahudiler Icin Kutsal Gun");
        }else if(gun.equals("pazar"))  {
            System.out.println("Hiristiyanlar IcinKutsal Gun");

        }else
            System.out.println("Kutsal gun degildir");





    }


}
