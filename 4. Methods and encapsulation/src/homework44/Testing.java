package homework44;

import java.util.List;

public class Testing {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", "Ivanov", "One", 5),
                new Student("Maxim", "Maximov", "Two", 4),
                new Aspirant("Alexandr", "Alexandrov", "Three", 5)
        );

        students.forEach(e -> System.out.println(e.getScholarship()));
    }

}
