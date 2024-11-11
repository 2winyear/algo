using System;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.Length];
        
        int i = 0;
        foreach (int num in numbers)
        {
            answer[i] = num * 2;
            i++;
        }
        
        return answer;
    }
}