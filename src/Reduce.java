public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int begin = 100;
        while (begin > 0) {
            if (begin % 2 == 0) {
                begin /= 2;
            } else {
                begin--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
