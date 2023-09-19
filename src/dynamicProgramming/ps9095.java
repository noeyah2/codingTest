package dynamicProgramming;

import java.io.*;
import java.util.*;

public class ps9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int j=4 ; j<=10 ; j++) {
            dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
        }

        for (int i=0 ; i<T ; i++) {
            int N = Integer.parseInt(br.readLine());

            System.out.println(dp[N]);
        }
    }
}
