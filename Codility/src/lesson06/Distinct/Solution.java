package lesson06.Distinct;

import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.solution(new int[]{2, 1, 1, 2, 3, 1}));
		System.out.println(s.solution(new int[]{ 1, 1, 1, 1, 1, 9}));
		System.out.println(s.solution(new int[]{}));
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		if(A.length > 0){
			Arrays.sort(A);
			int count = 1;
			int last = A[0];
			for(int i = 1; i < A.length; i++){
				if(A[i] != last){
					count++;
					last = A[i];
				}
			}
			return count;
		}
		else{
			return 0;
		}
    }
	
}
