package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    // Kullanicadan data alip kodlarimizda kullanicaz

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //1.adim : Scannet Class tan object olustur
        Scanner input = new Scanner(System.in);
        //2.adim ; Kullaniciys ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");
        //3.adim uygun methodu kullanarak kullancinin verdigi datay memorye yerlestir

        byte age = input.nextByte();


    }
}
