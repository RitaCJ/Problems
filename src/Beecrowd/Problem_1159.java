package Beecrowd;

import java.io.*;

public class Problem_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        int X = -1;
        while(X != 0){
            int sum = 0;
             X = Integer.parseInt(br.readLine());
             if(X == 0){
                 continue;
             }
            for(int i = 0; i < 5; i++){
                if(X % 2 != 0){
                    X += 1;
                }
                sum += X;
                X += 1;
            }
            pw.println(sum);
            pw.flush();
        }

    }
}
