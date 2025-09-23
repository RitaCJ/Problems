package Just;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Problem2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        double num, sum = 0, media;

        for(int i = 1; i <= 3; i++){
            num = Double.parseDouble(br.readLine());
            sum += num;
        }

        media = sum / 3;
        DecimalFormat df;
        df = new DecimalFormat("0.00");
        pw.println("Resultado: " + df.format(media));
        pw.flush();
    }
}
