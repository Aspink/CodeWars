import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.*;

public class Kata {
    public static int[] flip(char dir, int[] arr) {
        ArrayList<Integer> array = new ArrayList<>(Collections.singletonList(arr));
        array.sort();
        if(dir == 'L') {
            Collections.reverse(array);
        }
        for(int i = 0; i < array.size(); i++) {
            arr[i] = array.get(i);
        }
        return arr;
    }
}
