package algorithm061121;

import java.util.Scanner;

//미완임 더 해야함
public class BJ8958 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String a[] = new String[scn.nextInt()];

        for (int i = 0; i < a.length; i++){
            a[i] = scn.next();
        }

        scn.close();

        for (int i = 0; i < a.length; i++){
            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < a[i].length(); j++){
                if (a[i].charAt(j) == '0'){
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}