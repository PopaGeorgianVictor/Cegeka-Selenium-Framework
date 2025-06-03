package ro.mayo.java.course;

public class Dog extends Animal{
    int var2 = 4;

    public Dog(int var1, int var2){
        super(var1);
        this.var2 = var2;
        System.out.println("Dog");
    }

    public void m2() {
        System.out.println("m2");
    }
}


