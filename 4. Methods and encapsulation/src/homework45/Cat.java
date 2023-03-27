package homework45;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяяяяяяяяяяяу...");
    }

    @Override
    public void eat() {
        System.out.println("Питается исключительно мышинной кровью.");
    }

    @Override
    public String getDescription() {
        return "Чеширский плотоядный тибетский кот-вампир, любящий поспать и хорошо покушать.";
    }
}
