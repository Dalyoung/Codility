package lesson03.PermMissingElem;

public class Solution {
    public static void main(String[] args) {
 
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{}));
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
         
        long sum1 = 0, sum2 = 0;
        for(int i = 0; i < A.length; i++){
            sum1 += (i + 1);
            sum2 += A[i];
        }
        sum1 += A.length + 1;
        long dist = sum1 - sum2;
        if(dist < 0){
            dist = dist -1;
        }
        return (int)dist;
    }
}