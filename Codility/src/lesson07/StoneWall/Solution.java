package lesson07.StoneWall;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
	}
	public int solution(int[] H) {
        // write your code in Java SE 8
		int ret = 0;
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i < H.length; i++){
			if(s.isEmpty()){
				s.push(H[i]);
			}else{
				while(!s.isEmpty()){
					if(s.peek() <= H[i]){
						break;
					}else if(s.peek() > H[i]){
						s.pop();
						ret++;
					}
				}
				if(s.isEmpty() || s.peek() != H[i]){
					s.push(H[i]);
				}
			}
		}
//		System.out.println(Arrays.toString(s.toArray()));
		return ret + s.size();
    }
	
}
