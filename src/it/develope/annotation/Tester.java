package it.develope.annotation;
@SuppressWarnings("deprecation")
public class Tester {
    public static void main(String[] args) {
        Car car = new Car("Golf", 1000);
        car.printCarDetails();
        car.getCarDetails();
    }
}
