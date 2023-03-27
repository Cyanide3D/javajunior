package homework;

public class Homework_2_3 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2012));
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0);
    }

}
