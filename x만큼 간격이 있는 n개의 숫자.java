// x만큼 간격이 있는 n개의 숫자 [https://programmers.co.kr/learn/courses/30/lessons/12954]

// 나의풀이
import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0;i<n;i++){
            answer[i]=(long)(i+1)*x;
        }

        return answer;
    }
}




// 다른사람의 풀이

import java.util.*;
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}

