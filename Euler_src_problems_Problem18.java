package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem18
{
    ArrayList <Integer> lista = new ArrayList<>();
    int[][] tablica =
            {
                    { 75 },
                    { 95,  64},
                    { 17,  47,  82},
                    { 18,  35,  87,  10},
                    { 20,  4,  82,  47,  65},
                    { 19,  1,  23,  75,  3,  34},
                    { 88,  2,  77,  73,  7,  63,  67},
                    { 99,  65,  4,  28,  6,  16,  70,  92},
                    { 41,  41,  26,  56,  83,  40,  80,  70,  33},
                    { 41,  48,  72,  33,  47,  32,  37,  16,  94,  29},
                    { 53,  71,  44,  65,  25,  43,  91,  52,  97,  51,  14},
                    { 70,  11,  33,  28,  77,  73,  17,  78,  39,  68,  17,  57},
                    { 91,  71,  52,  38,  17,  14,  91,  43,  58,  50,  27,  29,  48},
                    { 63,  66,  4,  68,  89,  53,  67,  30,  73,  16,  69,  87,  40,  31},
                    { 4,  62,  98,  27,  23,  9,  70,  98,  73,  93,  38,  53,  60,  4,  23}
            };
    public ArrayList ZnajdzMax(int tablica [][])
    {
        int max = 0;
        for (int i = -1 ; i < tablica.length - 1 ; i++)
        {
            for (int j = -1; j < tablica[i].length; j++)
            {
                System.out.println("i : " + i + " j : " + j);
            }
            max = 0;
        }
        return lista;
    }
    Problem18()
    {
        ZnajdzMax(tablica);
        int licznik = 0;
        for(int i = 0 ; i < lista.size() ; i++)
        {
            System.out.println(lista.get(i));
            licznik += lista.get(i);
        }
        System.out.println(licznik);
    }
}
