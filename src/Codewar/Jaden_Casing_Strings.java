package Codewar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Jaden_Casing_Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String word = br.readLine();

        String Jadencase = toJadenCase(word);
        pw.println(Jadencase);
        pw.flush();
    }

    public static String toJadenCase(final String phrase) {

        if(phrase == null || phrase.isEmpty()) return null;

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

}
