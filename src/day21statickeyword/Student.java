package day21statickeyword;

public class Student {

    //1)Static variable veya static methodlar (bunun ikisine kalas member derler)tum objeler icin ortak elemandir.

    //2)Static class memberlar uzerinde yapilan tum degisiklikler tum objectleri etkiler.
    //3) Static class memberlar Classa , non static class memberlar objelere monte edilir.
    //mesela bir class dan 100 tane object olusturdugunuzda non static olanlar 100 kere olusturulur,
    //ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur...
    //4)Static class memberlara ulasmak icin object olusturmaya gerek duyulmaz, ama non static class memberlara
    //ulasmak icin obje olusturmak sarttir.



  public  static String stdName ="Tom Hanks";//bu heryerden ulasilan static variable
  public int age = 13;//buda non static






}




