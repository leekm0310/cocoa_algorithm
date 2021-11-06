package K;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("a b c d");
        int count = st.countTokens();
        System.out.println("토큰의 수: " + count);

        for(int i = 0; i < count; i++){
            System.out.println(i + "번째 토큰 값: " + st.nextToken());
        }
        System.out.println("토큰의 수: " + st.countTokens());

}
        }