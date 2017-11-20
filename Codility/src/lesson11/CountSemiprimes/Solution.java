package lesson11.CountSemiprimes;

import java.util.Arrays;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int N = 26;
		int P[] = {1, 4, 16};
		int Q[] = {26, 10, 20};
		System.out.println(Arrays.toString(s.solution(N, P, Q)));
		
	}
	public int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
		boolean primes[] = new boolean[N+1];
		boolean semiPrimes[] = new boolean[N+1];
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		//System.out.println(primes[0]);
		for(int i = 2; i * i <= N; i++) {
			if(primes[i]) {
				for(int j = i + i; j <= N; j += i) {
					primes[j] = false;
				}
			}
		}
		
		for(int i = 2; i * i <= N; i++) {
			if(primes[i]) {
				for(int j = i; i * j <= N; j++) {
					if(primes[j]) {
						semiPrimes[i*j] = true;
					}
				}
			}
		}
//		System.out.println(Arrays.toString(primes));
//		System.out.println(Arrays.toString(subPrimes));
		int [] sum = new int[N+1];
		for(int i = 1; i <= N; i++) {
			sum[i] = sum[i-1];
			if(semiPrimes[i]) {
				sum[i]++;
			}
		}
		
		int [] ret = new int[P.length];
		
		for(int index = 0; index < P.length; index++) {
			
			ret[index] = sum[Q[index]] - sum[P[index] - 1];
		}
		
		return ret;
    }
}

