import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] coinVals = new int[m];
		for (int i =0; i<m; i++){
			coinVals[i] = sc.nextInt();
		}
		System.out.print(numWays(coinVals, n));
	}
	public static int numWays(int[] coinVals, int n){
		long[] numVals = new long[(int)n+1];
		numVals[0] = 1;
		for(long a: c){
			for(long j = a; j< numVals.length; j++)
				numVals[(int)j] = numVals[(int)j] + numVals[(int)(j - a)];
		}
		return numVals[(int)n];
	}
}
