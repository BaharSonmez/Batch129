package day05typecastingstringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {
        String s ="Java is easy";
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);


        String sLower = s.toLowerCase();
        System.out.println(sLower);

        char firstChar = s.charAt(0);
        System.out.println(firstChar);

       char secondChar = s.charAt(1);
        char secondLast = s.charAt(10);
        System.out.print(secondChar);
        System.out.println(secondLast);

        //2.Yol

        System.out.println("" +secondChar + secondLast);

        //"s" Stringinde kac deger kullanildigini bulan methodu yazdirin

       int sLenght =  s.length();
        System.out.println(sLenght);


        //"s" stringindeki ilk dort karakteri aliniz..

       String sub01 = s.substring(0, 4);
        System.out.println(sub01);

        // sub string te ilk index dahil 4 yani ikinci index harictir
         // OR; "s" STRINDEKI is kelimesini yazdirin

      String sub02 =  s.substring(5, 7);
        System.out.println(sub02);

       String sub03=s.substring(8 ,12);
        System.out.println(sub03);


        // Bir karakterden baslayip Stringin sonuna kadar almak isterseniz ikinci Indexi yazmayiniz.


        //or; S stringinde money kelimesinin var olup olmadigini kontrol ediniz
       boolean isExist =  s.contains("money");
        System.out.println(isExist);

         /*
        Bir methodu ogrenirken 3 seyi ogrenin
        1) Bu method ne is yapar?
        2) Bu methodun farrkli kullanimlari nasildir
        3) Bu method size ne return eder yani ne sonuc verir, yani size ne tip method verir. string mi integer mi...
        */


       //OR: S stringinin belli bir harf ile baslayip baslamadigini kontrol ediniz

       boolean isStart = s.startsWith("J");
        System.out.println(isStart);

        //Or: s Stringinin 6. karakterden itibaren belli bir harf ile baslayip baslamadigini kontrol ediniz...




















    }
}
