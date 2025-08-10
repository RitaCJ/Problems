package Beecrowd;

import java.io.*;

public class Problem_1021 {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

         int notes, coins;
         double num;
         float value = Float.parseFloat(br.readLine());

         pw.println("NOTAS:");
         pw.flush();
         if(value >= 100.0){
             num = value / 100.0;
             notes = (int) (num);
             value = (float) (value - (100.0 * notes));
             pw.println(notes + " nota(s) de R$ 100.00" );
             pw.flush();
         }else{
             pw.println("0 nota(s) de R$ 100.00" );
             pw.flush();
         }
         if(value >= 50.0){
             num = value / 50.0;
             notes = (int) (num);
             value = (float) (value - (50.0 * notes));
             pw.println(notes + " nota(s) de R$ 50.00" );
             pw.flush();
         }else{
             pw.println("0 nota(s) de R$ 50.00" );
             pw.flush();
         }
         if(value >= 20.0){
             num = value / 20.0;
             notes = (int) (num);
             value = (float) (value - (20.0 * notes));
             pw.println(notes + " nota(s) de R$ 20.00" );
             pw.flush();
         }else{
             pw.println("0 nota(s) de R$ 20.00" );
             pw.flush();
         }
         if(value >= 10.0){
             num = value / 10.0;
             notes = (int) (num);
             value = (float) (value - (10.0 * notes));
             pw.println(notes + " nota(s) de R$ 10.00" );
             pw.flush();
         }else{
             pw.println("0 nota(s) de R$ 10.00" );
             pw.flush();
         }

         if(value >= 5.0){
             num = value / 5.0;
             notes = (int) (num);
             value = (float) (value - (5.0 * notes));
             pw.println(notes + " nota(s) de R$ 5.00" );
             pw.flush();
         }else{
             pw.println("0 nota(s) de R$ 5.00" );
             pw.flush();
         }

         if(value >= 2.0){
             num = value / 2.0;
             notes = (int) (num);
             value = (float) (value - (2.0 * notes));
             pw.println(notes + " nota(s) de R$ 2.00" );
             pw.flush();
         }else{
             pw.println("0 nota(s) de R$ 2.00" );
             pw.flush();
         }

         pw.println("MOEDAS:");
         pw.flush();

         if(value >= 1.0){
             num = value / 1;
             coins = (int) (num);
             value = value - coins;
             pw.println(coins + " moeda(s) de R$ 1.00" );
             pw.flush();
         }else{
             pw.println("0 moeda(s) de R$ 1.00");
             pw.flush();
         }
         if(value >= 0.50){
             num = value / 0.50;
             coins = (int) (num);
             value = (float) (value - (0.50 * coins));
             pw.println(coins + " moeda(s) de R$ 0.50" );
             pw.flush();
         }else{
             pw.println("0 moeda(s) de R$ 0.50" );
             pw.flush();
         }

         if(value >= 0.25){
             num = value / 0.25;
             coins = (int) (num);
             value = (float) (value - (0.25 * coins));
             pw.println(coins + " moeda(s) de R$ 0.25" );
             pw.flush();
         }else{
             pw.println("0 moeda(s) de R$ 0.25" );
             pw.flush();
         }
         if(value >= 0.10){
             num = value / 0.10;
             coins = (int) (num);
             value = (float) (value - (0.10 * coins));
             pw.println(coins + " moeda(s) de R$ 0.10" );
             pw.flush();
         }else{
             pw.println("0 moeda(s) de R$ 0.10" );
             pw.flush();
         }
         if(value >= 0.05){
             num = value / 0.05;
             coins = (int) (num);
             value = (float) (value - (0.05 * coins));
             pw.println(coins + " moeda(s) de R$ 0.05" );
             pw.flush();
         }else{
             pw.println("0 moeda(s) de R$ 0.05" );
             pw.flush();
         }
         if(value >= 0.01){
             num = value / 0.01;
             num = Math.round(num);
             coins = (int) (num);
             pw.println(coins + " moeda(s) de R$ 0.01" );
             pw.flush();
         }else{
             pw.println("0 moeda(s) de R$ 0.01" );
             pw.flush();
         }
     }
}
