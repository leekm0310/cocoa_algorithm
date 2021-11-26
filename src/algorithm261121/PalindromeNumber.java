package algorithm261121;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean ap = pp(0);
        System.out.println(ap);

    }
    public static boolean pp (int x){
        int t = x;
        int answer = 0;
        boolean a = false;
        while (t != 0) {
            int y = t % 10;
            t = t / 10;
            answer = answer * 10 + y;
        }
        if (0 <= answer && answer == x) {
            a = true;
        } else if (answer < 0){
            a = false;
        }

        return a;
    }
}