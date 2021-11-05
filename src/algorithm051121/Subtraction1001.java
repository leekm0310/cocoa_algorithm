package algorithm051121;

import java.util.Scanner;

public class Subtraction1001 {
    public static void main(String[] args){
        System.out.println("첫번째 숫자는 0보다 큰 숫자를, 두번째 숫자는 10보다 작은 숫자를 입력해주세요. 예)3 2");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        scn.close();

        System.out.println(a - b);
    }
}
