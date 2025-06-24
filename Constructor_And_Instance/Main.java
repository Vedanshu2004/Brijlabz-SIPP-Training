public class Main{
    public static void main(String[] args) {

//	Product product1 = new Product("laptop",50000);
//	Product product2 = new Product("mobile",10000);
//	Product product3 = new Product("shoes",5000);
//	Product product4 = new Product("shirt",500);
//
//	product1.displayProductDetails();
//	product2.displayProductDetails();
//	product3.displayProductDetails();
//	product4.displayProductDetails();
//
//	Product.displayTotalProducts();

//	CourseManagement courseManagement1 = new CourseManagement("B.tech",4,100000);
//	CourseManagement courseManagement2 = new CourseManagement("BBA",3,450000);
//	CourseManagement courseManagement3 = new CourseManagement("MCA",2,300000);
//
//	courseManagement1.displayCourseDetails();
//	courseManagement2.displayCourseDetails();
//
//	CourseManagement.updateInstituteName("gla university");
//	courseManagement3.displayCourseDetails();

    VehicleRegistration vehicle1 = new VehicleRegistration("rahul","two wheel");
    VehicleRegistration vehicle2 = new VehicleRegistration("sumit","four wheel");
    VehicleRegistration vehicle3 = new VehicleRegistration("sohan","two wheel");
    vehicle1.displayVehicleDetails();
    vehicle2.displayVehicleDetails();
    VehicleRegistration.updateRegistrationFee(10000);

    vehicle3.displayVehicleDetails();



    }
}