using System;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int count_zero = 0;
        
        
        for (int i = 0; i < lottos.Length; i++)
        {
            if(lottos[i] == 0)
                count_zero++;
        }
        
        for (int i = 0; i < win_nums.Length; i++)
        {
            for (int j = 0; j < lottos.Length; j++)
            {   
                if (win_nums[i] == lottos[j])
                {
                    count++;
                    break;
                }
            }
        }
        
        
        
        answer[0] = 7 - count - count_zero;
        answer[1] = 7 - count;
        
        if (answer[1] > 6)
        {
            answer[1] = 6;
        }
        if (answer[0] > 6)
        {
            answer[0] = 6;
        }
        
        return answer;
    }
}