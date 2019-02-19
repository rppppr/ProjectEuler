package problems;

public class Problem14
{
    Problem14()
    {
        long n = 0;
        long max = 0;
        long licznik = 0;
        long liczba = 0;
        for(int i = 1; i <= 1000000 ; i++)
        {
            n = i;
            while(n > 1)
            {
                if (n % 2 == 0)
                {
                    n = n/2;
                }
                else if (n % 2 != 0)
                {
                    n = n*3 + 1;
                }
                licznik ++;
            }
            if(licznik > max)
            {
                max = licznik;
                liczba = i;
            }
            licznik = 0;
        }
        System.out.println("MAX: " + (max + 1));
        System.out.println("liczba: " + liczba);
    }
}
