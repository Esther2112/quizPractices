import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        Map<Character, Integer> wordCount = new HashMap<>();
        word = word.toUpperCase();
        Character maxW = ' ';
        Integer maxV = 0;
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if(wordCount.containsKey(word.charAt(i))) {
                wordCount.replace(word.charAt(i), wordCount.get(word.charAt(i)) + 1);
            } else {
                wordCount.put(word.charAt(i), 1);
            }
        }

        Set<Character> wordSet = wordCount.keySet();
        Iterator<Character> iter = wordSet.iterator();
        while(iter.hasNext()){
            Character key = iter.next();
            if(wordCount.get(key) > maxV) {
                maxV = wordCount.get(key);
                maxW = key;
            }
        }

        List<Integer> values = new ArrayList<>(wordCount.values());
        for (int i = 0; i < values.size(); i++) {
            if(values.get(i).equals(maxV)){
                count++;
            }
        }

        if(count > 1){
            System.out.println("?");
        }else {
            System.out.println(maxW);
        }
    }
}