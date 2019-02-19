package problems;

import java.util.ArrayList;

public class Problem39
{
    Problem39()
    {
        for(int i = 1 ; i <= 1000 ; i ++)
        {
            for(int j = 1; j < i ; j++)
            {
                for(int z = 1 ; z <= j ; z++)
                {
                    for(int  x = 1; x <= z; x++)
                    {
                        if(j + z > x && j + x > z && z + x > j)
                        {
                            if(j + z + x == i && j != z && j != x && z != x && z*z + x*x == j*j)
                            {
                                System.out.println("Znaleziono rozwiazanie: " + j + " + " + z + " + " + x + " = " + i);
                            }
                        }
                    }
                }
            }
        }
    }

}