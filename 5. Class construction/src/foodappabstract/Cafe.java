package foodappabstract;

import java.util.List;

public class Cafe extends CafeAbstract {

    private List<String> menu = List.of(
            "Сосиски",
            "Запеченные устрицы",
            "Усики носорога",
            "Утиные лапки"
    );

    public Cafe(String name) {
        super(name);
    }

    public void viewTheAssortment() {
        System.out.println("Меню кафэ:");
        menu.forEach(System.out::println);
    }

    @Override
    public void payAtTheCashRegister() {
        System.out.println("Заказ успешно оплачен на кассе.");
    }
}
