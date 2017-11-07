package lesson10.Peaks;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int A[] = new int[12];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 3;
		A[5] = 4;
		A[6] = 1;
		A[7] = 2;
		A[8] = 3;
		A[9] = 4;
		A[10] = 6;
		A[11] = 2;

		System.out.println(s.solution(A));
//		System.out.println(s.solution(new int[]{1}));
		
	}
	public int solution(int [] A) {
        // write your code in Java SE 8
		
		int N = A.length;
		int arr[] = new int[N];
		
		for(int i = 1; i < N - 1; i++){
			if(A[i] > A[i-1] && A[i] > A[i+1]){
				arr[i]++;
			}
			arr[i+1] = arr[i];
		}
		
//		System.out.println(Arrays.toString(A));
//		System.out.println(Arrays.toString(arr));
		int ret = 0;
	    for (int blocks = 1; blocks <= N / 2; ++blocks)
	    {
	        if (N % blocks != 0)
	            continue;
	        int blockSize = N / blocks;
	        
	        int prevPeaks = 0;
	        int index = blockSize;
	        for (; index < N + blockSize; index += blockSize)
	        {
	            if (arr[index - 1] == prevPeaks)
	                break;
	            prevPeaks = arr[index - 1];
	        }
	        
	        if (index == N + blockSize)
	            ret = blocks;
	    }
	    
	    return ret;
    }
	
}

