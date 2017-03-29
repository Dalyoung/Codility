package lesson05.GenomicRangeQuery;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		int [] ret = s.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}); 
		System.out.println(Arrays.toString(ret));
	}
	
	public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
		int [] ret = new int[P.length];
		char [] carr = S.toCharArray();
		int [] A = new int[S.length()];
		int [] C = new int[S.length()];
		int [] G = new int[S.length()];
		Arrays.fill(A, -1);
		Arrays.fill(C, -1);
		Arrays.fill(G, -1);
		
		int a = 0, c = 0, g = 0;
		for(int i = 0; i < carr.length; i++){
			if(carr[i] == 'A'){
				A[a] = i;
				a++;
			}
			else if(carr[i] == 'C'){
				C[c] = i;
				c++;
			}
			else if(carr[i] == 'G'){
				G[g] = i;
				g++;
			}
		}
		
//		System.out.println(Arrays.toString(A));
//		System.out.println(Arrays.toString(C));
//		System.out.println(Arrays.toString(G));
		for(int i = 0; i < P.length; i++){
			int v = 0;
			boolean chk = false;
			for(int j = 0; j < a; j++){
				if(A[j] == -1){
					break;
				}
				if(A[j] >= P[i] && A[j] <= Q[i]){
					v = 1;
					chk = true;
					break;
				}
			}
			if(!chk){
				for(int j = 0; j < c; j++){
					if(C[j] == -1){
						break;
					}
					if(C[j] >= P[i] && C[j] <= Q[i]){
						v = 2;
						chk = true;
						break;
					}
				}
			}
			if(!chk){
				for(int j = 0; j < g; j++){
					if(G[j] == -1){
						break;
					}
					if(G[j] >= P[i] && G[j] <= Q[i]){
						v = 3;
						chk = true;
						break;
					}
				}
			}
			if(!chk){
				v = 4;
			}
			ret[i] = v;
		}
		
		
		return ret;
    }
	
}
