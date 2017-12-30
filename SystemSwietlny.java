import java.util.Scanner;

public class SystemSwietlny {

    public static void main(String[] args) throws InterruptedException {

        // Tworzenie obiektow sygnalizator

        Sygnalizator sygnalizator1 = new Sygnalizator();
        Sygnalizator sygnalizator2 = new Sygnalizator();
        Sygnalizator sygnalizator3 = new Sygnalizator();
        Sygnalizator sygnalizator4 = new Sygnalizator();
        Sygnalizator sygnalizator5 = new Sygnalizator();

        // Tworzenie obiektu licznika

        Licznik Sekundomierz = new Licznik();

        // Tworzenie obiektu uzytkownika

        Uzytkownik uzytkownik = new Uzytkownik(); // Jeszcze nie wykorzystany

        // Pobranie aktualnej godziny i ustawienie czasu trwania sygnalizatora

        System.out.print("Jest aktualnie godzina ");
        Sekundomierz.setCzasSygnalizatora(Sekundomierz.czasTeraz());

        // Tworzenie listy z obiektami gdzie "lista1" to sygnalizatory poziome, a "lista2" to sygnalizatory pionowe

        Sygnalizator[] lista1 = {sygnalizator1,sygnalizator2,sygnalizator5};
        Sygnalizator[] lista2 = {sygnalizator3,sygnalizator4};
        System.out.println("W danym momencie sygnalizatorow poziomych jest: " + lista1.length);
        System.out.println("W danym momencie sygnalizatorow pionowych jest: " + lista2.length);

        //Wczytanie przycisku na klawiaturze

        String polecenie;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Wcisnij (y) aby uruchomic albo inny dowolny aby zakonczyc");
        polecenie = odczyt.nextLine();

        //Sprawdzenie warunku i informacja o rozpoczeciu lub zamknieciu programu

        boolean uruchom = false;
        if(polecenie.equals("y") || polecenie.equals("Y")) {
            System.out.println("Uruchamiam sekwencje");
            uruchom = true;
        }else {System.out.println("Koncze program");}

        //Petla while sprawdzajaca warunek rozpoczecia

        while(uruchom){

            //Pętle for dla listy pierwszej

            for (Sygnalizator sekwencja: lista1) {
                sekwencja.wlaczZoltoCzerwone();
                System.out.println(sekwencja.swiatlo);
            }

            Thread.sleep(Sekundomierz.getCzasZoltoCzerwone()); // <-------- Uspienie watku symulujace czas oczekiwania

            for(Sygnalizator sekwencja : lista1) {
                 sekwencja.wlaczZielone();
                 System.out.println(sekwencja.swiatlo);
             }
             Thread.sleep(Sekundomierz.getCzasZielone());

             for (Sygnalizator sekwencja: lista1)
             {
                 sekwencja.wlaczZolte();
                 System.out.println(sekwencja.swiatlo);
            }

             Thread.sleep(Sekundomierz.getCzasZolte());

            for (Sygnalizator sekwencja: lista1) {
                sekwencja.wlaczCzerwone();
                System.out.println(sekwencja.swiatlo);
            }

            Thread.sleep(Sekundomierz.getCzasCzerwone());

            //Pętle for dla listy drugiej

            for (Sygnalizator sekwencja: lista2)
            {
                sekwencja.wlaczZoltoCzerwone();
                System.out.println(sekwencja.swiatlo);
            }

            Thread.sleep(Sekundomierz.getCzasZoltoCzerwone());

            for (Sygnalizator sekwencja: lista2)
            {
                sekwencja.wlaczZielone();
                System.out.println(sekwencja.swiatlo);
            }

            Thread.sleep(Sekundomierz.getCzasZielone());

            for (Sygnalizator sekwencja: lista2) {
                sekwencja.wlaczZolte();
                System.out.println(sekwencja.swiatlo);
            }

            Thread.sleep(Sekundomierz.getCzasZolte());

            for (Sygnalizator sekwencja: lista2) {
                sekwencja.wlaczCzerwone();
                System.out.println(sekwencja.swiatlo);
            }

            Thread.sleep(Sekundomierz.getCzasCzerwone());

        System.out.println("GIT");
        }
    }
}
