package algorithm261121;

public class ReverseInteger2 {
    public static void main(String[] args) {
        int answer = reverse(-123);
        System.out.println(answer);
    }

    public static int reverse (int x) {
        int revNum = 0;
        while (x != 0){
            int obo = x % 10;
            x = x / 10;
            if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && obo > 7)){
                return 0;
            }
            if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && obo < -8)){
                return 0;
            }
            revNum = revNum * 10 + obo;
        }
        return revNum;
    }
}
