package homework43;

public class Human {

    public static String name;
    public static int age;

    static {
        name = "Ivan";
        age = 14;
    }
    {
        name = "Maxim";
        age = 98;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(Human.age);
        System.out.println(Human.name);
        Human human = new Human();
        System.out.println(human.getAge());
        System.out.println(human.getName());
        //При создании объекта значение полей перезаписались значением из обычного блока инициализации.
    }

}
