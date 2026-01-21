class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int last = num_list[len-1];
        int pre = num_list[len-2];
        
        int[] answer = new int[len + 1];
        
        for(int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        
        if(last > pre) {
            answer[len] = last - pre; 
        }
        else {
            answer[len] = last * 2;
        }
        
        return answer;
    }
}