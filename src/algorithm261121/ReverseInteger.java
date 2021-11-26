package algorithm261121;

import java.util.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        int total = 0;
        System.out.println((int)(Math.pow(2,31) * -1.0));
        System.out.println((int)(Math.pow(2,31)-1));

        if (x == 0){
            total = 0;
        } else if (x < (int)(Math.pow(2,31) * -1) || (int)(Math.pow(2,31)-1) < x){
            total = 0;
        } else if ( 0 != x ) {
            int a = (int)Math.abs(x);
            int length = (int)(Math.log10(a)+1);
            int[] xx = new int[length];
            for (int i = a, j =0; a > 0; a = a / 10, j++){
                int b = a % 10;
                xx[j] = b;
            }
            for (int i = 0; i < xx.length; i++){
                int c = xx[i] * (int)Math.pow(10, length-i-1);
                total = total + c;
            }
        }

        if (x < 0){
            total = total * -1;
        }
        System.out.println(total);


    }
}
