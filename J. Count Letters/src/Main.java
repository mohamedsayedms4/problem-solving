import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Given a string S. Determine how many times does each letter occurred in S.
 *
 * Input
 * Only one line contains the string S (1 ≤ |S| ≤ 107) where |S| is the length of the string and it consists of only lowercase English letters.
 *
 * Output
 * For each character that appears in S, print a single line that contains the following format: "X : Y" where X is the letter and Y is the number of times that letter X occurred in S.
*/
 public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> letters = new ArrayList<Character>();
        letters.addAll(map.keySet());
        Collections.sort(letters);

        for(Character c : letters){
            System.out.println(c + " : " + map.get(c));
        }
    }
}