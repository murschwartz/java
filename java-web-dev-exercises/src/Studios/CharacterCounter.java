package Studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String text = in.nextLine();
        text = text.toLowerCase();

        HashMap<Character, Integer> counts = new HashMap<>();

        for(char c : text.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                //c for the first time
                if(!counts.containsKey(c)) {
                    counts.put(c, 1);
                }else { //already seen c
                    int seen = counts.get(c);
                    counts.put(c, seen + 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
