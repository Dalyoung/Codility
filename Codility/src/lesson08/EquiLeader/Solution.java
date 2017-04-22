package lesson08.EquiLeader;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{4, 3, 4, 4, 4, 2}));
	}
	public int solution(int[] A) {
		int value = 0;
		int size = 0;
		
		for(int i = 0; i < A.length; i++){
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
		
		int count = 0;
		for(int i = 0; i < A.length; i++){
			if(value == A[i]){
				count++;
			}
		}
		
		int leader = 0;
		if(count > A.length / 2){
			leader = value;
		}else{
			return 0;
		}
		int left = 0;
		int right = count;
		int ret = 0;
		for(int i = 0; i < A.length; i++){
			if(leader == A[i]){
				left++;
				right--;
			}
			if(left > (i+1)/2 && right > (A.length - (i+1)) / 2){
				ret++;
			}
		}
		return ret;
    }
	
}
