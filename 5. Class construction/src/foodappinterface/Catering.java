package foodappinterface;

public class Catering implements CateringInterface {

    private final String name;

    public Catering(String name) {
        this.name = name;
    }

    @Override
    public void nameOfPlace() {
        System.out.println("Место называется: " + name);
    }

    @Override
    public void placeOnOrder(String food) {
        System.out.println(food + " успешно заказано.");
    }

    @Override
    public void provideFeedback(String feedback) {
        System.out.println("Был оставлен отзыв о " + name + ":");
        System.out.println(" - " + feedback);
    }
}
