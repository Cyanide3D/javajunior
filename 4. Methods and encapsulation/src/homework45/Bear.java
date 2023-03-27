package homework45;

public class Bear extends Animal {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Рррррррррррр...");
    }

    @Override
    public void eat() {
        System.out.println("Кушает грешников по вечерам.");
    }

    @Override
    public String getDescription() {
        return "Рогатый демон-медведь из преисподней.";
    }
}
