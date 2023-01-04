// CORRECT

import java.util.*;

public class Problem01 {
    public static void main(String[] args)
    {
        try (Scanner s = new Scanner(System.in)) {
            int intervals = Integer.parseInt(s.nextLine());

            for (int i = 0; i < intervals; i++) {
                String speeds = s.nextLine();

                double v = Double.parseDouble(speeds.substring(0, speeds.indexOf(":")));
                double x = Double.parseDouble(speeds.substring(speeds.indexOf(":") + 1));

                if (v == 0) {
                    System.out.println("SAFE");
                } else {
                    double seconds = x / v;

                    if (seconds <= 5) {
                        if (seconds <= 1) {
                            System.out.println("SWERVE");
                        } else {
                            System.out.println("BRAKE");
                        }
                    } else {
                        System.out.println("SAFE");
                    }
                }
            }
        }
    }
}
