package problems;

import java.math.BigInteger;

public class Problem16
{
    Problem16()
    {
        BigInteger a,b;
        int c = 1000;
        b = new BigInteger("2");
        a = b.pow(c);
        System.out.println(a);
        String d = a.toString();
        System.out.println(d);
        long licznik = 0;
        for(int i = 0 ; i < d.length() ; i ++)
        {
            licznik += Character.getNumericValue(d.charAt(i));
        }
        System.out.println("Liczba: " + licznik);
    }
}
