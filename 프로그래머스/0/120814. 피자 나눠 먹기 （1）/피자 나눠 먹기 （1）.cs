using System;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;
        
        temp = n % 7;
        if (temp > 0)
            answer = n / 7 + 1; 
        else
            answer = n / 7;
        
        return answer;
    }
}