package algorithm121221;

public class Programmers12948 {
    public static void main(String[] args) {
        String answer ="";
        String phone_number="01033334444";
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i < ch.length - 4; i++){
            ch[i]='*';
        }
        System.out.println(new String(ch));

    }
}
