package Codewar;

import java.io.*;

public class Return_Negative {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        final int num = Integer.parseInt(br.readLine());
        int result;

        result = makeNegative(num);
        pw.println(result);
        pw.flush();
    }

    public static int makeNegative(final int x) {
       int num_x;

       if(x <= 0){
           return x;
       }

       num_x = 2 * x;
       num_x = x - num_x;

        return num_x; // Your code here.

    }
}
