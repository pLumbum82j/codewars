package six;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SixCode {
    public static void main(String[] args) {
//        System.out.println(isAnagram("foefet", "toffee"));
//        System.out.println(isLove(1, 1));
        System.out.println(longest("aretheyhere", "yestheyarehere"));
    }


    public static String longest(String s1, String s2) {
        return Arrays.stream((s1 + s2).toLowerCase().split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());

    }

    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }

    public static boolean isAnagram(String test, String original) {
        char[] one = test.toLowerCase().toCharArray();
        char[] two = original.toLowerCase().toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        return Arrays.equals(one, two);
    }
}
