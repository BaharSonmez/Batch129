package day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        Object obj = 70;
        String  str = " ";
        try {
             str = (String) obj;//ClassCastException hatasi verdi.Run butonuna bastiktan sonra hata aldim
            //Birbirine donusturulemeyecek data tiplarini donusturmekte israr ederseniz ClassCastExceptoin atar
            //Yani bu calaas bu classa donusturulemez...
            //Bunu handle etmemiz gerekir, boyle risk varmis Try Catch kullanmaliyiz

        }catch(ClassCastException e){
            System.out.println("Her data type i her data type na cevrilemez");

        }

        System.out.println(str);

    }
}
