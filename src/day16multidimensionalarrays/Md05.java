package day16multidimensionalarrays;

public class Md05 {

    public static void main(String[] args) {
        //example ; Bir multi-diemensinol array olusturun
        //bu araydeki tum elemenlarin carpimini konsola yazdiran kodu yazdirin

        int a [] [] ={{2,5}, {4,7,11}};
        int carpim = 1;

        for (int[] w:a){
            for(int k:w){
                carpim = carpim*k;

            }
        }
        System.out.println(carpim);

    }
}
