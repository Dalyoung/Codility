package lesson04.PermCheck;

public class Solution {
	public static void main(String[] args) {
        Solution s = new Solution();
        int A[] = {1, 5};
        System.out.println(s.solution(A));
    }
    public int solution(int[] A) {
        int ret = 1;
         
        int [] B = new int[A.length+1];
        for(int i = 0; i < A.length; i++){
            if(A[i] <= A.length){
                B[A[i]]++;
            }
            else{
                return 0;
            }
        }
         
        for(int i = 1; i < B.length; i++){
            if(B[i] != 1){
                return 0;
            }
        }
        return ret;
    }
}
