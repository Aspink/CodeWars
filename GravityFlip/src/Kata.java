import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.*;

public class Kata {
    public static int[] flip(char dir, int[] arr) {
        Arrays.sort(arr);
        if(dir == 'L') {
            int[] array = Arrays.copyOf(arr, arr.length);
            for(int i = 0; i < arr.length ; i++) {
                arr[i] = array[arr.length - 1 - i];
            }
        }
        return arr;
    }
}
