package Beecrowd;

import java.util.Scanner;

public class Problem_1160 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

            for (int i = 1; i <= T; i++) {
                int year = 0;
                int PA = sc.nextInt();
                int PB = sc.nextInt();

                double G1 = sc.nextDouble();
                double G2 = sc.nextDouble();

                while (PB >= PA) {
                    PA += (int) (PA * (G1 / 100));
                    PB += (int) (PB * (G2 / 100));
                    year++;

                    if (year > 100) {
                        System.out.println("Mais de 1 seculo.");
                        break;
                    }

                }
                   if(year <= 100){
                    System.out.println(year + " anos.");
                }
            }
    }

}
