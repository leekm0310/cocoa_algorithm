package algorithm051121;

import java.util.Scanner;

public class Star2438 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.close();

        for (int i = 1; i <= a; i++){
            for (int j = 0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
