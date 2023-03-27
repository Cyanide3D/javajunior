package foodappabstract;

public abstract class CafeAbstract extends CateringAbstract {

    public CafeAbstract(String name) {
        super(name);
    }

    public abstract void viewTheAssortment();
    public abstract void payAtTheCashRegister();

}
