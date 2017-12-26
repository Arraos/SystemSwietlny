package Paczka;

public class Sygnalizator {
    Status swiatlo = Status.czerwone;



    //Rozpoczęcie bloku metod zmiany kazdego pojedynczego swiatla.


    public void wlaczZielone(){
        swiatlo = Status.zielone;
    }
    public void wlaczZolte(){
        swiatlo = Status.zolte;
    }
    public void wlaczCzerwone(){
        swiatlo = Status.czerwone;
    }
    public void wlaczZoltoCzerwone(){
        swiatlo = Status.zoltoczerwone;
    }


    //Koniec bloku metod zmiany każdego pojedynczego swiatla.



}
