public class Kata {

    public static int quadrant(int x, int y) {
        int quadrant = 0;
        if(x > 0) {
            quadrant = (y > 0) ? 1 : 4;
        } else {
            quadrant = (y > 0) ? 2 : 3;
        }
        return quadrant;
    }
}
