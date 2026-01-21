class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int k = 0; k < queries.length; k++) {
            int temp;
            int i = queries[k][0];
            int j = queries[k][1];
            /*
            for(int[]q : queries) {  <- 지피티의 개선방안
                int i = q[0];
                int j = q[1];
                
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                }
            */
            
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        return arr;
    }
}