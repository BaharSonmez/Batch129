
import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
        Example 1: Asagidaki kurallara göre kullanicinin girdigi password'u kontrol ediniz.
        1) En az 8 character olsun
        2) Space character i olmasin
        3) En az 1 tane büyük harf olsun
        4) En az 1 tane kücük harf olsun
        5) En az bir tane sembol olsun
        6) En az bir tane rakam olsun

        pwd: krktr8Mi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //1) En az 8 character olsun
        boolean first = pwd.length() > 7;
        System.out.println(first);

        //i) en az 8 karakter olsun
        boolean firstRule = pwd.length() > 7;
        System.out.println(firstRule);

        //ii) space olmasın
        boolean secondRule = !pwd.contains(" ");
        System.out.println(secondRule);

        //iii)en az 1 tane büyük harf olsun
        // NOTE: Büyük harf olmayanları silip kalan karakter sayısına bakıp karakter sayısı sıfır "0" ise
        // büyük harf yok demektir. Sıfırdan büyükse büyük harf vardır.

        boolean thirdRule = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println(thirdRule);

        //iv) en az 1 tane küçük harf olsun

        boolean forthRule = pwd.replaceAll("[a-z]", "").length() > 0;
        System.out.println(forthRule);

        //v) en az 1 tane sembol olsun
        boolean fifthRule= pwd.replaceAll("[a-zA-Z]","").length()>0;
        System.out.println(fifthRule);

        //vi) En az 1 tane rakam olsun
        boolean sixthRule= pwd.replaceAll("[0-9]", "").length()>0;
        System.out.println(sixthRule);


    }
}




































