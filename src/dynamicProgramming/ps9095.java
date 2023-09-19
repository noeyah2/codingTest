package dynamicProgramming;

import java.io.*;
import java.util.*;

public class ps9095 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        for (int i=0 ; i<arr.length;i++) {
            int N = Integer.parseInt(br.readLine());
            dp = new Integer[N+1];
            dp[0] = 0;
            System.out.println(recur(N));
        }

    }
    static int recur(int N){
        if (N == 1) {
            dp[N] = 1;
        } else if (N == 2) {
            dp[N] = 2;
        } else if (N == 3) {
            dp[N] = 4;
        } else {
            dp[N] = recur(N-1) + recur(N-2) + recur(N-3);
        }
        return recur(N);
    }
}
