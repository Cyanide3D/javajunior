package homework;

public class Homework_2_6 {

    public static void main(String[] args) {
        System.out.println(firstAndLastNumbers(30034));
    }

    private static String firstAndLastNumbers(int number) {
        int first = (int) Math.floor(number / Math.pow(10, Math.floor(Math.log10(number))));
        int second = number % 10;
        return first + " " + second;
    }

}
