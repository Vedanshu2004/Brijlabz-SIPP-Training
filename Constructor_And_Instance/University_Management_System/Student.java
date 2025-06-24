package University_Management_System;

public class Student {
    public int rollno;
    protected String name;
    private double CGPA;


    public Student(int rollno, String name, double CGPA) {
        this.rollno = rollno;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA(){
        return CGPA;
    }

    public void setCGPA(int CGPA) {
        if(CGPA >= 0.0 && CGPA < 10.0){
            this.CGPA = CGPA;
        }
        else {
            System.out.println("Invalid CGPA ");
        }
    }

    public void displayStudentDetails(){
        System.out.println("Student Name :- " + name);
        System.out.println("Student rollno :- "+ rollno);
        System.out.println("CGPS :- " + CGPA);
    }

    public static void main(String[] args) {
        Student student = new Student(1, "harsh", 5.0);
        student.displayStudentDetails();
    }
}
