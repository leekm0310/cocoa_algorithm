package algorithm061121;

import java.util.Scanner;

public class BJ2475 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++){
            int number = scn.nextInt();
            sum += number * number;
        }

        scn.close();
        int result = sum % 10;
        System.out.println(result);
    }
}
