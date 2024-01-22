package first;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstCode {
    public static void main(String[] args) {
        // System.out.println(toJadenCase("most trees are blue"));
        // System.out.println(fakeBin("45385593107843568"));
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
    }

    public static int points(String[] games) {
        Optional<Integer> resultats = Arrays.stream(games)
                .map(p -> Integer.parseInt(p.substring(0, 1)) == Integer.parseInt(p.substring(2)) ? 1 :
                        Integer.parseInt(p.substring(0, 1)) > Integer.parseInt(p.substring(2)) ? 3 : 0)
                .reduce((x, y) -> x + y);

        return resultats.orElse(0);
    }

    public static String fakeBin(String numberString) {
        return Arrays.stream(numberString.split(""))
                .map(p -> (Integer.parseInt(p) < 5) ? String.valueOf(0) : String.valueOf(1))
                .collect(Collectors.joining());
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty() || phrase.equals(" ")) {
            return null;
        }
        return Arrays.stream(phrase.split(" "))
                .map(p -> p.substring(0, 1).toUpperCase() + p.substring(1))
                .collect(Collectors.joining(" "));
    }
}
