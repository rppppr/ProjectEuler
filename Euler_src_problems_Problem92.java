package problems;

import java.util.ArrayList;

public class Problem92
{
    ArrayList <Integer> lista = new ArrayList<Integer>();
    int sprawdzana = 0;
    int j = 0 ;
    int x = 0;
    int licznik = 0;
    Problem92()
    {
        String liczba;
        for (int i = 1 ; i < 10000000 ; i++)
        {
            liczba = String.valueOf(i);
            while(CzyJuzWystapila(x) != true && x != 89)
            {
                lista.add(x);
                for(int z = 0 ; z < liczba.length() ; z ++)
                {
                    j += (int) Math.pow(Character.getNumericValue(liczba.charAt(z)),2);
                }
                x = j;
                j = 0;
                liczba = String.valueOf(x);
            }
            x = 0;
            for(int z = lista.size() - 1 ; z >= 0 ; z--)
            {
                lista.remove(z);
            }
            System.out.println("Koniec ciagu " + liczba + "\n ------");
            if(liczba.equals("89"))
            {
                licznik++;
            }
        }
        System.out.println("Ilosc liczb konczacych ciag na 89 : " + licznik);
    }
    public boolean CzyJuzWystapila(int n)
    {
        for(int i = 0 ; i < lista.size() ; i++)
        {
            if(n == lista.get(i))
            {
                return true;
            }
        }
        return false;
    }
}