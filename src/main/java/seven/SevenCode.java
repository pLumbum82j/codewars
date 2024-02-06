package seven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SevenCode {
    public static void main(String[] args) {
//        System.out.println(removeExclamationMarks("Hello World!"));
//        System.out.println(doubleChar("String"));
//        System.out.println(count("abbbacdd"));
//        System.out.println(persistence(39));
//        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));i
    }

    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        /**
         * Если первый и второй элементы одинаковы, значит уникальный элемент находится в конце массива,
         * иначе уникальный элемент находится в начале массива
         */
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];

//        Map<Double, Integer> maps = new HashMap<>();
//        double d = 0;
//        for (double a : arr) {
//            maps.put(a, maps.containsKey(a) ? maps.get(a) + 1 : 1);
//        }
//        System.out.println(maps);
//        for (Map.Entry<Double, Integer> m : maps.entrySet()) {
//            if (m.getValue() == 1) {
//                d = m.getKey();
//            }
//        }
//        return d;
    }

//    //  https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
//    public static int why(long n, int r) {
//        int result = r;
//        if (n > 10) {
//            List<Long> lists = new ArrayList<>();
//            while (n > 0) {
//                long iter = 0L;
//
//                if ((n % 10) < 10) {
//                    iter = n % 10;
//                    n -= iter;
//                    n /= 10;
//                    lists.add(iter);
//                } else {
//                    lists.add(n);
//                    break;
//                }
//
//            }
//            //    System.out.println(lists);
//            long temp = lists.stream().reduce((x, y) -> x * y).orElse(0L);
//            result++;
//            if (temp > 10) {
//                why(temp, result);
//            } else return result;
//            //   System.out.println(result);
//
//        }
//        return result++;
//    }
//
//    //public static long update(List<Long> list){
////
////}
//    public static int persistence(long n) {
//        int result = 0;
//        long templ = 11;
//        //  result = (why(n, result)) + 1;
//
//        ;
////        while (n > 0) {
////            long iter = 0L;
////            if ((n % 10) < 10) {
////                iter = n % 10;
////                n -= iter;
////                n/=10;
////                lists.add(iter);
////            } else {
////                lists.add(n);
////                break;
////            }
////        }
////        System.out.println(lists);
////        if (lists.size() > 1) {
////            long temp = lists.stream().reduce((x, y) -> x * y).orElse(0L);
////            result++;
////            why(temp);
////        } else {
////            return result;
////        }
//        return why(n, result); // your code
//    }

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
