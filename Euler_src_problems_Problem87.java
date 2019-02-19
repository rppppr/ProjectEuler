package problems;

public class Problem87
{
    Problem87()
    {
        long licznik = 0;
        for(int i = 1 ; i < 50000000 ; i++)
        {
            for(int j = 1 ; j < i ; j++)
            {
                for(int z = 1 ; z < i ; z++)
                {
                    for(int x = 1 ; x < i ; x++)
                    {
                        if(IsPrime(j) && IsPrime(z) && IsPrime(x))
                        {
                            if(i == Math.pow(j,2) + Math.pow(z,3) +Math.pow(x,4))
                            {
                                System.out.println("Znaleziono rozwiazanie " + i);
                                licznik++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Ilosc rozwiazan: " + licznik);
    }

    public boolean IsPrime(int n)
    {
        int licznik = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
                licznik ++;
            }
        }
        if(licznik != 2)
        {
            return false;
        }
        return true;
    }
}