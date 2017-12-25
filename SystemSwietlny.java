package Paczka;

import java.util.ArrayList;

public class SystemSwietlny {

    public static void main(String[] args) throws InterruptedException {
        Sygnalizator sygnalizator1 = new Sygnalizator();
        Sygnalizator sygnalizator2 = new Sygnalizator();
        Sygnalizator sygnalizator3 = new Sygnalizator();
        Sygnalizator sygnalizator4 = new Sygnalizator();
        sygnalizator1.czasSwiecenia = 10000;
        sygnalizator2.czasSwiecenia = 10000;
        sygnalizator3.czasSwiecenia = 7000;
        sygnalizator4.czasSwiecenia = 7000;
        ArrayList<Object> Grupa1 = new ArrayList<>();
        Grupa1.add(sygnalizator1);
        Grupa1.add(sygnalizator2);
        ArrayList<Object> Grupa2 = new ArrayList<>();
        Grupa2.add(sygnalizator3);
        Grupa2.add(sygnalizator4);
        int i = 0;
        for(i = 0; i < Grupa1.size(); i++)
        {
            System.out.println(Grupa1.get(i));
            Grupa1.indexOf(i)();
        }
        System.out.println();
        sygnalizator1.wlaczZielone();
        System.out.println("zakonczone");





       // sygnalizator1.wlaczZielone();
        //if (sygnalizator1.wywolajNastepnySygnalizator() == Sygnalizator.class.getModifiers());
        //;
        //int grupa=sygnalizator1.zwrocGrupe();
        //System.out.println(grupa);
        //sygnalizator1.pobierzGrupe(grupa);


        //System.out.println("Zmiana swiatla dobiegla konca");
    }
}
