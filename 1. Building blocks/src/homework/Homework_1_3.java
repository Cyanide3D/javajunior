package homework;

public class Homework_1_3 {

    /*
    Создать по 2 переменные типов данных Boolean, long, float и выведите их на экран.
    Создайте всеми возможными способами переменную типа char и выведите на экран.
    */

    public static void main(String[] args) {
        byte byteDecimal = 123;
        byte byteBinary = 0b1111011;
        byte byteHexadecimal = 0x7B;
        byte byteOctal = 0173;

        System.out.println(byteDecimal);
        System.out.println(byteBinary);
        System.out.println(byteHexadecimal);
        System.out.println(byteOctal);

        short shortDecimal = 999;
        short shortBinary = 0b1111100111;
        short shortHexadecimal = 0x3E7;
        short shortOctal = 01747;

        System.out.println(shortDecimal);
        System.out.println(shortBinary);
        System.out.println(shortHexadecimal);
        System.out.println(shortOctal);

        int intDecimal = 1;
        int intBinary = 0b1;
        int intHexadecimal = 0x1;
        int intOctal = 01;

        System.out.println(intDecimal);
        System.out.println(intBinary);
        System.out.println(intHexadecimal);
        System.out.println(intOctal);

        long longDecimal = 123454321;
        long longBinary = 0b111010110111100001101110001;
        long longHexadecimal = 0x75BC371;
        long longOctal = 0726741561;

        System.out.println(longDecimal);
        System.out.println(longBinary);
        System.out.println(longHexadecimal);
        System.out.println(longOctal);

        boolean boolOne = true;
        boolean boolTwo = false;

        System.out.println(boolOne);
        System.out.println(boolTwo);

        float floatOne = 1.5F;
        float floatTwo = 2.0F;

        System.out.println(floatOne);
        System.out.println(floatTwo);

        long longOne = 12341234;
        long longTwo = 43214321;

        System.out.println(longOne);
        System.out.println(longTwo);

        char charOne = 100;
        char charTwo = '\u039A';
        char charThree = 'A';
        char charFour = '\t';

        System.out.println(charOne);
        System.out.println(charTwo);
        System.out.println(charThree);
        System.out.println(charFour);
    }

}