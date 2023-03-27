package foodappabstract;

import java.util.List;

public class Restaurant extends RestaurantAbstract {

    private List<String> menu = List.of(
            "Фрикадельки",
            "Эчпочмаки",
            "Сюрстрёминг",
            "Вяленная селёдка"
    );

    public Restaurant(String name) {
        super(name);
    }

    @Override
    public void CallTheWaiter() {
        System.out.println("Был вызван официант.");
    }

    @Override
    public void getMenu() {
        System.out.println("Меню ресторана:");
        menu.forEach(System.out::println);
    }

    @Override
    public void payTheBill() {
        System.out.println("Счёт оплачен.");
    }

    @Override
    public void payATip() {
        System.out.println("Были оставлены чаевые в ресторане.");
    }
}
