package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1011 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x;
            System.out.println(solution(distance));
        }
    }

    public static Integer solution(int distance) {
        int cur_move = 1;
        int cnt = 0;
        while(distance>0) {
            distance -= cur_move;
            cnt++;
            if(distance<=0) {
                return cnt;
            }

            distance -= cur_move;
            cnt++;
            cur_move++;
        }
        return cnt;
    }
}
