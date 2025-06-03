package ro.mayo.java.course;

public class Animal {
    int var1 = 10;

//    public Animal(){
//        System.out.println("Animal");
//    }

    public Animal(int var1){
        this.var1 = var1;
    }

    public void m1(){
        System.out.println("m1");
    }

    public static void main(String[] args) {
        Animal a1 = new Dog(1, 2);
        a1.m1();
    }
}
