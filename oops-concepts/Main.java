
public class Main {

    public static void main(String[] args) {
        System.out.println("naveen swami");

        Audi a4 = new Audi();

        Audi naveenkiA4 = new Audi(3, "100CC", "Black", 10);

        naveenkiA4.color = "Grey"; // we also change color ,engie wheels,fuel
        System.out.println(naveenkiA4.color);
        // System.out.println(a4.color); // output null aya
        // System.out.println(a4.engine); // output null aaya
        // System.out.println(a4.wheels); // output 0 aaya
        // System.out.println(a4.fuelCapacity); // output 0 aaya
        // // ye null, null,0,0 isleye aaya kyuki hmne line 37 to 40 me kuch value
        // define nhi ki

        System.out.println(naveenkiA4.color);
        System.out.println(naveenkiA4.wheels);
        System.out.println(naveenkiA4.engine); // output comes from line 10
        System.out.println(naveenkiA4.fuelCapacity);

        // a4.color = "Black";
        // a4 is an object
        // a4.engine = "W16";
        // a4.wheels = 5;
        // a4.fuelCapacity = 50;

        // System.out.println(a4.engine);

        // Audi r8 = new Audi(); // this r8 is type , tukda , instance of Audi
        // // r8 is an object jiske andr m uski ik property call krva rhi hu
        // // DOT (. ) it means call kr rhi is leye Dot lgaya h
        // r8.color = "Graphite"; // line 15 to 20 is instance of class body
        // r8.engine = "M10";
        // r8.wheels = 4;
        // r8.fuelCapacity = 30;

        // System.out.println(r8.color);
    }
}

class Audi { // blueprint of class
    String color;
    String engine; // line 24 to 30 is Class
    int wheels;
    int fuelCapacity;

    // constructor h ye
    // constructor ka koi return type nhi hota
    // "this" refer to the object for which it been call
    public Audi() {
        // this.wheels = 4;
        System.out.println("Aapki audi tyr h "); // uncomment line 6 then it print aapki audi tyr h
    }

    public Audi(int wheels, String engine, String color, int fuelCapacity) {
        this.color = color;
        this.engine = engine;
        this.wheels = wheels; // line 42 -47 is k leye line 8 call hogi
        this.fuelCapacity = fuelCapacity;

    }
}
