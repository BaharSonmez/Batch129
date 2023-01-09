package day17arraylists;

import java.util.ArrayList;

public class ArrayList02 {


    public static void main(String[] args) {
//Array List olustururken sag tarafa Array List yazmak zorundasinz ama
        // sol tarafa ister Array List yazin ister List yazin. Ikiside calisir

        ArrayList<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir Listte kac eleman oldugunu nasil anlariz?
        int numOfElement = initials.size();
        System.out.println(numOfElement);//4

        //Array'lerden bahsederken "length" kullanin , Listlerden bahsederken 'size' kullanin..

       char u = initials.get(2);  // Bir Listten bir eleman nasil alinir...
        System.out.println(u); //M


        //EX:Verilen bir String Listteki elemanlarin karakter sayisini bulan kodu yaziniz..







        }



    }
