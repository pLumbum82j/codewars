package seven;

import java.util.*;
import java.util.stream.Collectors;

public class SevenCode {
    public static void main(String[] args) {
//        System.out.println(removeExclamationMarks("Hello World!"));
//        System.out.println(doubleChar("String"));
//        System.out.println(count("abbbacdd"));
        System.out.println(persistence(39));
    }

    https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
    public static void why(long n) {
      int  result = 0;
        List<Long> lists = new ArrayList<>();
        while (n > 0) {
            long iter = 0L;
            if ((n % 10) < 10) {
                iter = n % 10;
                n -= iter;
                n /= 10;
                lists.add(iter);
            } else {
                lists.add(n);
                break;
            }
        }
        long temp = lists.stream().reduce((x, y) -> x * y).orElse(0L);
        result++;
        why(temp);
        System.out.println(result);
     //   return temp;
    }
//public static long update(List<Long> list){
//
//}
    public static int persistence(long n) {
        int result = 0;
        long templ = 0;
        while (templ> -1){
            why(n);
        }
        ;
//        while (n > 0) {
//            long iter = 0L;
//            if ((n % 10) < 10) {
//                iter = n % 10;
//                n -= iter;
//                n/=10;
//                lists.add(iter);
//            } else {
//                lists.add(n);
//                break;
//            }
//        }
//        System.out.println(lists);
//        if (lists.size() > 1) {
//            long temp = lists.stream().reduce((x, y) -> x * y).orElse(0L);
//            result++;
//            why(temp);
//        } else {
//            return result;
//        }
        return 0; // your code
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> maps = new HashMap<>();
        for (char c : str.toCharArray()) {
            maps.put(c, maps.containsKey(c) ? maps.get(c) + 1 : 1);
        }
        return maps;
    }

    public static String doubleChar(String s) {
        return Arrays.stream(s.split("")).map(x -> x + x).collect(Collectors.joining());
    }

    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
