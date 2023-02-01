package day29exceptions;

import java.io.FileInputStream;// io == Input Output
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {
    /*
    1)FileNot FoundException  ve IOException Time  Exception lardir yani code yazarken hata verir.
    2)FileNotFoundException Path i dogrulugu ve dosyanin varligi ile ilgilidir.
    IOException tum input ve output islemleri ile ilgilidir.
    3)IOException Class Filenotfoundexception clasiin parentidir

     */


    public static void main(String[] args) {
        try {
            FileInputStream fis =new FileInputStream("src\\day29exceptions\\File01.txt ");

            int k = 0;
             while((k= fis.read())!=  -1){

                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
