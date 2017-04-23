package lesson09.MaxDoubleSliceSum;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2}));
		System.out.println(s.solution(new int[]{6, 1, 5, 6, 4, 2, 9, 4})); // 26
	}
	public int solution(int[] A) {
		int maxSum = 0;
		int N = A.length;
		int left[] = new int[N];
		int right[] = new int[N];
		int length = N - 2;
		for(int i = 1; i < length; i++){
			left[i] = Math.max(0, left[i-1] + A[i]);
			right[N - i - 1] = Math.max(0, right[N - i] + A[N - i - 1]);
		}
//		System.out.println(Arrays.toString(left));
//		System.out.println(Arrays.toString(right));
		maxSum = right[1];
		for(int i = 0; i < length; i++){
			maxSum = Math.max(maxSum, left[i] + right[i+2]);
		}
		return maxSum;
		
    }
	
}
