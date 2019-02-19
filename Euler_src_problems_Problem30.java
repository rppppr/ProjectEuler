package problems;

import java.util.ArrayList;

public class Problem30
{
    Problem30()
    {
        int wynik = 0;
        long licznik = 0;
        String test = "";
        for(int i = 2 ; i < 1000000 ; i++)
        {
            int [] lista = new int[(String.valueOf(i)).length()];
            test = String.valueOf(i);
            System.out.println("i: " + i);
            for(int j = 0; j < lista.length; j ++)
            {
                lista[j] = Character.getNumericValue(test.charAt(j));
                System.out.print("lista[" + j + "] = " + lista[j] + " ");
            }
            System.out.println(" ");
            for(int j = 0 ; j < lista.length ; j++)
            {
                wynik += Math.pow(lista[j],5);
                if(wynik == i && j == lista.length - 1)
                {
                    System.out.println("Znaleziono rozwiazanie: " + wynik);
                    licznik += wynik;
                }
            }
            for(int j = lista.length - 1; j >= 0 ; j --)
            {
                lista[j] = 0;
            }
            wynik = 0;
        }
        System.out.println("Rozwiazanie: " + licznik);
    }
}
