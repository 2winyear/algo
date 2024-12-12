using System;

public class Solution {
    int count = 0;
    
    public void dfs(int depth, int[] numbers, int target, int sum)
    {
        if (depth == numbers.Length)
        {
            if (sum == target)
            {
                count++;
            }
            return;
        }
        
        dfs(depth + 1, numbers, target, sum + numbers[depth]);
        dfs(depth + 1, numbers, target, sum - numbers[depth]);
    }
    
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        
        return count;
    }
}