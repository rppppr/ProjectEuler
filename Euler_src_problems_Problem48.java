package problems;

import java.math.BigInteger;

public class Problem48
{
    Problem48()
    {
        BigInteger wynik = BigInteger.ZERO;
        BigInteger potega;
        for(int i = 1; i <= 1000; i++)
        {
            potega = new BigInteger(String.valueOf(i));
            potega = potega.pow(i);
            wynik = wynik.add(potega);
        }
        System.out.print("Wynik : " + wynik);
    }
}
