package algorithm061121;

import java.util.Locale;
import java.util.Scanner;

public class CountingAlphabet {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String words = scn.nextLine();
        words = words.toUpperCase();
        scn.close();

        int[] counting = new int[26];
        int max = 0;
        int index = 0;

        for(int i = 0; i < words.length(); i++){
            int putA = words.charAt(i);
            counting[putA - 65]++;
        }
        for(int i = 0; i < 26; i++){
            if(max < counting[i]){
                max = counting[i];
                index = i + 65;
            }
            else if(max == counting[i]) {
                index = '?';
            }
        }
        System.out.println((char)index);
    }
}
