package nighttime03;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ifade giriniz");

        String str = input.nextLine();



        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)==' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }










    }
}
