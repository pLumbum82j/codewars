package six;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SixCode {
    public static void main(String[] args) {
//        System.out.println(isAnagram("foefet", "toffee"));
//        System.out.println(isLove(1, 1));
//        System.out.println(longest("aretheyhere", "yestheyarehere"));
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {
        var chars = s.split("");
        return IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));

//        String[] temp = s.toLowerCase().split("");
//        String[] strings = new String[temp.length];
//        for (int i = 0; i < temp.length; i++) {
//            strings[i] = "";
//            for (int j = 0; j < i + 1; j++) {
//                strings[i] += temp[i];
//            }
//
//        }
//        List<String> rrr = Arrays.stream(strings).map(z -> z.substring(0, 1).toUpperCase() + z.substring(1)).collect(Collectors.toList());
//        String result = rrr.stream().map(res -> res + "-").collect(Collectors.joining());
//        result = result.substring(0, result.length() - 1);
//
//        return result;
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
