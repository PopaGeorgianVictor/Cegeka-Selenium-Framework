package ro.mayo.java.course;

public class Car {
    //String model;
    //String marca;
    int an;
    float km;
    private int topSpeed;

    public int getTopSpeed(){
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public Car(int an, float km){
        this.an = an;
        this.km = km;
    }

    public void startCar(){
        System.out.println("Start car");
    }

    public void stopCar(){
        System.out.println("Car stooped");
    }

    public void accelerateCar(){
        System.out.println("Accelerate car");
        setTopSpeed(130);
    }

    public static void main(String[] args) {
        Car car = new Car(150, 50);
        Renault car1 = new Renault(2020, 132, "Megan");
        Volvo car2 = new Volvo(2025, 432112, "XC90");
        Car car3 = new Volvo(2024, 31241, "XC40");
        car.startCar();
        car1.startCar();
        car2.startCar();
        car3.startCar();
        car1.brake();
        car.accelerateCar();
        car1.accelerateCar();
        car2.accelerateCar();
        car3.accelerateCar();
        car.stopCar();
        car1.stopCar();
        car2.stopCar();
        car3.stopCar();
    }
}
