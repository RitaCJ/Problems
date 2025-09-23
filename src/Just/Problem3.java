package Just;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        double grade1, grade2, grade3, average;
        int weigth1, weigth2, weigth3, sum = 0;

       pw.println("Input the first grade: ");
       pw.flush();
       grade1 = Double.parseDouble(br.readLine());
       pw.println("Input the second grade: ");
       pw.flush();
       grade2 = Double.parseDouble(br.readLine());
       pw.println("Input the third grade: ");
       pw.flush();
       grade3 = Double.parseDouble(br.readLine());

       pw.println("Input the first weigth: ");
       pw.flush();
       weigth1 = Integer.parseInt(br.readLine());
       pw.println("Input the second weigth: ");
       pw.flush();
       weigth2 = Integer.parseInt(br.readLine());
       pw.println("Input the third weigth: ");
       pw.flush();
       weigth3 = Integer.parseInt(br.readLine());

       sum = weigth1 + weigth2 + weigth3;
       average = (grade1 * weigth1 + grade2 * weigth2 + grade3 * weigth3) / sum;

       DecimalFormat df = new DecimalFormat("0.00");
       pw.println("Resultado: " + df.format(average));
       pw.flush();

    }
}
