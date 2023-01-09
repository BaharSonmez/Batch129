package nighttime03;

public class C03_DoWhileLoopMaymunSurvive {


    public static void main(String[] args) {
        int numberofbananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            System.out.println("*****Maymunlar yasamak icin gunde 4 muz y****");
            numberofbananas-=4;
            System.out.println("Kalan muz sayisi " +numberofbananas);
            survivalDays++;
            if (numberofbananas<4){
                monkeyAlive=false;

                System.out.println("bugun" +survivalDays+ ".gun yeterli muz kalmadi.Maymun oldu");
                System.out.println("Maymun "+ survivalDays+ ".gun oldu");

            }else
                System.out.println("Bugun "+survivalDays+".gun maymun yasiyor");






        }while(monkeyAlive);

    }
}
