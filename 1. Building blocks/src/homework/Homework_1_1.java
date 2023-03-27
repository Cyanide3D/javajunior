package homework;

public class Homework_1_1 {

    //Программа печатает текст в консоли
    /*
    public - делает метод публичным, даёт возможность обратиться к методу откуда угодно.
    static - делает метод статичным, метод принадлежит классу а не объекту.
     */
    public static void main(String[] args) {
        System.out.println("Приход наш и уход загадочны, -- их цели");
        System.out.println("Все мудрецы земли осмыслить не сумели,");
        System.out.println("Где круга этого начало, где конец,");
        System.out.println("Откуда мы пришли, куда уйдем отселе?");
        System.out.println("О.Хайям");
        System.out.printf("Программа была создана %s %s",  args[0], args[1]);
    }

}
