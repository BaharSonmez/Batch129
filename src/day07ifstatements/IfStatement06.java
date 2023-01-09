package day07ifstatements;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age = input.nextInt();

        if (age<0 ) {

            System.out.println("Gcerli bir yas giriniz...");
        }else if (age<5){
            System.out.println("Bebek");
        }else if(age<13){
            System.out.println("Cocuk");
        }else if(age<21){
            System.out.println("Genc");

        }else if(age<31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis yas....");
        }

    }
}
