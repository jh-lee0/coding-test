class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = s; j <= e; j++) {
                if(k != 0 && j % k == 0) arr[j] += 1; 
                // 중요! 0으로 나누려고 하면 에러 나는데 j%k == 0을 엎에 놓으면 k = 0일때 오류 발생!!
                /*
                    if (k == 0) continue;  <- 이렇게 수정하는 것이 의도를 명확히 나타냄!
                    if (j % k == 0) arr[j]++;
                */
            }
        }
        return arr;
    }
}