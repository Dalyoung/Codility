package lesson7.Brackets;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("{[()()]}"));
		System.out.println(s.solution("([)()]" ));
	}
	public int solution(String S) {
        // write your code in Java SE 8
		char [] arr = S.toCharArray();
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
				st.push(arr[i]);
			}else{
				if(st.isEmpty()){
					return 0;
				}
				
				if(arr[i] == ')'){
					if(st.peek() != '('){
						return 0;
					}else{
						st.pop();
					}
				}else if(arr[i] == ']'){
					if(st.peek() != '['){
						return 0;
					}else{
						st.pop();
					}
				}else if(arr[i] == '}'){
					if(st.peek() != '{'){
						return 0;
					}else{
						st.pop();
					}
				}
			}
		}
		if(st.isEmpty()){
			return 1;
		}else{
			return 0;
		}
		
    }
	
}
