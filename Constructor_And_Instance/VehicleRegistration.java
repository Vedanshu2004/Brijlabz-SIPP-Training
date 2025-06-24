public class VehicleRegistration {

    public String ownerName;
    public  String vehicleType;

    public static  double registrationFee = 5000;

    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("Owner Name is :- " + ownerName);
        System.out.println("Vehicle Type is :- " + vehicleType);
        System.out.println("Registration Fee for Vechile is :- " + registrationFee);
    }

    public static void updateRegistrationFee(double newRegistrationFee){
        registrationFee = newRegistrationFee;
    }
}
