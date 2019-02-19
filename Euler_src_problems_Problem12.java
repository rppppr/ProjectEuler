package problems;

public class Problem12
{
    Problem12()
    {
        int licznik = 0;
        int dzielniki = 0;
        for(int i = 1 ; i <= 100000 ; i++)
        {
            for(int j  = 1 ; j <= i ; j++)
            {
                licznik += j;
            }
            for(int j  = 1 ; j <= licznik ; j++)
            {
                if(licznik % j == 0)
                {
                    dzielniki ++;
                    if(dzielniki > 500)
                    {
                        break;
                    }
                }
            }
            System.out.println(licznik + " ma " + dzielniki + " dzielnikow");
            licznik = 0;
            dzielniki = 0;
        }
    }
}
