import java.text.SimpleDateFormat;
import java.util.Date;

public class Licznik {
    int czasZielone = 20000;
    int czasZolte = 8000;
    int czasZoltoZielone = 5000;
    int czasCzerwone = 5000;
//Metody pobierające aktualny czas pojedyńczego światła

    public int getCzasZielone(){
    return czasZielone;
}
    public int getCzasZolte(){
        return czasZolte;
    }
    public int getCzasZoltoZielone(){
        return czasZoltoZielone;
    }
    public int getCzasCzerwone()
    {
        return czasCzerwone;
    }

//Metoda pobierająca aktualną godzinę i zamiana jej ze stringa na int

    public int czasTeraz()
    {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH");
        String dateString = dateFormat.format(currentDate);
        System.out.println(dateString);
        int czasTeraz=Integer.parseInt(dateString);
        return czasTeraz;
           }
//Metoda pobierająca godzinę w formie integer'a, sprawdzenie oraz dopasowanie do odpowiedniego warunku
    public void setCzasSygnalizatora(int czasTeraz) {
        if ((czasTeraz >= 7 && czasTeraz <= 9) || (czasTeraz >= 15 && czasTeraz <= 18)) { // Od 7:00 do 9:00 oraz od 15:00 do 18:00
            czasZielone = 40000;
            czasZolte = 10000;
            czasCzerwone = 8000;
            System.out.println("Tryb pierwszy");
        }else if ((czasTeraz >9 && czasTeraz < 15) || (czasTeraz > 18 && czasTeraz < 23)) { //Od 9 do 15 oraz od 18 do 23
            czasZielone = 20000;
            czasZolte = 8000;
            czasCzerwone = 5000;
            System.out.println("Tryb drugi");
        }else if (czasTeraz >=0 && czasTeraz <7 ){ // W godzinach nocnych 23-7
            czasZielone = 80000;
            czasZolte = 6000;
            czasCzerwone = 5000;
            System.out.println("Tryb trzeci");
        }
    }

}

