package day29exceptions;

public class Exceptions02 {
    /*
    "Throw ile Trows arasindaki fark nedir"
    1)"throw " method body si icinde , "throws " ise method parantezinden hemen sonra kullanilir
    2)"throw " method body si icinde istenilen yerde istenildigi kadar kullanilir.
    3)"throw" dan sonra "new " keyword ve "constructor" kullanilarak object olusturulur.
       "throws " dan sonra sadece Exception Class ismi yazilir.
    4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application i Exception attiktan sonra durdu
    rulur.
     */
    public static void main(String[] args) throws IllegalArgumentException, ArithmeticException{
        try {
            printAge(-18);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
      //  try {
        // getMark(-100);
     //   }catch(IllegalArgumentException e){
      //      System.out.println(e.getMessage());
     //   }






    }
    //Throw keyword bir methodun bodysinde istedigimiz yerde , istedigimiz kosullar icin
    //Exception atmamizi saglar....
    //"throw" keyword yazildiktan sonra bir Exception Class objecti olusturulur
    //Exception Class constructirinin icine istediginiz Exception mesajini yazabilirsiniz
    //kullanicidan yasini alip ekrana yazdiricak method olusturucam..
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {


            System.out.println(age);
        }
    }
    //Ogrenci notlari girisi yapan ve notlari konsola yazdiran bir method olusturubuz..
     public static void getMark(double d){
         System.out.println(d);
         if (d<0){
             throw new IllegalArgumentException("Marks can not be less than zero");

         }else if (d>100){
             throw new IllegalArgumentException("Marks can not  be greater than hundred");
         }else{
             System.out.println(d);
         }

     }





}
