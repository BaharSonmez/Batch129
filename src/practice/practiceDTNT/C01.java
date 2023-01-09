package practice.practiceDTNT;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {


        /* INTERWIEW QUESTIONS
        Kullanicidan bir String aliniz.
        String'de var olan her character'in sayisini ekrana yazdiriniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz..");
        String str = input.nextLine();

        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int counter =0;
         for(int i = 1; i<arr.length; i++  ){

             if(arr[i-1].equals(arr[i])){
                 counter++;  // ayni olanlar icin bir arttir

             }else {
                 System.out.println(arr[i-1] + "karakterinin sayisi "+ (counter+1) +"kez tekrarlanmistir");
                 counter = 0; //baska harfe gectigi icin sifirlanmali

             }
             if(i==arr.length-1)//defalarca kodu yazdirmasin diye sona geldiginde yazdirsin

             System.out.println(arr[i] + "karakterinin sayisi "+(counter+1)+"kez tekrarlanmistir");
         }









    }
}
