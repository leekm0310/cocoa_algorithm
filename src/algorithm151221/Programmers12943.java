package algorithm151221;

public class Programmers12943 {
    public static void main(String[] args) {
        int answer = 0;
        int num = 6;
        long a = num;

        while ( a != 1){
            if (a % 2 == 0){
                a = a / 2;
            } else if (a % 2 != 0){
                a = ( a * 3) + 1;
            }
            answer++;

            if (answer >= 500){
                answer = -1;
                a = 1;
            }
        }



        System.out.println(answer);
    }
}
