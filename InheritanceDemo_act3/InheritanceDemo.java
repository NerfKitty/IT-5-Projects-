/**
 * InheritanceDemo.java
 */
class Vehicle {

    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }
}

class Car extends Vehicle {
    int numberOfDoors;


    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Toyota", 2020);
        Car car = new Car("Nissan", 2023, 4);
        Vehicle vehicle1 = new Car("Mitsubishi", 2019, 6);
      
        //car
        car.start();
        car.stop();

        //vehicle
        vehicle.start();
        vehicle.stop();
      
        // vehice 1 referenced to the car object
        vehicle1.start();
        vehicle1.stop();


    }

}