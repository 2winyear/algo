using System;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Array.Sort(array);
        
        int index = array.Length / 2;
        
        answer = array[index];
        
        return answer;
    }
}