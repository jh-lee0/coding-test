class Solution {
    public int solution(int[] num_list) {
    int sum1 = 1;
    int sum2 = 0;
        
    for(int i = 0; i < num_list.length; i++) {
        int n = num_list[i];
        sum1 *= n;
        sum2 += n;
    }
    return (sum1 < sum2 * sum2) ? 1 : 0;
        
    }
}