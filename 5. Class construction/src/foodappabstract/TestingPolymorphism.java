package foodappabstract;

public class TestingPolymorphism {

    public static void main(String[] args) {
        CateringAbstract cafe = new Cafe("Кафешечка");
        CateringAbstract restaurant = new Restaurant("Ресторанчик");

        cafe.nameOfPlace();
        cafe.placeOnOrder("Еда");
        cafe.provideFeedback("Отзыв");

        restaurant.nameOfPlace();
        restaurant.placeOnOrder("Еда");
        restaurant.provideFeedback("Отзыв");
        //CateringAbstract находится выше по иерархии классов, чем Cafe и Restaurant. Поэтому методы последних двух классов находятся вне зоны видимости.

        Cafe cafe1 = (Cafe) cafe;
        Restaurant restaurant1 = (Restaurant) restaurant;

        restaurant1.CallTheWaiter();
        restaurant1.getMenu();
        restaurant1.payTheBill();
        restaurant1.payATip();

        cafe1.viewTheAssortment();
        cafe1.payAtTheCashRegister();

        //cafe1 = restaurant1; - Ошибка компиляции, так как объекты находятся на одном уровне наследования.
    }

}
