package three;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeCode {
    public static void main(String[] args) {
//        System.out.println(squareDigits(3212));
//        System.out.println(stray(new int[]{2, 1, 1}));
    }

    static int stray(int[] numbers) {
        Map<Integer, Integer> list = new HashMap<>();
        for (int number : numbers) {

            if (list.containsKey(number)) {
                int tmp = list.get(number);
                list.put(number, tmp + 1);
            } else {
                list.put(number, 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> p : list.entrySet()) {
            if (p.getValue() == 1) {
                result = p.getKey();
            }
        }
        return result;
    }

    public static int squareDigits(int n) {
        if (n == 0) {
            return 0;
        }
        List<Integer> num = new ArrayList<>();
        while (n > 0) {
            num.add(n % 10);
            n = n / 10;
        }
        Collections.reverse(num);
        return Integer.parseInt(num.stream()
                .map(p -> p * p).map(String::valueOf)
                .collect(Collectors.joining()));
    }
}
