package problems;

import java.math.BigInteger;

public class Problem15
{
    Problem15()
    {
        BigInteger a = Factorial(new BigInteger("40"));
        BigInteger b = Factorial(new BigInteger("20"));
        BigInteger c = Factorial(new BigInteger("20"));
        BigInteger d = b.multiply(c);
        System.out.println("40!/20!*20! = " + a.divide(d));

    }
    public BigInteger Factorial(BigInteger n)
    {
        if(n.equals(BigInteger.ONE))
        {
            return BigInteger.ONE;
        }
        if(n.equals(BigInteger.ZERO))
        {
            return BigInteger.ONE;
        }
        else
        {
            n = n.multiply(Factorial(n.subtract(BigInteger.ONE)));
            return n;
        }
    }
}
