package lesson06.NumberOfDiscIntersections;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{1, 5, 2, 1, 4, 0}));
	}
	public int solution(int[] A){
		
		int[] startingPoints = new int[A.length];
//		System.out.println(Arrays.toString(A));
		for (int i = 0; i < A.length; i++){
			startingPoints[Math.max(0, i-A[i])]++;
		}
//		System.out.println(Arrays.toString(startingPoints));
		for (int i = 1; i < A.length; i++){
			startingPoints[i] += startingPoints[i-1];
		}
//		System.out.println(Arrays.toString(startingPoints));
		int numberOfIntersectingPairs = 0;
		for (int i = 0; i < A.length-1; i++){
			int endingPoint = (int) Math.min(A.length-1,(long)i + A[i]);
			numberOfIntersectingPairs += (startingPoints[endingPoint] - (i+1));
			if (numberOfIntersectingPairs > 10000000){
				return -1;
			}
		}
		return numberOfIntersectingPairs;

	}
	
}
