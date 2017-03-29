package lesson04.MissingInteger;

public class Solution {
	public static void main(String[] args) {
		 
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 1}));
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        int B[] = new int[A.length + 1];
        for(int i = 0; i < A.length; i++){
            if(A[i] > 0 && A[i] <= A.length){
                B[A[i]] = 1;
            }
        }
//        System.out.println(Arrays.toString(B));
        for(int i = 1; i < B.length; i++){
            if(B[i] == 0){
                return i;
            }
        }
        return B.length;
    }
}
