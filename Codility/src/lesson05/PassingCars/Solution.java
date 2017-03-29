package lesson05.PassingCars;

public class Solution {
    public static void main(String[] args) {
 
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 0, 0, 1}));
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        int ret = 0;
        int r = 0;
     
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                r++;
            }else if(A[i] == 1){
                ret += r;
            }
        }
        if(ret > 1000000000){
            ret = -1;
        }
        return ret;
    }
}
