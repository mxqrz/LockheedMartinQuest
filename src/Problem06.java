// CORRECT

import java.util.*;
import java.math.*;

public class Problem06 {
    public static void main(String[] args)
    {
        try (Scanner s = new Scanner(System.in))
        {
            int cases = Integer.parseInt(s.nextLine());
            for (int i = 0; i < cases; i++)
            {
                int numAsteroids = Integer.parseInt(s.nextLine());
                ArrayList<int[]> asteroids = new ArrayList<int[]>();

                for (int j = 0; j < numAsteroids; j++)
                {
                    int[] asteroid = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                    asteroids.add(asteroid);
                }
                
                for (int j = 0; j < asteroids.size(); j++)
                {
                    for (int k = j + 1; k < asteroids.size(); k++)
                    {
                        int[] temp;
                        
                        double firstDist = Math.sqrt(Math.pow(asteroids.get(j)[0], 2) + Math.pow(asteroids.get(j)[1], 2));
                        double secondDist = Math.sqrt(Math.pow(asteroids.get(k)[0], 2) + Math.pow(asteroids.get(k)[1], 2));
                        
                        if (firstDist > secondDist)
                        {
                            temp = asteroids.get(j);
                            asteroids.set(j, asteroids.get(k));
                            asteroids.set(k, temp);
                        }

                    }
                }
                
                for (int j = 0; j < asteroids.size(); j++)
                {
                    System.out.println(asteroids.get(j)[0] + " " + asteroids.get(j)[1]);
                }
            }
        }
    }
}
