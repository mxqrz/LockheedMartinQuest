// CORRECT

import java.util.*;

public class Problem05 {
    public static void main(String[] args)
    {
        try (Scanner s = new Scanner(System.in))
        {
            int cases = Integer.parseInt(s.nextLine());
            for (int i = 0; i < cases; i++)
            {
                int[] nums = Arrays.stream(s.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                System.out.println((nums[0] * 2) + (nums[1] * 4) + (nums[2] * 4));
            }
        }
    }
}
