package homework45;

public abstract class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();
    public abstract void eat();
    public abstract String getDescription();
    public String getName() {
        return name;
    }
}
