package day24accessmodifiersinheritance;

public class Animal {
    /*
    Inheritance'in faydalari;
1) Code standardında tekrar iyi değildir.
2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
3) Gelişime update'e açık olmalıdır
4) Code atomic yapıda olmalı.
Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız.
note 3 : Public methodlar child classlar tarafindan kullanilabilir(inherint).
Note 4: Protected methodlar inherit edilebilir.
   cunku protected olan method ve variable lar child' lar tarafindan kullanilabilir.
Note:5 Default Method lar obje ile ayni package de olduklari surece inherit edilebilir.
       Ama default mr=ethod ile object in uretildigi class farkli pacage lerde ise inherint edilemez.
Note 6 : Private Methodlar inherit edilemezler.
Note 7 : Java birden fazla parent i onaylamaz yani (multible inherintance)olmaz
Note 8 : Child -- Parent -- Grand Parent --Grandgrand Parent .. seklinde ilerleyen inheritance lara Multi Level Inheritance
denir.

Note 9: Javada Object Class tum Java classlarinin ortak parentidir.
Note 10: Javada Object Class haric tum class larin parenti vardir.
  java da parenti olamayan tek class Object Class tir.
Note 11 : Java da parent dan Child a olan iliskilere "HAS A RELATIONSHIP denir
          Java da child dan Parent e olan iliskilere  "IS A RELATIONSHIP denir.
Note 12 : Java da her Class in bir tane Default Constractir i vardir.
          Bu default constractir Class in icinde gorunmez cunku Dfault constractor object class icindedir.
          Bizim class imiz default constractor a ihtiyac duydugunda parent olan object class a gider oradaki constractir
          i kullanir.

     */
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }



}
