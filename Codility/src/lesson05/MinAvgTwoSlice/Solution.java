package lesson05.MinAvgTwoSlice;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
	}
	public int solution(int[] A) {
        // write your code in Java SE 8
		int ret = 0;
		float min = Float.MAX_VALUE;
		for(int i = 0; i < A.length - 1; i++){
			if((A[i] + A[i+1]) / 2f < min){
				min = (A[i] + A[i+1]) / 2f;
				ret = i;
			}
		}

		for(int i = 0; i < A.length - 2; i++){
			if((A[i] + A[i+1] + A[i+2]) / 3f < min){
				min = (A[i] + A[i+1] + A[i+2]) / 3f;
				ret = i;
			}
		}
		return ret;
    }
}
