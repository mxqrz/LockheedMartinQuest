// CORRECT

import java.util.*;

public class Problem02 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int cases = Integer.parseInt(s.nextLine());

        for (int i = 0; i < cases; i++)
        {
            String input = s.nextLine();
            int[] nums = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println((nums[0] + nums[1]) + " " + (nums[0] * nums[1]));
        }
    }
}
