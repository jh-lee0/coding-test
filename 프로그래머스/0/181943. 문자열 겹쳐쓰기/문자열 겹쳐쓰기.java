class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int len = overwrite_string.length();
        answer += my_string.substring(0, s);
        answer += overwrite_string.substring(0, len);
        answer += my_string.substring(s + len, my_string.length());
        
        return answer;
    }
}

// substring(0, s) 는 0부터 s '직전'까지 자르는 메서드!