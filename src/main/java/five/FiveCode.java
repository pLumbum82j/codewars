package five;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FiveCode {
    public static void main(String[] args) {
//        System.out.println(number(Arrays.asList("a", "b", "c")));
//        System.out.println(Arrays.toString(minMax(new int[]{1,4,5,66,9,3,2,68})));
//        System.out.println(checkForFactor(63, 7));
    }

    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }

    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        result[0] = Arrays.stream(arr).min().getAsInt();
        result[1] = Arrays.stream(arr).max().getAsInt();
        return result;
    }

    public static List<String> number(List<String> lines) {
        var n = new AtomicInteger(0);
        return lines.stream().map(p -> n.incrementAndGet() + ": " + p).collect(Collectors.toList());
    }

}
