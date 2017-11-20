package lesson12.CommonPrimeDivisors;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int A[] = {15, 10, 9};
		int B[] = {75, 30, 5};
		System.out.println(s.solution(A, B));
		
	}
	
	public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
		int ret = 0;
		
		for(int i = 0; i < A.length; i++) {
			int gcd_ab = gcd(A[i], B[i]);
			if(check(A[i], gcd_ab) && check(B[i], gcd_ab)) {
				ret++;
			}
		}
		return ret;
    }
	
	public int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}
		
		return gcd(b, a % b);
	}

	public boolean check(int a, int gcd_ab) {
		int rest = a / gcd_ab;
		
		while(gcd_ab % rest != 0) {
			int gcd_tmp = gcd(gcd_ab, rest);
			
			if(gcd_tmp == 1) {
				return false;
			}
			
			rest /= gcd_tmp;
		}
		return true;
	}
}

