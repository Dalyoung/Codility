package lesson09.MaxDoubleSliceSum;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(30));
		System.out.println(s.solution(100000000));
	}
	public int solution(int N) {
        // write your code in Java SE 8
		if(N == 1){
			return 4;
		}
		
		int i = 1;
		int temp;
		int min = Integer.MAX_VALUE;
		while(i * i <= N){
			if(N % i == 0){
				temp = N / i;
				min = Math.min(min, 2 * (i + temp));
				System.out.println(min);
			}
			i++;
		}
		
		return min;
    }
	
}
