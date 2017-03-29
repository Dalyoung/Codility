package lesson05.CountDiv;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(0, 2, 1));
	}
	public int solution(int A, int B, int K) {
        // write your code in Java SE 8
		int ret = (B / K) - (A / K);
		if(A % K == 0){
			ret++;
		}
		return ret;
    }
}
