package lesson04.MaxCounters;

public class Solution {
	public static void main(String[] args) {
		 
        Solution s = new Solution();
        System.out.println(s.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int lastMax = 0;
        int B[] = new int[N];
        for(int k = 0; k < A.length; k++){
            if(A[k] <= N){
                if(B[A[k]-1] < lastMax){
                    B[A[k]-1] = lastMax;
                }
                B[A[k]-1]++;
                max = Math.max(B[A[k]-1], max);
            }else if(A[k] == N + 1){
                lastMax = max;
            }
        }
         
        for(int i = 0; i < B.length; i++){
            if(B[i] < lastMax){
                B[i] = lastMax;
            }
        }
        return B;
    }
}
