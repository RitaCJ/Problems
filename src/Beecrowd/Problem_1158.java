package Beecrowd;

import java.io.*;

public class Problem_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int sum = 0;
            String[] parts = br.readLine().split(" ");
            int X = Integer.parseInt(parts[0]);
            int Y = Integer.parseInt(parts[1]);
            while(Y != 0){
                if(X % 2 != 0){
                    sum += X;
                    Y -= 1;
                }
                X += 1;
            }
            pw.println(sum);
            pw.flush();
        }
    }
}
