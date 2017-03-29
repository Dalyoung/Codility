package lesson04.FrogRiverOne;

public class Solution {
	public static void main(String[] args) {
		 
        Solution s = new Solution();
        System.out.println(s.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int ret = -1;
        if(X > A.length){
            return ret;
        }
         
        int l[] = new int[X+1];
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(l[A[i]] == 0){
                count++;
                l[A[i]] = 1;
            }
             
            if(count == X){
                return i;
            }
        }
        return ret;
    }
}
