package hospital_management_system;

import java.util.Scanner;

public class Doctor extends DataBank{
    Scanner scan =new Scanner(System.in);

    private  String doctorName;
    private  String surName;
    private  String title;

    public Doctor(String name, String surName, String title){
        this.doctorName =name;
        this.surName =surName;
        this.title =title;
    }
    public Doctor(){

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + doctorName + '\'' +
                ", surName='" + surName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    public void add(){
        System.out.println("Please enter doctor name:");
        String doctorName= scan.next();
        System.out.println("Please enter doctor surname:");
        String doctorsurName= scan.next();
        System.out.println("Please enter doctor title: 1-Allergist \n 2-Norolog \n 3-General Surgeon" );
        String doctorTitle= scan.next();
        Doctor doctor =new Doctor(doctorName,doctorsurName,doctorTitle);




    }
}
