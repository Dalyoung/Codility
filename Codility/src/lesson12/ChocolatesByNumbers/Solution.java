package lesson12.ChocolatesByNumbers;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(10, 4));
		System.out.println(s.solution(1, 2));
		
	}
	
	public int solution(int N, int M) {
        // write your code in Java SE 8
		
		return N / gcd(N, M);
    }
	
	public int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
}

