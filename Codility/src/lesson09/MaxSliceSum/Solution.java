package lesson09.MaxSliceSum;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{3, 2, -6, 4, 0}));
		System.out.println(s.solution(new int[]{-2, -3}));
	}
	public int solution(int[] A) {
		int maxSum = A[0];
		int tempSum = A[0];
		
		for(int i = 1; i < A.length; i++){
			tempSum = Math.max(A[i], tempSum + A[i]);
			maxSum = Math.max(tempSum, maxSum);
		}
		
		return maxSum;
		
    }
	
}
