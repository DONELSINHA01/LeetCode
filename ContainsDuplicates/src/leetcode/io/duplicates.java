package leetcode.io;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicates {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        Arrays.sort(arr);
        boolean flag=true;
        for (int i = 0; i < n; i++) {
            if(arr[i]==arr[i+1]){
                flag=false;
            }
        }
        System.out.println(flag);

    }


}
