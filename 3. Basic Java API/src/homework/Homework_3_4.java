package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Homework_3_4 {

    public static void main(String[] args) {
        int[][] array = makeArray(10, 10);
        System.out.println(negativeNumbersCount(array));
    }

    private static int min(int[][] numbers) {
        return arrayAsStream(numbers).min().orElse(-1);
    }

    private static int max(int[][] numbers) {
        return arrayAsStream(numbers).max().orElse(-1);
    }

    private static int sum(int[][] numbers) {
        return arrayAsStream(numbers).sum();
    }

    private static int negativeNumbersCount(int[][] numbers) {
        return (int) arrayAsStream(numbers).filter(num -> num < 0).count();
    }

    private static int positiveNumberCount(int[][] numbers) {
        return (int) arrayAsStream(numbers).filter(num -> num >= 0).count();
    }

    private static IntStream arrayAsStream(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream);
    }

    private static int[][] makeArray(int N, int M) {
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = new Random().nextInt(201) - 100;
            }
        }
        return array;
    }

}
