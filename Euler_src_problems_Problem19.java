package problems;

import javax.xml.crypto.Data;

public class Problem19
{
    int [] iloscDniMiesiecy  = {31,28,31,30,31,30,31,31,30,31,30,31};
    String [] dniTygodnia = {"poniedzialek","wtorek","sroda","czwartek","piatek","sobota","niedziela"};
    int licznikNiedziel = 0;
    Problem19()
    {

        int x = 1;
        for(int i = 1901 ; i < 2001 ; i++)
        {
            for(int j = 0 ; j < 12 ; j++)
            {
                for(int z = 1; z <= iloscDniMiesiecy[j] ; z++)
                {
                    if(z == 1 && dniTygodnia[x] == "niedziela")
                    {
                        licznikNiedziel++;
                    }
                    System.out.println("DATA " + z + ":" + (j+1) + ":" + i + ", dzien = " + dniTygodnia[x] + " x = " + x);
                    x++;
                    if(x == 7) {x = 0;}
                }
            }
        }
        System.out.println("Ilosc niedziel zaczynajacych miesiac w tym okresie: " + licznikNiedziel);
    }
    public boolean CzyJestPrzestepny(int rok)
    {
        if((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}