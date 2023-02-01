package day25inheritance;



public class Honda extends Car {
    public int price = 10000;

    public Honda(){

        System.out.println("Honda 1");

    }
    public Honda (String model, int year){
        super();// super() yazmasaniz da ayni isi gorur.beni parenta goturucek,parametresiz constractiri cagiricak.
        System.out.println("Honda 2 " + model+ " - " + year);
    }
}
