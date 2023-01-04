// INCOMPLETE

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
                ArrayList<Double> distances = new ArrayList<Double>();
                LinkedHashMap<int[], Double> info = new LinkedHashMap<int[], Double>();


                for (int j = 0; j < numAsteroids; j++)
                {
                    int[] asteroid = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                    double distance = Math.sqrt(Math.pow(asteroid[0], 2) + Math.pow(asteroid[1], 2));

                    asteroids.add(asteroid);
                    distances.add(distance);
                }
            }
        }
    }
}
