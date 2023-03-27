package homework62;

import homework61.TestingExceptionLearn;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.util.ArrayList;

public class ExceptionHanding extends TestingExceptionLearn {

    public static void exception1() {
        try {
            TestingExceptionLearn.exception1();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Пойман IndexOutOfBoundsException");
        }
    }

    public static void exception2() {
        try {
            TestingExceptionLearn.exception2();
        } catch (DateTimeException e) {
            System.out.println("Пойман DateTimeException");
            e.printStackTrace();
        }
    }

}
