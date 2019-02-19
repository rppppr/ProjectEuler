package problems;

import java.math.BigInteger;

public class Problem25
{

    public void Fibonacci()
    {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(0);
        int i = 1;
        while(c.toString().length() <= 1000)
        {
            c =  a.add(b);
            a = b;
            b = c;
            System.out.println(i + 2 + " liczba ciagu Fibonacciego = " + c.toString());
            i++;
        }
    }
}