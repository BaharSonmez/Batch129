package nighttime02;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        String stdNames [] = new String [2];
        stdNames[0] ="Bahar" ;
        stdNames[1] ="Ayse";
        System.out.println(Arrays.toString(stdNames));


        for (int i =0;    i < stdNames.length        ;     i++) {
            System.out.println(stdNames[i] + "?");
        }

        String a ="Germany";
        String tersA ="";
        for (int i =a.length()-1; i >=0; i--) {
            tersA=tersA+a.charAt(i);

        }
        System.out.println(tersA);



    }
}
