package problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Problem29
{
    ArrayList <BigInteger> powtorzenia = new ArrayList<BigInteger>();
    BigInteger dodaj = BigInteger.ZERO;
    long licznik = 0;
    Problem29()
    {
        for(int i = 2; i <= 100 ; i++)
        {
            for(int j = 2 ; j <= 100 ; j++)
            {
                BigInteger a = BigInteger.valueOf(i);
                dodaj = a.pow(j);
                System.out.println("Czy liczba " + dodaj + " rowna " + i + " ^ " + j + " juz wystapila? " + CzyJuzWystapilo(dodaj));
                if(!CzyJuzWystapilo(dodaj))
                {
                    powtorzenia.add(dodaj);
                    licznik++;
                }
            }
        }
        System.out.println("Wynik:");
        Collections.sort(powtorzenia);
        for(int i = 0 ; i < powtorzenia.size() ; i ++)
        {
            System.out.println(powtorzenia.get(i) + " ");
        }
        System.out.print("\n Suma wszystkich = " + powtorzenia.size());
    }
    public boolean CzyJuzWystapilo(BigInteger n)
    {
        for(int i = 0; i < powtorzenia.size() ; i++)
        {
            if(n.compareTo(powtorzenia.get(i)) == 0)
            {
                return true;
            }
        }
        return false;
    }
}
