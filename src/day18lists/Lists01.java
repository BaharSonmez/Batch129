package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //Ex: integer bir list olusturun
        //liste 5 tane eleman ekleyin.
        //bu elemanlardan 12 yi siliniz



        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(12);
        ages.add(40);
        ages.remove((Integer)12);
        System.out.println(ages);
        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);
        ages.removeAll(silinecekler);
        System.out.println(ages);










    }
}
