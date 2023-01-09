package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lists02 {
    public static void main(String[] args) {
        //Birtane Integer list olusturun sonra bu listte
        //birbirine en yakin iki tam sayiyi yaziniz

        //[12,23,9,11,35] ==> bu bir interwiev sorusu ben ekrana 12,11 yazdirmaliyim
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);

        System.out.println(nums);

        int minDiff = nums.get(1)-nums.get(0);
        System.out.println(minDiff);

        for (int i =1 ;  i<nums.size() ; i++){
           minDiff = Math.min(minDiff , nums.get(i) - nums.get(i-1));




        }
        System.out.println(minDiff);






















    }
}
