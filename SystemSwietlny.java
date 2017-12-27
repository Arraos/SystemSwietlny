package Paczka;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class SystemSwietlny {

    public static void main(String[] args) throws InterruptedException {

        // Tworzenie obiektow sygnalizator

        Sygnalizator sygnalizator1 = new Sygnalizator();
        Sygnalizator sygnalizator2 = new Sygnalizator();
        Sygnalizator sygnalizator3 = new Sygnalizator();
        Sygnalizator sygnalizator4 = new Sygnalizator();
        Sygnalizator sygnalizator5 = new Sygnalizator();

        // Pobranie aktualnej godziny

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String dateString = dateFormat.format(currentDate);
        System.out.println(dateString);

        // Tworzenie obiektu licznika

        Licznik Sekundomierz = new Licznik();

        // Tworzenie listy z obiektami gdzie "lista1" to sygnalizatory poziome, a "lista2" to sygnalizatory pionowe

        Sygnalizator[] lista1 = {sygnalizator1,sygnalizator2,sygnalizator5};
        Sygnalizator[] lista2 = {sygnalizator3,sygnalizator4};
        System.out.println("W danym momencie sygnalizatorow poziomych jest: " + lista1.length);
        System.out.println("W danym momencie sygnalizatorow pionowych jest: " + lista2.length);

                                     //Petla testowa
        //Deklaracja licznikow
        int o = 0;
        int i = 0;

        //Warunek while

            //Pętle for dla listy pierwszej

            for (Sygnalizator sekwencja: lista1) {
                sekwencja.wlaczZoltoCzerwone();
                System.out.println(sekwencja.swiatlo);
            }

            Thread.sleep(Sekundomierz.getCzasZoltoZielone()); // <-------- Uspienie watku symulujace czas oczekiwania

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

            Thread.sleep(Sekundomierz.getCzasZoltoZielone());

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
