using System;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int pieces = 0;
        
        for (int i = 1; i<= 100; i++)
        {
            pieces = i * 6;
            if (pieces % n == 0)
            {
                answer = i;
                return answer;
            }
        }
        
        return answer;
    }
}