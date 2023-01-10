package day21statickeyword;

public class StdRunner {
    //stdName static oldugundan ona ulasmak icin object olusturmadim
    //Sadece class ismini kullanmak yeterli
    public static void main(String[] args) {
        System.out.println(Student.stdName);
        //age non static oldugundan ona ulasmak icin object olusturmak zorundayiz

        Student std1 = new Student();
        System.out.println(std1.age);
        Student std2 = new Student();


    }
}
