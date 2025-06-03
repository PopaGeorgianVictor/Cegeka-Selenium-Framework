package ro.mayo.java.course;

public class Calculator {
    int a = 5;
    int b = 8;

    int sum(int a, int b){

        return a+b;
    }

    int subtract(int a, int b){

        return a-b;
    }

    int multiply(int a, int b){

        return a*b;
    }

    double divide(int a, int b){

        return (double) a/b;
    }

    int modulus(int a, int b){

        return a%b;
    }

    boolean isInRange(int value){
        return (0 < value) && (value < 100);
    }

    int increasedBy(int value, int addNr){
        value += addNr;
        return value;
    }

    boolean greatherThan(int a, int b){
        return  a > b;
    }

    public static void main(String[] args) {
        Calculator calc  = new Calculator();
        System.out.println(calc.sum(calc.a, calc.b));
        System.out.println(calc.subtract(calc.a, calc.b));
        System.out.println(calc.multiply(calc.a, calc.b));
        System.out.println(calc.divide(calc.a, calc.b));
        System.out.println(calc.modulus(calc.a, calc.b));
        System.out.println(calc.isInRange(55));
        System.out.println(calc.isInRange(555));
        System.out.println(calc.increasedBy(123,1323));
        System.out.println(calc.greatherThan(1231, 123213));
        calc.sum(calc.a, calc.b);
        calc.subtract(calc.a, calc.b);
        calc.multiply(calc.a, calc.b);
        calc.divide(calc.a, calc.b);
        calc.modulus(calc.a, calc.b);

    }
}
