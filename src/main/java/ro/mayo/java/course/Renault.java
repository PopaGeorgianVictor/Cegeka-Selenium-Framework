package ro.mayo.java.course;

public class Renault extends Car{
    String model;
    String marca = "Renault";

    public Renault(int an, float km, String model) {
        super(an, km);
        this.model = model;
    }

    public void accelerateCar(){
        System.out.println("Renault accelerate");
        setTopSpeed(150);
    }

    public void brake(){
        System.out.println("Renault brake");
    }
}
