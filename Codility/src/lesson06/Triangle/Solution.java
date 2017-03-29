package lesson06.Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{10, 2, 5, 1, 8, 20}));
		System.out.println(s.solution(new int[]{-1, 0, 1, 2}));
		System.out.println(s.solution(new int[]{10, -10, -10, 9}));
		System.out.println(s.solution(new int[]{-10, -9, -3, -2}));
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		if(A.length < 3){
			return 0;
		}
		Arrays.sort(A);
//		System.out.println(Arrays.toString(A));
		for(int i = 0; i < A.length - 2; i++){
			if( ((long)(A[i] + A[i+1]) > A[i+2])
					&& ((long)(A[i+1] + A[i+2]) > A[i])
					&& ((long)(A[i+2] + A[i]) > A[i+1])
					){
				return 1;
			}
		}
		return 0;
    }
	
}
