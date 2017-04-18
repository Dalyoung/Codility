package lesson7.Fish;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 1, 0, 1}));
	}
	
	
	public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
		int ret = 0;
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < A.length; i++){
			if(B[i] == 0){
				if(st.isEmpty()){
					ret++;
				}else{
					while(!st.isEmpty()){
						int num = st.peek();
						if(A[num] > A[i]){
							break;
						}else{
							st.pop();
						}
					}
					if(st.isEmpty()){
						ret++;
					}
				}
			}else{
				st.push(i);
			}
		}
		return ret + st.size();
    }
	
}
