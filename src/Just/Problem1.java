package Just;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Problem1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int num, sum = 0;
        for(int i = 1; i <= 4; i++){
            num = Integer.parseInt(br.readLine());
            sum += num;
        }
        pw.println("Resultado: " + sum);
        pw.flush();
    }

}
