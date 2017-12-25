package Paczka;

public class Sygnalizator {
    Status swiatlo = Status.czerwone;
    int czasSwiecenia;


    public int getCzasSwiecenia(){
        return czasSwiecenia;
    }
    //Rozpoczęcie bloku metod zmiany kazdego pojedynczego swiatla.


    public void wlaczZielone() throws InterruptedException {
        swiatlo = Status.zielone;
        int czas = getCzasSwiecenia();
        Thread.sleep(czas);
    }
    public void wlaczZolte() throws InterruptedException {
        swiatlo = Status.zolte;
        int czas = getCzasSwiecenia();
        Thread.sleep(czas);
    }
    public void wlaczCzerwone() throws InterruptedException {
        swiatlo = Status.czerwone;
        int czas = getCzasSwiecenia();
        Thread.sleep(czas);
    }
    public void wlaczZoltoCzerwone() throws InterruptedException {
        swiatlo = Status.zoltoczerwone;
        int czas = getCzasSwiecenia();
        Thread.sleep(czas);
    }


    //Koniec bloku metod zmiany każdego pojedynczego swiatla.



}
