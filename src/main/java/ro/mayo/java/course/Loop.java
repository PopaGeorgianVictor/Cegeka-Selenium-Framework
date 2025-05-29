package ro.mayo.java.course;
import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 8;
        Loop m = new Loop();
        System.out.println(m.maxim(a, b, c));
        int[] v = {4,2,9,4,7,1,5};
        m.firstLoop(1);
        m.secondLoop(1);
        m.thirdLoop(1);
        m.moduloThree();
        m.sumaNumbers();
        m.sort(v);
    }

    int maxim(int a, int b, int c) {
        int max = 1;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        if (max >= c) {
            return max;
        }
        return c;
    }

    void firstLoop(int n) {
        while (n <= 9) {
            if (n == 1) {
                System.out.println("Un elefant se legana pe o panza de paianjen");
            } else if (n > 1) {
                System.out.println(n + " elefanti se leganu pe o panza de paianjen");
            }
            System.out.println("Si pentru ca panza nu se rupea, au mai chemat un elefant\n");
            n++;
        }

        System.out.println(n + " elefanti se leganu pe o panza de paianjen");

    }
    void secondLoop (int n){
        if(n<1){
            System.out.println("Nu avem niciun elefant");
        }
        do{
            if(n == 1){
                System.out.println("Un elefant se legana pe o panza de paianjen");
            }
            else if (n>1){
                System.out.println(n + " elefanti se leganu pe o panza de paianjen");
            }
            System.out.println("Si pentru ca panza nu se rupea, au mai chemat un elefant\n");
            n++;
            if(n == 10){
                System.out.println(n + " elefanti se leganu pe o panza de paianjen");
                System.out.println("Si pentru ca panza s-a rupt toti elefantii au cazut\n");
            }

        }while(n<=9);
    }
    void thirdLoop(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("Un elefant se legăna pe o pânză de păianjen");
                System.out.println("Și pentru că pânza nu se rupea, au mai chemat un elefant\n");
            } else if (i > 1 && i < 10) {
                System.out.println(i + " elefanți se legănau pe o pânză de păianjen");
                System.out.println("Și pentru că pânza nu se rupea, au mai chemat un elefant\n");
            } else if (i == 10) {
                System.out.println(i + " elefanți se legănau pe o pânză de păianjen");
                System.out.println("Și pentru că pânza s-a rupt, toți elefanții au căzut\n");
                break;
            }
        }
    }

    void moduloThree(){
        for (int n=1; n<=100; n++){
            if (n%3==0){
                System.out.println(n);
            }
        }
    }

    void sumaNumbers() {
        int[] array = {4, 2, 9, 4, 7, 1, 5};
        int sum = 0;
        for (int index = 0; index <= array.length; index++) {
            sum = sum + array[index];
        }
        System.out.println(sum);
    }

    void sort(int[] v) {
        int aux;
        for(int i=0;i<v.length-1;i++)
            for(int j=i+1;j<v.length;j++)
                if(v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
    }
}




