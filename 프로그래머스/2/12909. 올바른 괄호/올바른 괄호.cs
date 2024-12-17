using System;
using System.Collections.Generic;

public class Solution {
    public bool solution(string s) {
        bool answer = true;
        Stack<Char> temp = new Stack<Char>();
        
        for (int i = 0; i < s.Length; i++)
        {
            if (s[i] == '(')
            {
                temp.Push('a');
            }
            else
            {
                if (temp.Count == 0)
                {
                    answer = false;
                    return false;
                }
                temp.Pop();
            }
        }
        if (temp.Count != 0)
            answer = false;
        
        return answer;
    }
}