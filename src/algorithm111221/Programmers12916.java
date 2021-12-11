package algorithm111221;

public class Programmers12916 {
    public static void main(String[] args) {
        boolean answer = true;
        int y = 0;
        int p = 0;
        String s = "Pyy";
        String[] splitS = new String[s.length()];

        for (int i = 0; i < s.length(); i++){
            splitS[i] = s.substring(i, i+1);
        }

        for (int i = 0; i < splitS.length; i++){
            if (splitS[i].equalsIgnoreCase("y")){
                y = y + 1;
            } else if (splitS[i].equalsIgnoreCase("p")){
                p = p + 1;
            }
        }

        if (y == p){
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
    }
}
