package practice06;

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.m();
        System.out.println(b.x);

        C c = new B();
        c.m();//
        System.out.println(c.x);//10
        C d = new C();
        d.m();//goood
        System.out.println(d.x);

        D child = new  D();
        System.out.println(child.x);
        System.out.println(child.sayi);
        child.m();

        C bebek = new D();
        System.out.println(bebek.x);
        bebek.m();//Bad





    }
}
