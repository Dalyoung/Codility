package lesson11.CountNonDivisible;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int A[] = {3, 1, 2, 3, 6};
		System.out.println(Arrays.toString(s.solution(A)));
		
	}
	public int[] solution(int[] A) {
        // write your code in Java SE 8
		int length = A.length;
		
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for(int n : A) {
			if(countMap.containsKey(n)) {
				countMap.put(n, countMap.get(n) + 1);
			}
			else {
				countMap.put(n, 1);
			}
		}
		
		Map<Integer, Integer> nonDivisorMap = new HashMap<Integer, Integer>();
		
		for(int n : countMap.keySet()) {
			int countDivisor = 0;
			for(int i = 1; i * i <= n; i++) {
				if(n % i == 0) {
					int anotherDivisor = n / i;
					
					if(countMap.containsKey(i)) {
						countDivisor += countMap.get(i);
					}
					
					if(i != anotherDivisor) {
						if(countMap.containsKey(anotherDivisor)) {
							countDivisor += countMap.get(anotherDivisor);
						}
					}
					
				}
			}
			nonDivisorMap.put(n, length-countDivisor);
		}
		
		int ret[] = new int[length];
		for(int i = 0; i < length; i++) {
			ret[i] = nonDivisorMap.get(A[i]);
		}
		return ret;
    }
}

