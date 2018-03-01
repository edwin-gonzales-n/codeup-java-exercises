import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
    static int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        // Complete this function
        for(int i=0; i < n; i++){
            sum+=ar[i];
        }
        return sum;

    }
}
