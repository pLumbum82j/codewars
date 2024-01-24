package fourth;

import java.util.Arrays;

public class FourthCode {
    public static void main(String[] args) {
//        System.out.println(evenOrOdd(33));
//        System.out.println(stringToNumber("1234"));
//        System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));
//        System.out.println(Arrays.toString(powersOfTwo(4)));
    }

    public static long[] powersOfTwo(int n) {
        long[] num = new long[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                num[i] = 1L;
            } else {
                num[i] = (long) Math.pow(2, i);
            }
        }
        return Arrays.stream(num).toArray();
    }

    public static int getCount(String str) {
        return Arrays.stream(str.split(""))
                .map(p -> ((p.equals("a") || p.equals("e") || p.equals("o") || p.equals("u") || p.equals("i")) ? 1 : 0))
                .reduce(Integer::sum)
                .orElse(0);
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }


    public static String evenOrOdd(int number) {

        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
