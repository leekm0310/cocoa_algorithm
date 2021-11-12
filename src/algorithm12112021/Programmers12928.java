package algorithm12112021;

public class Programmers12928 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 5;

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
               answer = i + answer;
            }
        }
        System.out.println(answer);

    }

}
