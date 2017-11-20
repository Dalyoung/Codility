package lesson13.Ladder;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int A[] = {4, 4, 5, 5, 1};
		int B[] = {3, 2, 4, 3, 1};
		System.out.println(Arrays.toString(s.solution(A, B)));
		
	}
	
	public int[] solution(int[] A, int[] B) {
        // write your code in Java SE 8
		
		int modulo[] = new int[31];
		modulo[0] = 1;
		for(int i = 1; i <= 30; i++) {
			modulo[i] = 2 * modulo[i-1];
		}
		
		int ladder[] = new int[50001];
		ladder[0] = 0;
		ladder[1] = 1;
		ladder[2] = 2;
		for(int i = 3; i <= 50000; i++) {
			ladder[i] = (ladder[i-1] + ladder[i-2]) % modulo[30];
		}
		
		
		int [] ret = new int[A.length];
		for(int i = 0; i < A.length; i++) {
			ret[i] = ladder[A[i]] % modulo[B[i]];
		}
		
		return ret;
    }
}

