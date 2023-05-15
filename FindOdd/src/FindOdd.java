import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Long> countsMap = Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int odd;
        for (Map.Entry<Integer, Long> entry : countsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odd = entry.getKey();
            }
            break;
        }
        return odd;
    }
}
