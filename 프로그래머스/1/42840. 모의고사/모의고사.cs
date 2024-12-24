using System;
using System.Linq;
using System.Collections.Generic;

public class Solution {
    public List<int> solution(int[] answers) {
        List<int> result = new List<int>();
        int[] a_pattern = { 1, 2, 3, 4, 5 };
        int[] b_pattern = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] c_pattern = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
        int[] counts = new int[3];
        
        for (int i = 0; i < answers.Length; i++)
        {
            if (answers[i] == a_pattern[i % 5])
                counts[0]++;
            if (answers[i] == b_pattern[i % 8])
                counts[1]++;
            if (answers[i] == c_pattern[i % 10])
                counts[2]++;
        }

        int max = counts.Max();
        
         for (int i = 0; i < 3; i++){
            if (counts[i] == max){
                result.Add(i + 1);
            }
        }

        
        return result;
    }
}