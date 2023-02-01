package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {
    public static void main(String[] args) {

       /*
Iterators'lar Loop'ların yaptığı işi yapar.Iteratorslar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
Javanın Iterators'ları ortaya çıkarma sebebi sonsuz Loop tehlikesini bitirmektir.

Sonsuz Loop'lar memory dolana kadar çalışmaya devam eder. Application bu süreçte donar.
Buna firmalarda  "fire of the day" denir.
Iterator'larda sonsuz loop yoktur.Iterator'lar Java tarafından sonradan oluşturulmuşlardır.
Loop'ların yaptıkları bütün işlemleri yaparlar.
  Looplar ile Iteratorlarin performans farki yoktur ama Iteratorlar eleman silmede ve Update etmede daha basarilidir
  iki tip Iterator var
  1) ITERATOR : sadece elemanlari silebilirsiniz(remove)
                sadece soldan saga calisir. yani tek yonludur


  2) LISTITERATOR: eleman silme ve Update etme yapabilirsiniz
                    Hem soldan saga hemde sagdan sola calisabilir.
                    yani cift yonludur.
                    birde elemani "add" yapabilirsiniz.


 */

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");


        Iterator<String> itr1 = list1.iterator();
        while(itr1.hasNext()){
            itr1.next();

            itr1.remove();
        }
        System.out.println(list1);//[]
        //ListIterator yapicaz simdi
        //Example 1
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);
         ListIterator<String> listItr = list2.listIterator();

         while(listItr.hasNext()){
             String el = listItr.next();

             listItr.set(el+ "!");



         }
        System.out.println(list2) ;

         // Example 2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listItr2 = list3.listIterator();

        //Asagidaki loop pointeri en saga almak icin yazildi.
        while(listItr2.hasNext()){
            listItr2.next();
            //Asgidaki loop elemani en sondan en basa yazdirmak icin kullanildi.

        }
        while(listItr2.hasPrevious()){
             String el =listItr2.previous();
            System.out.println(el);


        }
    }


}
