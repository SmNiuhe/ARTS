package UniqueMorseCodeWords_804;

import java.util.TreeSet;

public class UniqueMorseCodeWords {



    public static int uniqueMorseRepresentations(String[] words) {

        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        TreeSet<String> treeSet = new TreeSet<>();

        for (String word : words) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < word.length(); i++) {
                stringBuffer.append(morseCode[word.charAt(i) - 'a']);
            }
            treeSet.add(stringBuffer.toString());
        }
        return treeSet.size();
    }


    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));

    }

}
