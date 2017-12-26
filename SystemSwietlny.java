package Paczka;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class SystemSwietlny {

    public static void main(String[] args) throws InterruptedException {
        // Tworzenie obiektow sygnalizator
        Sygnalizator sygnalizator1 = new Sygnalizator();
        Sygnalizator sygnalizator2 = new Sygnalizator();
        Sygnalizator sygnalizator3 = new Sygnalizator();
        Sygnalizator sygnalizator4 = new Sygnalizator();
        //Deklaracja wartosci konstruktorow
        sygnalizator1.czasSwiecenia = 10000;
        sygnalizator2.czasSwiecenia = 10000;
        sygnalizator3.czasSwiecenia = 7000;
        sygnalizator4.czasSwiecenia = 7000;
        System.out.println(sygnalizator1.swiatlo);
        System.out.println(sygnalizator2.swiatlo);
        // Tworzenie listy z obiektami gdzie "lista1" to sygnalizatory poziome, a "lista2" to sygnalizatory pionowe
        Sygnalizator[] lista1 = {sygnalizator1,sygnalizator2};
        Sygnalizator[] lista2 = {sygnalizator3,sygnalizator4};
        System.out.println(lista1.length);
                                     //Petla testowa
        //Deklaracja licznikow
        int o = 0;
        int i = 0;
        //Warunek if z petla for
            for (;i < lista1.length; i++)
                {
                lista1[i].wlaczZielone();
                //Sprawdzenie poprawnosci
                System.out.println(sygnalizator1.swiatlo);
                System.out.println(sygnalizator2.swiatlo);
                o++;
                }
            int czas = lista1[i-1].getCzasSwiecenia();
            Thread.sleep(czas);
            System.out.println("Nastapila zmiana swiatla");
        System.out.println("GIT");

    }
}
