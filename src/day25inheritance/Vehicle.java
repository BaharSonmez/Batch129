
package day25inheritance;

        public class Vehicle {

            /*
                1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
                  parent class'dan baslatilarak alta dogru calistirilir.
                2)Child Class taki constructordan Parent class taki constructor a gidebilmek icin "super()" kullanilir.
                3)Parent Class ta birden fazla constructor varsa istenilen constructor, super () ifadesinin parantezi
                icina yazilan parametreler yardimi ile secilebilir
                4)Ayni Class icindeki constructor lari secmek icin this() kullanilir.
                Ayni class ta birden fazla constructor varsa istenilen constructor, this() ifadesinin parantezi icine
                yazilan parametreler yardimi ile secilebilir.
                5) "super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki super () varmis gibi davranir.
                Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
                6)"super()" ve "this" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
                7)bir constructor icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilir.
                8)Inheritance da variable lari  ve methodlari cagirmak icin "this" veya "super" kullanilir.parantez kullanilmaz.
                "this"ayni class icindeki variable lari ve method lari cagirmak icin kullanilir.
                "super" parent class icindeki variable ve methodlari cagirmak icin kullanilir.
                9) Inheritance da object kullanarak variable cagirirsaniz , object in data tipini temsil eden classtan
                variable i aramaya baslayiniz.o claas ta yoksa parent lara bakiniz.
                10) Inheritance da object kullanarak method cagirirsaniz objectin constructorini temsil eden class tan method aramaya
                baslayiniz. o claas ta yoksa parentlara bakiniz...


             */
            public Vehicle(){
                System.out.println("Vehicle 1");
            }
            public int price = 12000;





            public Vehicle(int price){
                System.out.println("Vehicle 2: " + price);
            }

        }


