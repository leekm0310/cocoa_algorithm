package algorithm051121;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        scn.close();

        if (0 < a && b < 10) {
                System.out.println(a / b);
        }
    }
}
