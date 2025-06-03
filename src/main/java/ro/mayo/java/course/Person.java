package ro.mayo.java.course;

public class Person {

    String name = "George";
    String jobName = "QA";
    int age = 32;

    void sayHi(){
        System.out.println("Hi! My name is" + name + ".");
    }

    void happyBirthday(){
        age = age + 1;
        System.out.println("Happy birthday to me . I am now " + age + " years old.");
    }

    void promotion(String newRole){
        jobName = newRole;
        System.out.println("Congrats to me ! I am now the " + jobName);
    }

    public static void main(String[] args) {
        Person me = new Person();
        me.sayHi();
        me.happyBirthday();
        me.promotion("SDET");
    }
}
