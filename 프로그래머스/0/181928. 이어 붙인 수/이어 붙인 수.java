class Solution {
    public int solution(int[] num_list) {
        String odd = ""; // 홀수
        String even = ""; // 짝수
        
        for(int n : num_list) {
            if(n % 2 != 0) {
                odd += Integer.toString(n);
            }
            else {
                even += Integer.toString(n);
            }
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}