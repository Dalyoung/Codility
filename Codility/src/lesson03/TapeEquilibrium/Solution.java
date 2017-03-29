package lesson03.TapeEquilibrium;

public class Solution {
	public static void main(String[] args) {
		 
        Solution s = new Solution();
        int A[] = {3, 1};
        System.out.println(s.solution(A));
    }
    public int solution(int[] A) {
        int ret = Integer.MAX_VALUE;
        int sum1 = 0, sum2 = 0;
        sum1 = A[0];
        for(int i = 1; i < A.length; i++){
            sum2 += A[i];
        }
        ret = Math.abs(sum1 - sum2);
        System.out.println(sum1 + " - " + sum2 + " = " + ret);
        for(int i = 2; i < A.length; i++){
            sum1 += A[i-1];
            sum2 -= A[i-1];
            System.out.println(sum1 + " - " + sum2 + " = " + ret);
            ret = Math.min(ret, Math.abs(sum1 - sum2));
        }
        return ret;
    }
}
