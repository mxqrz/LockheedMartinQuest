// CORRECT

import java.util.*;
public class Problem04 {
    public static void main(String[] args)
    {
        try (Scanner s = new Scanner(System.in))
        {
            int cases = Integer.parseInt(s.nextLine());
            for (int i = 0; i < cases; i++)
            {
                boolean anagram = true;

                String input = s.nextLine();
                String word = input.substring(0, input.indexOf("|"));
                String test = input.substring(input.indexOf("|") + 1);

                if (word.length() == test.length() && !(word.equals(test))) {
                    for (int j = 0; j < word.length(); j++) {
                        if (test.indexOf(word.charAt(j)) == -1) {
                            anagram = false;
                        }
                        test = test.replaceFirst(Character.toString(word.charAt(j)), "");
                    }
                }
                else
                {
                    anagram = false;
                }

                if (anagram) {
                    System.out.println(input + " = ANAGRAM");
                } else {
                    System.out.println(input + " = NOT AN ANAGRAM");
                }
            }
        }
    }
}
