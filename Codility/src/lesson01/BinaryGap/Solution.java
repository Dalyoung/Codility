package lesson01.BinaryGap;

class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(1041));
	}
    public int solution(int N) {
        // write your code in Java SE 8
        int ret = 0;
        
        String str = Integer.toBinaryString(N);
        char[] arr = str.toCharArray();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
        	if(arr[i] == '1'){
        			ret = Math.max(ret, count);
        			count = 0;
        	}
        	else if(arr[i] == '0'){
        		count++;
        	}
        }
        if(arr[arr.length - 1] == '1')    {
        	ret = Math.max(ret, count);
        }
        return ret;
    }
}