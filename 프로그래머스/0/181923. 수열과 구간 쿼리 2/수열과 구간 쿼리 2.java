class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int i, j;
        for(i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
        
            int min = Integer.MAX_VALUE; // Integer.MAX_VALUE 사용 권장
        
            for(j = s; j <= e; j++) {
                if(arr[j] > k && arr[j] < min) min = arr[j]; 
                else continue;  // if문에서 && arr[j] < min 로직이 빠졌었음! 
            }
            answer[i] = (min != Integer.MAX_VALUE) ? min : -1;
        }
        return answer;
    }
}