package day27encapsulationabstraction;
public abstract class Courses{

/*
    1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
    Body'si olmayan method'lara "abstract method"lar denir.

    2)"abstract method"'lar child class'lar tarafindan "override" edilmek zorundadırlar.
    Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseni
     o method'u  abstract yapmak gerekir.

     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
     "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

     4)"abstract method" lar siradan class'larin icine yazilamazlar."abstract method"larin icine yazildiklari
     class'lar da abstract olmak zorundadirlar.
     5)"Abstract class larda hem "abstract methodlar" hemde concrete methodlar kullanilabilir.
     6)Concrete Classlar Abstract Clkass larin child i olabilir.
        Abstract methodlarin Override edilme zorunlulugu Concrete Class lar icindir




 */


    public abstract void math();
    public void art(){
        System.out.println("Painting");
    }
    //final methodlar "override" edilemezler, halbuki "abstract " methodlar override edilmek icindir
    //Bu celiskidir, bu yuzden Java abstract methodlarin final olamsina musade etmez..
  //  public  abstract void science();

    //Concrete Class lar Final oldugunda Child Classa sahip olamazlar.
    //Ama Abstract Class lar icin Child Class olmalidir, cunku Child Class lar abstract parent class daki abstract
   // methodlari kullanilirlar.Bu yuzden JAVA Abstract Class larin Finalolamsina musade etmez.

    //Abstarct Methodlar Private olamazlar, cunku Child Class lar Abstract Methodlari kullanirlar.
    //Private yapinca kullanima kapali olur ve bu celiskidir bu yuzden Java Abstract Methodlarin Private olmasina\
    // musade etmez.

    //Abstract Methodlar Static olamazlar.Cunku Static methodlar Override edilemez.Halbuki Abstract Methodlar Override
    //edilmek icin olusturulmustur

//"abstract class"larin icinde "abstract method"lar vardir.
//"abstract method"larin body'si olmadigindan bu method'lar yarim method sayilir.
//Dolayisiyla; abstract class'lar eksigi olan kaliplar gibi dusunulebilir.
//Java eksik kaliplarin object uretmesine musaade etmez.
//Bu yuzden, abstract class'lardan object uretilemez.
// Courses myCourse = new Courses();
//Abstract Class alrin Constractir i vardir ama obje uretemez haldedir.

}
