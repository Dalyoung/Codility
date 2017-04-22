package lesson08.Dominator;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{4, 3, 4, 4, 4, 2}));
		System.out.println(s.solution(new int[]{1, 2, 3}));
	}
	public int solution(int[] A) {
		int N = A.length;
		int value = 0;
		int size = 0;
		
		for(int i = 0; i < N; i++){
			if(size == 0){
				size++;
				value = A[i];
			}else{
				if(value == A[i]){
					size++;
				}else{
					size--;
				}
			}
		}
		System.out.println(value);
		int count = 0;
		for(int i = 0; i < N; i++){
			if(A[i] == value){
				count++;
			}
		}
		int ret = -1;
		int leader = 0;
		if(count > N/2){
			leader = value;
			for(int i = 0; i < N; i++){
				if(leader == A[i]){
					ret = i;
					break;
				}
			}
			return ret;
		}else{
			return ret;
		}
    }
	
}
