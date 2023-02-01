package day34mapsiterators;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        /*
        1)Hastable " thread-safe " ve "synchronized" dir.
        2) Hastable entryleri  rastgele siralar.
        3) Hastable lar Hasmaplere gore daha yavastirlar.
        4)HasTable lar key lerde ve value larda Null kullanilmasina musade etmezler.


        NOT: Multi Thread ve Synchornization kullanmaniz gerekirse ve Key ve Valuelarda Null kullanmak yasak ise
        HasTable kullanmak gerekir

         */


        Hashtable <Integer, Integer > ht = new Hashtable <>();
        ht.put(1,2); // 1 ve -1 boleni var.
        ht.put(2, 4); // 2 nin 4 tane boleni var
        ht.put(6,8);  // 6 nin 8 tane boleni var 1,2,3,6,-1,-2,-3,-6

        System.out.println(ht);


    }
}
