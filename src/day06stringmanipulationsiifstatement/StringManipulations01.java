

package day06stringmanipulationsifstatement;

import javax.sound.midi.Soundbank;

public class StringManipulations01 {

            public static void main(String[] args) {

                //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
                //             "   Ali Can   "     ==>      "Ali Can"
                String s = "   Ali Can  ";
                System.out.println(s);

                //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz
                String sTrimmed = s.trim();
                System.out.println(sTrimmed);

                //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
                //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
                String tv1 = "$456.99";
                String laptop1 = "$875.99";

                String tv2 = tv1.replace("$", "");
                System.out.println(tv2);// 456.99 ==> Ondalik sayilar Java'da otomatik olarak double kabul edilir.

                String laptop2 = laptop1.replace("$", "");
                System.out.println(laptop2);// 875.99

                Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
                System.out.println(totalPrice);//1332.98

                //Example 3: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
                //           "Ali Can" ==> AC
                String name = "    ali cAN    ";

                char first = name.trim().toUpperCase().charAt(0);
                System.out.println(first);// A

                char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
                System.out.println(second); // C

                System.out.println("" + first + second);// AC

                //Example 4: Bir String'in hic character icermedigini(Bos String) kontrol eden kodu yaziniz
                String str = "";

                //1.Yol: length() kullan
                boolean result1 = str.length()==0;
                System.out.println("String bos mu? " + result1);// true

                //2.Yol: isEmpty() kullan. Java bir konuda method uretmisse, o method'u kullanmak en iyisidir
                boolean result2 = str.isEmpty();
                System.out.println("String bos mu? " + result2); //true

                //Example 5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz

                String t = "        ";

                //1.Yol:
                boolean result3 = t.replace(" ", "").length()==0;
                System.out.println("Sadece space mi var? " + result3);

                //2.Yol:
                boolean result4 = t.replace(" ", "").isEmpty();
                System.out.println("Sadece space mi var? " + result4);

                //3.Yol:
                //isBlank() methodu sadece space iceren String'ler icin true verir, space disinda bir character icerirse false verir
                //isBlank() methodu bos String'ler icin de true verir.
                //isBlank() ==> space + hicbirsey icin true                isEmpty ==> hicbirsey icin true

                // Or: Bir String de a, e, i karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdirin


                String r = "Java is easy to learn";
               int idxA =  r.indexOf("a");
                System.out.println(idxA);
               int idxI = r.indexOf("i");
                System.out.println(idxI);
                int idxE = r.indexOf("e");
                System.out.println(idxE);

                System.out.println("indexlerin toplami: " +(idxE+idxA+idxI));

                String u = "Ah Java vah Java sensiz olmuyor Java.";
              int idxJava =  u.indexOf("Java");

                System.out.println(idxJava);

                int idxOfXyz = u.indexOf("xyz");
                System.out.println(idxOfXyz);

                //Or; Bir Strinde a,i, e karakterlerinin son gorunumlerinin index toplamlarini ekrana yazdiriniz

                String v ="Java is easy to learn";
               int idx0fA =  v.lastIndexOf("a");
                System.out.println(idx0fA);
                int idxofI = v.lastIndexOf("i");
                System.out.println(idxofI);
               int idxofE =  v.lastIndexOf("e");
                System.out.println(idxofE);


                System.out.println(idxofI + idxofE + idx0fA);

                //Or; Sayi cift ise ekrana cift yazdirin

                int num = 12;
                if (num>0) {
                    System.out.println("pozitif");

                }

                int number = 123;

                 number=Math.abs(number);
                if (number>99 && num<1000) {
                    System.out.println("Woow");


                }
                




                }





            }










