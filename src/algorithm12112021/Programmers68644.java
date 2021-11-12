package algorithm12112021;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers68644 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] answer = {};
        ArrayList<Integer> put = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j <numbers.length; j++) {
                put.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> result = put.stream().distinct().collect(Collectors.toList());

        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);
    }
}
