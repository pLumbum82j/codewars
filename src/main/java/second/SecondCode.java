package second;

import java.util.List;
import java.util.stream.Collectors;

public class SecondCode {
    public static void main(String[] args) {
//        System.out.println(disemvowel("This website is for losers LOL!"));
//        System.out.println(Past(0, 1, 1));
//        System.out.println(bmi(80, 1.80));
//        System.out.println(quarterOf(8));
//        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {

        return list.stream().filter(p -> p.getClass() == Integer.class).collect(Collectors.toList());
    }

    public static int quarterOf(int month) {
        return month > 0 && month < 4 ? 1 : month > 3 && month < 7 ? 2 : month > 6 && month < 10 ? 3 : month > 9 && month < 13 ? 4 : 0;
    }

    public static String bmi(double weight, double height) {
        double temp = weight / Math.pow(height, 2);
        return temp <= 18.5 ? "Underweight" : temp <= 25 ? "Normal" : temp <= 30 ? "Overweight" : "Obese";
    }

    public static int Past(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            return ((((h * 60) + m) * 60) + s) * 1000;
        }
        return 0;
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}
