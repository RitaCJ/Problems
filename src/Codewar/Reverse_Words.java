package Codewar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Reverse_Words {

 public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     PrintWriter pw = new PrintWriter(System.out);

     String word = br.readLine();

     String reverse_word = reverseWords(word);
     pw.println(reverse_word);
     pw.flush();
 }

    public static String reverseWords(final String original) {
        String[] reverse_word = original.split(" ");
        String reversed = "";
        if(reverse_word.length == 0){
            return original;
        }

        for(int i = 0; i < reverse_word.length; i++){
            StringBuilder reversed_build = new StringBuilder(reverse_word[i]);
            reversed_build.reverse();
            reversed += reversed_build.toString() + " ";
        }

        return reversed.trim();

    }
}

