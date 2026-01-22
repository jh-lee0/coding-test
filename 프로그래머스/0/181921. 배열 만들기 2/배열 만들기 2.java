class Solution {
    public int[] solution(int l, int r) { // 문자열 검사 vs 나머지 연산
        int index = 0;
        int count = 0;
        int[] answer;
        for(int i = l; i <= r; i++) {
            int n = i;
            boolean is_true = true; // 매 for 루프마다 초기화 되어야 함!
            while(n > 0) {
                if(n % 10 == 0 || n % 10 == 5) {  // 중요! 원본 i는 건드리면 안됨, 검사용 편수 n 사용
                    n /= 10;
                }
                else {
                    is_true = false;
                    break;
                }
            }
            if(is_true) count++;
        }
        
        if(count > 0) { 
            answer = new int[count];
        }
        else {
            answer = new int[] {-1};
            return answer;
        }            
        index = 0; // 위에서 쓴 index 0으로 초기화 시켜서 쓰면 된다!
    
        for(int i = l; i <= r; i++) {
            int n = i;
            boolean is_true = true;
            while(n > 0) {
                if(n % 10 == 0 || n % 10 == 5) {  // 중요! 원본 i는 건드리면 안됨, 검사용 편수 n 사용
                    n /= 10;
                }
                else {
                    is_true = false;
                    break;
                }
            }
            if(is_true) answer[index++] = i;
        }
        return answer;
    }
}
