package homework63;

public class TestingMethodWithException {

    private static int balance = 0;

    public static void main(String[] args) {
        try {
            pay(15);
        } catch (NoMoneyException e) {
            System.out.println("Упс, похоже я забыл деньги дома, нужно сходить на ними...");
        } finally {
            System.out.println("Пришёл такой домой и взял деньги с полки.");
            balance += 20;
            pay(15);
        }
    }

    private static void pay(int price) {
        System.out.println("Пришёл значит такой в магазин, и выбираю себе вкусняху.");
        if (balance < price)
            throw new NoMoneyException();
        System.out.println("Успешно купил вкусняху.");
    }

}
