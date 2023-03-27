package homework61;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class TestingExceptionLearn {

    public static void exception1() {
        new ArrayList<>().get(4);
    }

    public static void exception2() {
        DayOfWeek of = DayOfWeek.of(8);
    }

    public static void main(String[] args) {
        //Провоцирую выброс ошибки без использования throw :)
        TestingExceptionLearn.exception2();
    }

}
