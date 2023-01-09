package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] ="Art";
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length() + arr[arr.length-1].length());

        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] ="Atina";

        int totalChar = 0 ;

        for(int i=0 ; i<brr.length ; i++ ) {
            totalChar = totalChar + brr[i].length();

        }
            System.out.println(totalChar);

        int sum = 0;
        for(String w : brr){
            sum = sum + w.length();

        }
        System.out.println(sum);


















    }
}
