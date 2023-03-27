package homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Homework_2_5 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(5)));
    }

    private static int[] fibonacci(int n) {
        int[] sequence = new int[n + 1];
        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < sequence.length; i++)
            sequence[i] = sequence[i - 1] + sequence[i - 2];

        return sequence;
    }

}
