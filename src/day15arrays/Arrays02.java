package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        // example2; Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz

        String s = "Java brings you money";

        //1.YOL
      int vowels =  s.replaceAll("[^aeiuoAEUOI]" , "").length();
        System.out.println(vowels);
         //2.YOL Array -Loop
       String letters[]  = s.split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a ,b,

        int counter = 0;

         for(String w : letters){
             switch(w.toLowerCase()){
                 case"a" :
                 case"o" :
                 case"e" :
                 case "i":
                 case "u":
                     counter ++;



             }
         }
        System.out.println(counter);

    }
}
