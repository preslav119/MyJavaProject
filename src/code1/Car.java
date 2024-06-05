package inclass;

public class Car {
    String model;
    double maxSpeed;
    double currentSpeed;
    String color;
    int gear;
    double price;
    String plateNumber;
    boolean isSportCar;
    Person owner;

    Car(){
        this.price = 21537;
    }

    Car(String model, boolean isSportCar, String color) {
        this.model = model;
        this.isSportCar = isSportCar;
        this.color = color;
        this.gear = 1;
        this.currentSpeed = 1;
    }

    Car(String model, boolean isSportCar, String color, double price, double maxSpeed) {
        this(model, isSportCar, color);
        this.price = price;
        if (!isSportCar && maxSpeed > 200) {
            this.maxSpeed = 150;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    void changeOwner(Person owner) {
        this.owner = owner;
    }

    void changeGear(int newGear) {
        if (newGear <= 5 && newGear >= 1) {
            gear = newGear;
            System.out.println("New gear: " + gear);
        } else {
            System.out.println("Gear not allowed");
        }
    //        gear = newGear;
    }

    void accelerate() {
        currentSpeed = currentSpeed + 10;
    }

    double calculateCarPriceForScrap(double metalPrice) {
        double coef = 0.2;
        if (isSportCar) {
            coef += 0.05;
        }
        if (color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("White")) {
            coef += 0.05;
        }

        return coef;
    }

    void gearUp() {
        if (gear < 5) {
            gear++;
        } else {
            System.out.println("Max gear selected");
        }
    }

    void gearDown() {
        if (gear > 1) {
            gear--;
        } else {
            System.out.println("You're already on 1st gear");
        }
    }
}
