public class Employees {

    public static void main(String[] args) {
        Employees as1 = new Employees();

    }
}

class Employees {
    int id;
    int salery;
    int level;
    String name;

    public Employees() {
        System.out.println("we creat employees please fill details");

    }

    public Employees(String name, int id, int level, int salery);this.id=id;this.name=name;this.salery=salery;this.level=level;

}