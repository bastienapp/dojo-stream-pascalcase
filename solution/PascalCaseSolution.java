import java.util.Arrays;
import java.util.stream.Collectors;

class PascalCaseSolution {

    public static String convert(String word) {
        return Arrays.stream(word.toLowerCase().split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring((1)))
                .collect(Collectors.joining());
    }
}
