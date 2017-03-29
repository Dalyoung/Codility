package lesson02.OddOccurrencesInArray;

public class Solution {
    public static void main(String[] args) {
         
        Solution s = new Solution();
//      int A[] = {999, 3, 994, 3, 994, 7, 999};
        int A[] = {13, 5, 13, 12, 12, 5, 9};
        System.out.println(s.solution(A));
    }
    public int solution(int [] A){
 
        int i;
        int res = 0;
        for (i = 0; i < A.length; i++) 
        {
            res = res ^ A[i]; // Implementation of XOR
        }
        return res;
    }
}