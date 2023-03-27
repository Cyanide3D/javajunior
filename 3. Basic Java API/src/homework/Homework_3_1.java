package homework;

public class Homework_3_1 {

    public static void main(String[] args) {
        System.out.println(longestPal(new String[]{"123", "313", "52125"}));
    }

    private static boolean isPal (String str) {
        if (str.isEmpty())
            return false;

        String[] letters = str.split("");
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (!letters[start].equals(letters[end]))
                return false;
            start++;
            end--;
        }
        return true;
    }

    private static String longestPal (String [] strings) {
        String longestPal = "";
        for (String string : strings) {
            if (isPal(string) && string.length() > longestPal.length()) {
                longestPal = string;
            }
        }

        return longestPal;
    }

}
