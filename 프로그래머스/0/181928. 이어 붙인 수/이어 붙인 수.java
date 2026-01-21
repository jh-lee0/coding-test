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
// 다른사람 풀이에 String 변환 없이 수를 더할 때 odd * 10, odd += n 이렇게 하면 정수로 연산이 가능!