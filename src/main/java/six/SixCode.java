package six;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SixCode {
    public static void main(String[] args) {
//        System.out.println(isAnagram("foefet", "toffee"));
//        System.out.println(isLove(1, 1));
//        System.out.println(longest("aretheyhere", "yestheyarehere"));
//        System.out.println(accum("ZpglnRxqenU"));
//        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
//        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
//        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
//        ArrayList<int[]> list = new ArrayList<int[]>();
//        list.add(new int[]{10, 0});
//        list.add(new int[]{3, 5});
//        list.add(new int[]{2, 5});
//        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
       return stops.stream().mapToInt(a -> a[0] - a[1]).sum();
//        int passagires = 0;
//        for (int[] i : stops) {
//            passagires += i[0];
//            passagires -= i[1];
//        }
//        return passagires;
    }

    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().orElse(-1);

    }

    public static int findIt(int[] a) {
        int odd = 0;
        for (int i : a) {
            odd ^= i;
        }
        return odd;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int arr : a) {
//            map.put(arr, map.containsKey(arr) ? map.get(arr)-1 : 1);
//        }
//        System.out.println(map);
//        for (Map.Entry inte : map.entrySet()) {
//            if (inte.getValue().equals(-1) || inte.getValue().equals(1))
//                return (int) inte.getKey();
//        }
//        return 0;
    }

    public static int duplicateCount(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? 1 : 0);
        }
        return (int) map.values().stream().filter(e -> e > 0).count();
//        String[] strings = text.toLowerCase().split("");
//        Map<String, Integer> temp = new HashMap<>();
//        int result = 0;
//        for (int i = 0; i < strings.length; i++) {
//            if (temp.containsKey(strings[i])) {
//                temp.put(strings[i], temp.get(strings[i]) + 1);
//            } else {
//                temp.put(strings[i], 1);
//            }
//        }
//        for (Integer f : temp.values()) {
//            if (f > 1) {
//                result++;
//            }
//        }
//        return result;
    }

    public static String accum(String s) {
        var chars = s.split("");
        return IntStream.range(0, chars.length).mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i)).collect(Collectors.joining("-"));

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
        return Arrays.stream((s1 + s2).toLowerCase().split("")).distinct().sorted().collect(Collectors.joining());

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
