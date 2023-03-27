package homework;

import java.util.Arrays;

public class Homework_3_2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(separate("abcdefghijklmnopqrstuvwx", 4)));
        System.out.println(Arrays.toString(separate("abcdefghijklmnopqrstuvwx", 5)));
    }

    private static String[] separate(String str, int n) {
        if (str.length() % n != 0)
            return new String[]{};

        String[] array = new String[n];
        int elementsInNewString = str.length() / n;
        for (int i = 0; i < n; i++) {
            array[i] = str.substring(i*elementsInNewString, i*elementsInNewString + elementsInNewString);
        }

        return array;
    }

}
