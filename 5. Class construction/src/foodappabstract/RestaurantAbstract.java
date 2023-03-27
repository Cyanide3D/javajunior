package foodappabstract;

public abstract class RestaurantAbstract extends CateringAbstract {

    public RestaurantAbstract(String name) {
        super(name);
    }

    public abstract void CallTheWaiter();
    public abstract void getMenu();
    public abstract void payTheBill();
    public abstract void payATip();

}
