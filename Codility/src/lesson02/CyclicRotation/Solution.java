package lesson02.CyclicRotation;

import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
 
        Solution s = new Solution();
        int A[] = {3, 8, 9, 7, 6};
        A = s.solution(A, 3);
        System.out.println(Arrays.toString(A));
    }
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int [] B = new int[A.length];
        for(int i = 0; i < A.length; i++){
            B[(i+K) % A.length] = A[i];
        }
        return B;
    }
}