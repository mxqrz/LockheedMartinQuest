// INCOMPLETE

import java.util.*;
import java.lang.*;

public class Problem08
{
    public static void main(String[] args)
    {
        try(Scanner s = new Scanner(System.in))
        {
            int cases = Integer.parseInt(s.nextLine());

            for (int i = 0; i < cases; i++)
            {
                int[] input = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                ArrayList<String> dictionary = new ArrayList<String>();
                ArrayList<String> typos = new ArrayList<String>();
                
                
                for (int j = 0; j < input[0]; j++)
                {
                    dictionary.add(s.nextLine());
                }
                
                for (int j = 0; j < input[1]; j++)
                {
                    typos.add(s.nextLine());
                }
                
                for (int j = 0; j < typos.size(); j++)
                {
                    String typo = typos.get(j);
                    int[] hammingDists = new int[dictionary.size()];
                    int greatestIndex = 0;
                    
                    for (int k = 0; k < dictionary.size(); k++)
                    {
                        for (int l = 0; l < typo.length(); l++)
                        {
                            if (dictionary.get(k).indexOf(typo.charAt(l) != -1)
                            {
                                hammingDists[k] += 1;
                            }
                        }
                    }
                    
                    for (int k = 0; k < hammingDists.length; k++)
                    {
                        if (hammingDists[k] > hammingDists[greatestIndex])
                        {
                            greatestIndex = k;
                        }
                    }
                    
                    System.out.println(dictionary.get(greatestIndex));
                }
                
            }
        }
    }
}