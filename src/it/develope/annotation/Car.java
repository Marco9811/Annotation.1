package it.develope.annotation;

public class Car {
    public String modelName;
    public double mileage;

    public Car(String modelName, double miles){
        this.modelName = modelName;
        this.mileage = miles;
    }

    @Deprecated
    public void printCarDetails(){
        System.out.println(modelName + " " + mileage);
    }

    public void  getCarDetails(){
        System.out.println(modelName);
        System.out.println(mileage);
    }
}
