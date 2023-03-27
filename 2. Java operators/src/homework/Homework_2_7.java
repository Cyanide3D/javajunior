package homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Homework_2_7 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(prime(100)));
    }

    private static int[] prime(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i < n; i++) {
            for (int j = i * i; j < n; j += i) {
                prime[j] = false;
            }
        }

        return IntStream.range(2, n).filter(num -> prime[num]).toArray();
    }

}
