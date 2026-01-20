class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(c == '1') { // 문자가 1인 경우
                mode = (mode == 0) ? 1 : 0; // mode 알맞게 변경
            }   
            if(mode == 0) {
                if(i % 2 == 0 && c != '1') sb.append(c);
            }
            else {
                if(i % 2 != 0 && c != '1') sb.append(c);
            }
        }
        return (sb.length() != 0) ? sb.toString() : "EMPTY";
    }
}