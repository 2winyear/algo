using System;
using System.Linq;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 교집합 처리
        int[] intersect = lost.Intersect(reserve).ToArray();
        lost = lost.Except(intersect).ToArray();
        reserve = reserve.Except(intersect).ToArray();

        // 정렬
        Array.Sort(lost);
        Array.Sort(reserve);
        
        // 학생 기본 체육복 상태 (1개)
        int[] student = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            student[i] = 1;
        }

        // 여벌 체육복 추가
        foreach (int r in reserve) {
            student[r]++;
        }

        // 도난 처리
        foreach (int l in lost) {
            student[l]--;
        }

        // 체육복 빌리기
        foreach (int l in lost) {
            if (l - 1 > 0 && student[l - 1] == 2) 
            {
                student[l - 1]--;
                student[l]++;
            } 
            else if (l + 1 <= n && student[l + 1] == 2) 
            {
                student[l + 1]--;
                student[l]++;
            }
        }

        // 체육복이 1개 이상인 학생 수 계산
        for (int i = 1; i <= n; i++)
        {
            if (student[i] >= 1)
                answer++;
        }
        
        return answer;
    }
}
