package nighttime08;

public class KumandaRunnner {
    public static void main(String[] args) {

        Kumanda tv = new Kumanda(11.5,7,9.8);
        tv.gucDugmesi();
        System.out.println(tv.kanalDegistirme("B"));//B
        System.out.println(tv.sesArttirma());//11
        System.out.println(tv.sesAzaltma());//10



    }
}
