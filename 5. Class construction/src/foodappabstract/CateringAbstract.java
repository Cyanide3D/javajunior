package foodappabstract;

public abstract class CateringAbstract {

    private final String name;

    public CateringAbstract(String name) {
        this.name = name;
    }

    public void nameOfPlace() {
        System.out.println("Место называется: " + name);
    }

    public void placeOnOrder(String food) {
        System.out.println(food + " успешно заказано.");
    }

    public void provideFeedback(String feedback) {
        System.out.println("Был оставлен отзыв о " + name + ":");
        System.out.println(" - " + feedback);
    }

}
