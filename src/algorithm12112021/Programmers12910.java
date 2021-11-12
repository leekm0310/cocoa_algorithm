package algorithm12112021;

import java.lang.reflect.Array;
import java.util.*;


public class Programmers12910 {

    public int[] solution(int[] arr, int divisor){
        int[] answer = {};
        ArrayList<Integer> put = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                put.add(arr[i]);
            }
        }

        if (put.isEmpty()){
            put.add(-1);
        }

        answer = new int[put.size()];

        for (int i = 0; i < put.size(); i++){
            answer[i] = put.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
