package University_Management_System;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(2215,"harshit",8.0);
        Student s2 = new Student(2216 , "rohan" , 7.0);
        Student s3 = new Student(2217 , "harsh" , 7.5);

        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
        s1.setCGPA(9);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Priya Verma", 10, "Computer Science");
        pg.displayStudentDetails();

        pg.displayPostgraduateDetails();


    }





}
