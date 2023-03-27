package homework41;

import java.util.stream.IntStream;

public class Homework_4_1 {

    public static void main(String[] args) {
        print(1);
        print("1");
        print(true);

        System.out.println(printString(1));
        System.out.println(printString("1"));
        System.out.println(printString(true));

        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
    }

    private static int print(int in) {
        System.out.println(in);
        return in;
    }

    private static boolean print(boolean in) {
        System.out.println(in);
        return in;
    }

    private static String print(String in) {
        System.out.println(in);
        return in;
    }

    private void test1() {
        System.out.println("Private method");
    }
    public void test2() {
        System.out.println("Public method");
    }
    protected void test3() {
        System.out.println("Protected method");
    }

    public static String printString(String title) {
        return title;
    }
    public static boolean printString(boolean title) {
        return title;
    }
    public static int printString(int title) {
        return title;
    }

    private static int sum(int... numbers) {
        return IntStream.of(numbers).sum();
    }

}

