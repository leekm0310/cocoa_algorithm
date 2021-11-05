package algorithm051121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Scale2920 {
    public static void main(String[] args){
        int[] input = new int[8];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 8; i++){
            input[i] = scn.nextInt();
        }
        scn.close();


        String result = "";

        for (int i = 0; i < input.length - 1; i++){
            if (input[i] == input[i + 1] - 1) {
                result = "ascending";
            } else if (input[i] == input[i + 1] + 1){
                result ="descending";
            } else {
                result ="mixed";
                break;
            }
        }
        System.out.println(result);
    }
}
