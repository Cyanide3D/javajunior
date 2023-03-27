package foodappinterface;

import java.util.List;

public class Cafe extends Catering implements CafeInterface {
    private List<String> menu = List.of(
            "Сосиски",
            "Запеченные устрицы",
            "Усики носорога",
            "Утиные лапки"
    );

    public Cafe(String name) {
        super(name);
    }

    @Override
    public void viewTheAssortment() {
        System.out.println("Меню кафэ:");
        menu.forEach(System.out::println);
    }

    @Override
    public void payAtTheCashRegister() {
        System.out.println("Заказ успешно оплачен на кассе.");
    }
}
