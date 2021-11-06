package algorithm061121;

import java.util.Scanner;

public class BJ1546 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int subNum = scn.nextInt();
        int[] test = new int[subNum];
        int sum = 0;
        int max = 0;
        double avg = 0.0;

        for (int i = 0; i < subNum; i++){
            test[i] = scn.nextInt();
            if(max < test[i]){
                max = test[i];
            }
            sum += test[i];
        }
        scn.close();
        avg = 100.0 * sum /max /subNum;
        System.out.println(avg);
    }
}
