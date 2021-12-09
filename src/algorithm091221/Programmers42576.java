package algorithm091221;

import java.util.Arrays;
//리팩토링 필요
public class Programmers42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                answer = participant[i];
            }
        }
        if (answer == ""){
            answer = participant[participant.length-1];
        }
        System.out.println(answer);
    }
}