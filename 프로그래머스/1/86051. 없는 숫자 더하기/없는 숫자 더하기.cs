using System;

public class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int temp = 0;
        
        for (int i = 0; i < numbers.Length; i++)
        {
            temp += numbers[i];
        }
        
        answer = 45 - temp;
        
        return answer;
    }
}