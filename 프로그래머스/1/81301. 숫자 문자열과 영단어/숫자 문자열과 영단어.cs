using System;
using System.Collections.Generic;

public class Solution {
    public int solution(string s) {
        Dictionary <String, int> temp = new Dictionary <String, int>();
        String answer = "";
        
        temp.Add("zero", 0);
        temp.Add("one", 1);
        temp.Add("two", 2);
        temp.Add("three", 3);
        temp.Add("four", 4);
        temp.Add("five", 5);
        temp.Add("six", 6);
        temp.Add("seven", 7);
        temp.Add("eight", 8);
        temp.Add("nine", 9);
        
        for (int i = 0; i < s.Length; i++)
        {
            if (s[i] >= '0' && s[i] <= '9')
            {
                answer += s[i];
            }
            else
            {
                foreach (KeyValuePair<String, int> kvp in temp)
                {
                    String t = kvp.Key;
                    if (i + t.Length <= s.Length && s.Substring(i, t.Length) == t)
                    {
                        answer += kvp.Value.ToString();
                        i += t.Length - 1;
                        break;
                    }
                }
            }
        }
        
        return int.Parse(answer);
    }
}