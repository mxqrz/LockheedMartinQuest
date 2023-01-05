import java.util.*;
import java.lang.*;

public class Problem08
{
    public static void main(String[] args)
    {
        final int EARTH_CIRCUMFERENCE = 40075;
        try(Scanner s = new Scanner(System.in))
        {
            int cases = Integer.parseInt(s.nextLine());
            for (int i = 0; i < cases; i++)
            {
                int altitude = Integer.parseInt(s.nextLine());
                double distance = EARTH_CIRCUMFERENCE + (2 * Math.PI * altitude);
                System.out.println((Math.round(distance * 10)) / 10.0);
            }
        }
    }
}