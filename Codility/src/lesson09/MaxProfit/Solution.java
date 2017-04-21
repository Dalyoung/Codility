package lesson09.MaxProfit;


public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = new int[6];
		A[0] = 23171;
		A[1] = 21011;
		A[2] = 21123;
		A[3] = 21366;
		A[4] = 21013;
		A[5] = 21367;

		System.out.println(s.solution(A));
			System.out.println(s.solution(new int[]{5, 2, 1}));
	}
	public int solution(int[] A) {
		if(A.length == 0){
			return 0;
		}
		int maxProfit = 0;
		int min = A[0];
		for(int i = 1; i < A.length; i++){
			if(A[i] > min){
				if(maxProfit < A[i] - min){
					maxProfit = A[i] - min;
				}
			}else{
				min = A[i];
			}
		}
		
		return maxProfit;
	}

}
