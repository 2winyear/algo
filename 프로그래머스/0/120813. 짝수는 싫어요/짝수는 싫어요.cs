using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int n) {
        int[] answer = new int[] {};
        
        List<int> temp = new List<int>();
        
        for (int i = 0; i <= n; i++)
        {
            if (i % 2 == 1)
            {
                temp.Add(i);
            }
        }
        
        answer = temp.ToArray();
        
        return answer;
    }
}

