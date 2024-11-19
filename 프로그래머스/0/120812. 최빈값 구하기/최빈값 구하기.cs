using System;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int [] p = new int[1000];
        
        if (array.Length <= 1)
        {
            answer = array[0];
            return answer;
        }
        
        for (int i = 0; i < array.Length; i++)
        {
            p[array[i]] += 1;
        }
        
        int max = 0;
        for (int i = 0; i < p.Length; i++)
        {   
            if (max < p[i])
            {
                max = p[i];                                         
                answer = i;
            }
        }
        
        int count = 0;
        for (int i = 0; i < p.Length; i++)
        {
            if (max == p[i])
                count++;
            if (count >= 2)
            {
                answer = -1;
                return answer;
            }
        }
        
        return answer;
    }
}