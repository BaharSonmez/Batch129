package day27encapsulationabstraction;

public class SeventhGraders extends  Courses{
    @Override
    public void math() {
        System.out.println("Seventh graders math ...");

    }

    @Override
    public void art() {
        super.art();
    }
}
