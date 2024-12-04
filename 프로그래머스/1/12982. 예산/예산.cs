using System;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Array.Sort(d);
        
        for (int i = 0; i < d.Length; i++)
        {
            answer += d[i];
            if (answer > budget)
            {
                answer = answer - d[i];
                return i;
            }
        }
        
        answer = d.Length;
        
        return answer;
    }
}