package lesson7.Nesting;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("(()(())())"));
		System.out.println(s.solution("())" ));
	}
	public int solution(String S) {
        // write your code in Java SE 8
		int b = 0;
		
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) == '('){
				b++;
			}else{
				if(b == 0){
					return 0;
				}
				b--;
			}
		}
		if(b == 0){
			return 1;
		}else{
			return 0;
		}
    }
	
}
