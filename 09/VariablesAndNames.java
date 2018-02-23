public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven, test1, test2, test3, test4;
        double spaceInCar, carpoolCapacity, averagePassengersPerCar;
        
        cars = 100;
        spaceInCar = 4.0;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * spaceInCar;
        averagePassengersPerCar = passengers / carsDriven;
        test1 = 100;
        test2 = 50;
        test3 = test2;
        test4 = test1 / test3;
        
        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today."); // ew
        System.out.println("We need to put about " + averagePassengersPerCar + " passengers in each car."); // the answer is 3.0 so it has a decimal thing.
        
        // don't mind me
        System.out.println("Will the quotient of two integer variables be a double? Let's see . . . " + test4); // then why the heck was the average passenergewrwisfcar a double? ill be back
    }
}
