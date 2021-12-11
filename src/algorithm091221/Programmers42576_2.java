package algorithm091221;

import java.util.HashMap;

public class Programmers42576_2 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player,map.getOrDefault(player, 0) +1);
        }

        for (String player : completion){
            map.put(player, map.get(player)-1);
        }

        for (String key : map.keySet()){
            if (map.get(key) != 0){
                answer = key;
            }
        }

        System.out.println(answer);

    }

}
