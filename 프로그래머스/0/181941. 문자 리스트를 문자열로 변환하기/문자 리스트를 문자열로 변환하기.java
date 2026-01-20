class Solution {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        for(String c : arr) {
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}