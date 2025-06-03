package ro.mayo.java.course;

public class Copil {
    String sex;
    String eyeColour;
    int height;
    String name;
    int scor = 10;

    public Copil(){

    }

    public Copil(String sex, int height, String name){
        this.sex = sex;
        this.height = height;
        this.name = name;
    }

    public Copil(String sex, String eyeColour, int height, String name, int scor){
        this.sex = sex;
        this.eyeColour= eyeColour;
        this.name= name;
        this.scor= scor;
    }

    @Override
    public String toString() {
        return "Copil{" +
                "sex='" + sex + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", scor=" + scor +
                '}';
    }

    public static void main(String[] args){
        Copil c1 = new Copil();
        System.out.println(c1.toString());
        c1.height = 50;
        c1.name = "Gigel";
        System.out.println(c1.toString());

        Copil c2 = new Copil("masculin", 52, "Ionel");
        System.out.println(c2.toString());

        Copil c3 = new Copil("feminin", "blue", 51, "Maria", 9);
        System.out.println(c3.toString());

    }
}


