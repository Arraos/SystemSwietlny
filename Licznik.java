package Paczka;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Licznik {
    int czasZielone = 20000;
    int czasZolte = 10000;
    int czasZoltoZielone = 5000;
    int czasCzerwone = 5000;

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
    public void setCzasZielone(int czasTeraz) {
        if (czasTeraz == 1) {       // Od 6:30 do 9:00 oraz od 15:00 do 18:00
            czasZielone = 40000;
        }
        else if(czasTeraz == 2){    // Od 9:00 do 15:00 oraz od 18:00 do 23:00
            czasZielone = 30000;
        }
        else if (czasTeraz == 3){   // Od 23:00 do 6:30
            czasZielone = 70000;
        }
    }
    public int czasTeraz()
    {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String dateString = dateFormat.format(currentDate);
        System.out.println(dateString);

        if (dateString<12)
    }
}
