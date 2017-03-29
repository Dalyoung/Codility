package lesson06.MaxProductOfThree;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{-3, 1, 2, -2, 5, 6}));
		System.out.println(s.solution(new int[]{-1, 0, 1, 2}));
		System.out.println(s.solution(new int[]{10, -10, -10, 9}));
		System.out.println(s.solution(new int[]{-10, -9, -3, -2}));
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		Arrays.sort(A);
		int N = A.length;
		
		int pos = A[N-1] * A[N-2] * A[N-3]; 
		int neg = A[0] * A[1] * A[N-1];
		return Math.max(pos, neg);
    }
	
}
