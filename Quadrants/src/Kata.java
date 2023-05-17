public class Kata {

    public static int quadrant(int x, int y) {
        x = (int)(x / (2 * Math.abs(x)) + 0.5);
        y = (int)(y / (2 * Math.abs(y)) + 0.5);
        int[][] quadrant = new int[][]{{2, 1}, {3, 4}};
        return quadrant[x][y];
    }
}
