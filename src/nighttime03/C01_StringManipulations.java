package nighttime03;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {
/*
                            String Class Methodlari

                1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                            ii)equals() method'u "boolean" return eder.

                2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
                                        kucuk harfe dikkat etmeden anlamamiza yarar.
                                    ii) equalsIgnoreCase() method'u "boolean" return eder.
                3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                                    ii) toLowerCase() method'u "String" return eder

                4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                                ii) toUpperCase() method'u "String" return eder

            5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                        ii) charAt() method'u "char" return eder.

            6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                        ii) length() method'u "int" return eder.
            7)contains(): i)Bir String'de belli bir characterin veya
                            characterlerin var olup olmadigini anlamak icin
                            kullanilir
                          ii) contains() method'u "boolean" return eder.
            8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
                            ii)split() method'u "Array" return eder.
            9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
                            istenilen karakter ya da metinle degistirilmesini saglar.
                            Sonuc String'dir..
            10)replaceFirst()
                           i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
     */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
       1) \\d    ==> tum rakamlar digit
          \\D    ==> tum rakam disi character ler
       2) \\w   ==> A->Z    a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
          \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
       3) \\s   ==> space tum bosluklar space
          \\S   ==> space disindaki hersey

               12) + Concat: Bir String'e diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.



        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.

         */

        System.out.println("Yuz"+40+60);
        System.out.println("Yuz"+(40+60));//Parantez onceligi var//yuz100 yazar
        System.out.println("Ikiyuzkirk"+40*6);//Carpmanin bolmenin parantezin onceligi var//ikiyuzkirk240
        System.out.println(60+40+"Yuz");//100Yuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi giriniz");
        String name = input.nextLine() , soyad = input.nextLine();//Multiple declaration...
        String tamIsim = name.concat(""+ soyad).toUpperCase();
        System.out.println("tamIsim=" + tamIsim);

        //Rakam haricindekileri silin

        String str ="$45..99";
        str =  str.replaceAll("\\D" , "");
        System.out.println("str =" + str);

        //Verilen cumleyi yildiz ile gizleyip 10. karakterden sonrasini yazdirin...
        String cumle = "Her dert Java gibi olsa";
        System.out.println( cumle.replaceAll("\\W" , "*")+cumle.substring(10));

        // a harfini @ isareti ile degistir

        String ders = "olaganustu";
        System.out.println( ders.replace("a", "@"));

        //Verilen bir stringdeki  kullanilan noktalama isareti ve rakamlar ve space karakteri haric tum
        // karakterlerin sayisini bulan kodu yaziniz





        String str3="Learn $Java earn 90000000 money,!... ";
        int sonuc= str3.replaceAll("[0-9]","").
                replaceAll(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println("sonuc = " + sonuc);//sonuc = 18










    }
}