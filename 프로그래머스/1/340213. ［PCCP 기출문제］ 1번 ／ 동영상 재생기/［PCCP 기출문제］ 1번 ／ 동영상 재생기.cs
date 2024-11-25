using System;

public class Solution {
    public int convertToSS(string time)
    {
        int result = 0;
        
        int mm = (time[0] - '0') * 10 + (time[1] - '0');
        int ss = (time[3] - '0') * 10 + (time[4] - '0');
        
        result = mm * 60 + ss;
        
        return result;
    }
    
    public string solution(string video_len, string pos, string op_start, string op_end, string[] commands) {
        string answer = "";
        
        int video_len_ss = convertToSS(video_len);
        int pos_ss = convertToSS(pos);
        int op_start_ss = convertToSS(op_start);
        int op_end_ss = convertToSS(op_end);
        
        // pos의 시작위치가 op_start나 op_end 사이이면 op_end로 이동
        if (op_start_ss <= pos_ss && pos_ss <= op_end_ss)
        {
            pos_ss = op_end_ss;
        }
        
        foreach (string com in commands)
        {

            // command 대로 실행
            if (com == "prev")
            {
                pos_ss -= 10; 
                if (pos_ss < 10)
                {
                    pos_ss = 0;
                }
            }
            else if (com == "next")
            {
                pos_ss += 10;
                if (pos_ss > video_len_ss)
                {
                    pos_ss = video_len_ss;
                }
            }
            
            if (op_start_ss <= pos_ss && pos_ss <= op_end_ss)
            {
                pos_ss = op_end_ss;
            }
        }
         
        // pos_ss mm:ss로 바꾸기
        int time_m = pos_ss / 60;
        int time_s = pos_ss % 60;
        
        answer = time_m.ToString("D2");
        answer += ":";
        answer += time_s.ToString("D2");
        
        return answer;
    }
}