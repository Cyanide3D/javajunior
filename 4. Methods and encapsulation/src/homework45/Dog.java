package homework45;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав гав...");
    }

    @Override
    public void eat() {
        System.out.println("Употребляет пёсельский корм.");
    }

    @Override
    public String getDescription() {
        return "Стандартный пёсель в весьма нестандартном положении.";
    }
}
