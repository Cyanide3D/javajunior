package homework42;

public class Testing {

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", 14);
        Person p2 = new Person();

        p1.move();
        p1.talk();
        p2.move();
        p2.talk();
    }

}
