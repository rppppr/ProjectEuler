package problems;

public class Problem41
{
    Problem41()
    {
        int [] tablica = {0,0,0,0,0,0,0,0,0,0};
        boolean wyjscie = true;
        int i = 1;
        int licznik = 0;
        long wynik = 0;
        String test = "";
        while(i < 55555)
        {
            test = String.valueOf(i);

            if(IsPrime(i))
            {
                for(int j = 0 ; j < test.length() ; j++)
                {
                    if(test.charAt(j) == '0') {tablica[0]++;}
                    if(test.charAt(j) == '1') {tablica[1]++;}
                    if(test.charAt(j) == '2') {tablica[2]++;}
                    if(test.charAt(j) == '3') {tablica[3]++;}
                    if(test.charAt(j) == '4') {tablica[4]++;}
                    if(test.charAt(j) == '5') {tablica[5]++;}
                    if(test.charAt(j) == '6') {tablica[6]++;}
                    if(test.charAt(j) == '7') {tablica[7]++;}
                    if(test.charAt(j) == '8') {tablica[8]++;}
                    if(test.charAt(j) == '9') {tablica[9]++;}

                    for(int z = 0 ; z < 10 ; z++)
                    {

                        if(tablica[z] <= 1)
                        {
                            wynik = i;
                            System.out.println("Wwatosc tablica [" + z + "] = " + tablica[z]);
                        }
                    }
                    System.out.println("potencjalnie : " + wynik);
                }
                for(int j = 0; j < 10 ; j++)
                {
                    tablica[j] = 0;
                }
            }
            i++;
        }
    }
    public boolean IsPrime(int n)
    {
        int counter = 0;
        if(n < 2) {return false;}
        for(int i = 1 ; i <= n; i++)
        {
            if(n % i == 0 )
            {
                counter++;
            }
        }
        if (counter == 2) {return true;}
        else {return false;}
    }
}