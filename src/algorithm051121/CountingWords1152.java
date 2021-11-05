package algorithm051121;

import java.util.Scanner;

public class CountingWords1152 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        scn.close();
        a = a.trim();
        String[] array = a.split(" ");
        if(array.length == 1 && array[0].equals("")){
            System.out.println(0);
        } else {
            System.out.println(array.length);
        }
    }
}
