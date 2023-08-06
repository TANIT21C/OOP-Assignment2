public class main {
    public static void main(String[] args) {
        vehicle[] vehicles = new vehicle[4];
        vehicles[0] = new car("RM 1", "Subaru", "X5", 100, 4);
        vehicles[1] = new car("RM 2", "Toyota", "Vios", 120, 2);
        vehicles[2] = new motorcycle("RM 3", "Yamaha", "YZF-R6", 80, 600);
        vehicles[3] = new motorcycle("RM 4", "Kawasaki", "Ninja 650", 90, 650);

        int rentalDays = 5;

        for (vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("Rental Cost for " + rentalDays + " days: RM " + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof motorcycle) {
                System.out.println("Top Speed: " + ((motorcycle) vehicle).calculateTopSpeed() + " km/h");
            }
            System.out.println();
        }
    }
}