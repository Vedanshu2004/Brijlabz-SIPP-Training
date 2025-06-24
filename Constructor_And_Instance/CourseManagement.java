public class CourseManagement {
    public String courseName;
    public int duration;
    public double fee;

    public static String collageName = "xyz";

    public CourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails(){
        System.out.println("CourseName :- " + courseName);
        System.out.println("Duration of Course :- " + duration);
        System.out.println("Fee detail of course :- " + fee);
        System.out.println("Collage Name is :- " + collageName);
    }

    public static  void updateInstituteName(String newCollageName){
        collageName = newCollageName;
    }

}
