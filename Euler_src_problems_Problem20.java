package problems;

import java.math.BigInteger;

public class Problem20
{
    Problem20()
    {
        System.out.println("Wartosc silnia dla n = 100 :: " + Silnia(new BigInteger("100")));
        BigInteger a = Silnia(new BigInteger("100"));
        String wynik = a.toString();
        long licznik = 0;
        for(int i = 0; i < wynik.length() ; i++)
        {
            licznik += Character.getNumericValue(wynik.charAt(i));
        }
        System.out.println("Suma cyfr w liczbie 100! = " + licznik);
    }
    public BigInteger Silnia(BigInteger n)
    {
        if(n == BigInteger.ZERO || n == BigInteger.ONE)
        {
            return BigInteger.ONE;
        }
        else
        {
            return n.multiply(Silnia(n.subtract(BigInteger.ONE)));
        }
    }
}
