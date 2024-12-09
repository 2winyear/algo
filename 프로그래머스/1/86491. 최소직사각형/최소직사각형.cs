using System;

public class Solution {
    public int solution(int[,] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        int max_w = 0;
        int max_h = 0;
        
        for (int i = 0; i < sizes.GetLength(0); i++)
        {
            if (sizes[i, 0] > sizes[i, 1])
            {
                width = sizes[i, 0];
                height = sizes[i, 1];
            }
            else
            {
                width = sizes[i, 1];
                height = sizes[i, 0];
            }
            
            
            if (max_w < width)
            {
                max_w = width;
            }
            if (max_h < height)
            {
                max_h = height;   
            }
        }
        
        answer = max_h * max_w;
        
        return answer;
    }
}