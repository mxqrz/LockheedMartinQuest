// CORRECT

import java.util.*;
public class Problem03 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int cases = Integer.parseInt(s.nextLine());

        for (int i = 0; i < cases; i++)
        {
            int count = 0;
            String input = s.nextLine();
            for (int j = 0; j < input.length(); j++)
            {
                if (input.charAt(j) == 'a' || input.charAt(j) == 'e' || input.charAt(j) == 'i' || input.charAt(j) == 'o' || input.charAt(j) == 'u')
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
