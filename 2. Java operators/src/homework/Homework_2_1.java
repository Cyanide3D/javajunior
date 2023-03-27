package homework;

public class Homework_2_1 {

    public static void main(String[] args) {
        System.out.println(reverseNumber(30));
    }

    private static int reverseNumber(int number) {
        if (number < 10 || number > 99)
            throw new RuntimeException();

        return Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
    }

}
