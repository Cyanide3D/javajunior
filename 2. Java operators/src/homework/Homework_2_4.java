package homework;

public class Homework_2_4 {

    public static void main(String[] args) {
        System.out.println(sumOddNumbers(5));
    }

    private static int sumOddNumbers(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0)
                result += i;
        }

        return result;
    }

}
