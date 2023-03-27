package homework46;

import java.util.List;
import java.util.function.Predicate;

public class Homework_4_6 {

    public static void main(String[] args) {
        Predicate<String> predicate = word -> (word.startsWith("N") || word.startsWith("J")) && word.endsWith("A");
        List<String> strings = List.of("NJHA", "WERTW", "JSDWA", "NSDJF");
        strings.stream().filter(predicate).forEach(System.out::println);
    }

}
