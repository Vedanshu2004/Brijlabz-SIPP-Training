package University_Management_System;

public class PostgraduateStudent extends Student {
    String specialization;


    public PostgraduateStudent(int rollno, String name, int CGPA , String specialization) {
        super(rollno, name, CGPA);
        this.specialization =  specialization;
    }


    public void displayPostgraduateDetails(){
        System.out.println("PG Student Name :- " + name);
        System.out.println("Speclization :- " + specialization);
    }
}
