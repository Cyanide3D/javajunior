package foodappinterface;

public class Testing {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Хромая лошадь");
        Cafe cafe = new Cafe("Шаверма 24/7");

        restaurant.nameOfPlace();
        restaurant.CallTheWaiter();
        restaurant.getMenu();
        restaurant.placeOnOrder("Шаверма");
        restaurant.payTheBill();
        restaurant.payATip();
        restaurant.provideFeedback("Нямка");

        cafe.nameOfPlace();
        cafe.viewTheAssortment();
        cafe.placeOnOrder("Алла Пугачева");
        cafe.payAtTheCashRegister();
        cafe.provideFeedback("Вкуснотища");
    }

}
