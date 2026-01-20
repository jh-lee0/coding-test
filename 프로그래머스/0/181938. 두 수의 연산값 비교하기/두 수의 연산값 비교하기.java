class Solution {
    public int solution(int a, int b) {
        int res1 = Integer.parseInt("" + a + b);
        int res2 = 2 * a * b;
        
        int result = (res2 > res1) ? res2 : res1;
        return result;
    }
}

// 개선점 1: 변수명으로 res1, res2는 명확하지 않음
// 개선점 2: ""로 문자열 붙이는 트릭