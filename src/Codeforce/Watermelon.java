

import java.io.*;

public class Watermelon {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int weight = Integer.parseInt(br.readLine());

        if(weight > 2 && weight % 2 == 0){
            pw.println("YES");
        }else{
            pw.println("NO");
        }

        pw.flush();

    }
}
