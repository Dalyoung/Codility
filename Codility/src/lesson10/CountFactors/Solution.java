package lesson10.CountFactors;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
//		System.out.println(s.solution(24));
//		System.out.println(s.solution(1));
		System.out.println(s.solution(Integer.MAX_VALUE));
	}
	public int solution(int N) {
        // write your code in Java SE 8
		if(N == 1){
			return 1;
		}
		int ret = 0;
		
		long i = 1;
		while(i * i < N){
			if(N % i == 0){
				ret+= 2;
			}
			i++;
		}
		
		if(i * i == N){
			ret++;
		}
		return ret;
    }
	
}
