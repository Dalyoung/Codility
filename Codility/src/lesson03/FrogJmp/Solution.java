package lesson03.FrogJmp;

public class Solution {
    public static void main(String[] args) {
 
        Solution s = new Solution();
        System.out.println(s.solution(1, 1, 1));
    }
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int ret = 0;
         
        int distance = Y - X;
        ret = distance / D;
        if(distance % D != 0){
            ret++;
        }
        return ret;
    }
}
 
