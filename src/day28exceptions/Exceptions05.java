package day28exceptions;

import javafx.scene.chart.ScatterChart;

public class Exceptions05 {
    public static void main(String[] args) {
    int a = 12;
    int b = 4;
    String s = "My Java";


    }
    //try kisminda birden fazla exception ihtimali olan kod varsa , coklu Catch kullanabilirsin..
    //Coklu Catch kullandiginizda Exception Classlar arasinda Parent Child iliskisi yoksa , Catch lerin sirasi
    //onemli degildir ama koddaki siralamaya uymak uygundur.
    //Coklu Catch kullandiginizda Exception Classlar arasinda "parent-Child" iliskisi varsa , Catchlerin sirasi
    //onemlidir, Child olan Class ustte olmalidir..

    //Exception Classlar arasinda Child ve Parent iliskisi varsa , ya child classi uste yazarak child ve parent  classlar
    //icin ozellestirilmis codelar yazarsiniz(Hirsiz icin=155, hasta icin 112)
    //Veyaa child i hic kullanmaz sadece Parent ile exceptionlari handle etmeye calisirsiniz(Hirsiz=911, Hasta=112)


    public static  void getCharAtFromString(String s , int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);


        } catch (ArithmeticException e){
        System.out.println("Do not divide by Zero");
    }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandiniz");
        }
        }








}
