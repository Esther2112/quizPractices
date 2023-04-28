import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quizNum = Integer.parseInt(br.readLine());
        int count = quizNum;

        while (quizNum != 0) {
            String quiz = br.readLine();
            Map<Character, Integer> alphabet = new HashMap<>();

            for (int i = 0; i < quiz.length(); i++) {
                if (!alphabet.containsKey(quiz.charAt(i))) {
                    alphabet.put(quiz.charAt(i), 1);
                } else {
                    alphabet.replace(quiz.charAt(i), alphabet.get(quiz.charAt(i)) + 1);
                }
            }

            Set<Character> alphaSet = alphabet.keySet();
            outer: for (Character word : alphaSet) {

                int index = quiz.indexOf(word);

                for (int i = index; i < index + (alphabet.get(word)); i++) {
                    if (!word.equals(quiz.charAt(i))) {
                        count--;
                        break outer;
                    }
                }

            }
            quizNum--;
        }
        System.out.println(count);

    }
}