package eight;

import java.util.List;

public class EightCode {
    public static void main(String[] args) {
//        System.out.println(rentalCarCost(6));
//        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
//        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).orElse(0);
//        return Integer.valueOf(binary.stream().map(Object::toString).collect(Collectors.joining()), 2);
    }

    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
//        int size = s.length();
//        long counter = Arrays.stream(s.toLowerCase().split("")).filter(p -> {
//            int result = p.charAt(0);
//            return result > 109;
//        }).count();
//        return counter + "/" + size;
    }

    public static int rentalCarCost(int d) {
        if (d < 3) {
            return d * 40;
        } else if (d < 7) {
            return (d * 40) - 20;
        } else
            return (d * 40) - 50;
    }
}
