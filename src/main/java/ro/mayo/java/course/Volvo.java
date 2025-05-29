package ro.mayo.java.course;

public class Volvo extends Car{
    String model;
    String marca = "Volvo";

    public Volvo(int an, float km, String model) {
        super(an, km);
        this.model = model;
    }

    public void accelerateCar(){
        System.out.println("Volvo accelerate");
        setTopSpeed(200);
    }
}
