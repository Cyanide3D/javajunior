package homework;

import java.util.stream.IntStream;

public class Homework_3_3 {

    public static void main(String[] args) {
        System.out.println(average(new int[]{54,4,2,26,24,3}));
    }

    private static int min(int[] numbers) {
        return IntStream.of(numbers).min().orElse(-1);
    }

    private static int max(int[] numbers) {
        return IntStream.of(numbers).max().orElse(-1);
    }

    private static double average(int[] numbers) {
        return IntStream.of(numbers).average().orElse(0.0);
    }

    private static int elementsBetweenMaxAndMin(int[] numbers) {
        int minElementIndex = 0;
        int maxElementIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxElementIndex]) {
                maxElementIndex = i;
            } else if (numbers[i] < numbers[minElementIndex]) {
                minElementIndex = i;
            }
        }

        return Math.max(minElementIndex, maxElementIndex) - Math.min(minElementIndex, maxElementIndex) - 1;
    }

}
