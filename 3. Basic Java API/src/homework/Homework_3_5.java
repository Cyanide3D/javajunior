package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework_3_5 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qwerty");
        list.add("qwertyghj");
        list.add("abe");
        list.add("awe");
        list.add("eeewqwe");

        System.out.println(makeList(list, 6));
        System.out.println(list);
    }

    private static List<String> makeList(List<String> list, int n) {
        List<String> array = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() <= n) {
                array.add(s);
                iterator.remove();
            }
        }

        list.sort(String::compareTo);
        array.sort(String::compareTo);

        return array;
    }

}
