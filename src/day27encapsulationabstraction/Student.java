package day27encapsulationabstraction;

public class Student {
    String stdId ="AC123";
    private double gpa = 3.99;
    private boolean poor = true;



    public String getStdId() {
        return stdId;
    }

    /*
    Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,
icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
Bu ise kapsulleme ingilizce ENCAPSULATION denir. Benim ilk aldigim offerda aldigim soru buydu.
What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
offer alirsiniz :)) dedi.
    "private" access yaparak encapsulation yapmis oluruz. Ilanin disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.
Simdi size dicekler ki encapsulation nedir. Data Hiding. Data nasil saklanir. Access Modifier private yapariz. diyeceksiniz, dedi.
    */


    //encapsualtion yapilmis datayi okuyabilirmiyiz?
    //Get Methodlar encapsule edilmis (saklanmis) datayi okumamiza yarar.
    // get methodlarin diger adi Getter
    // get methodlar her zaman public olur.
    // get methodlarin return type Variablenin Data type ile ayni olur.
    //get methodlarin (getter) isimler  get + variable name seklinde olur.
    //get methodlarin isimleri variable boolean ise "is + variable" olur.
    //get methodlar parametre kullanmazlar.



public double getGpa(){
    return gpa;

}

    public boolean isPoor() {
        return poor;
    }
    //Encapsule Yapilmis datalarin degeri degistirilebilir mi?
    //Set METHODLAR Public oluyor ve bunlara Setter denir.
    // Set methodlari encapsule edilmis datalarin degerlerini degistirir.
    // Setter lar her zaman Public olur.
    // Set methodlarin retrun Type i her zaman Void olur.
    // set methodlarin isimleri "set + variable name " olur.
    // set methodlar variable ile ayni data tipinde parametre kullanirlar.


    public void setGpa(double gpa) {

        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }
}
