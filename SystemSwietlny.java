package Paczka;

public class SystemSwietlny {

    public static void main(String[] args) throws InterruptedException {
        Sygnalizator sygnalizator1 = new Sygnalizator();
        Sygnalizator sygnalizator2 = new Sygnalizator();
        Sygnalizator sygnalizator3 = new Sygnalizator();
        Sygnalizator sygnalizator4 = new Sygnalizator();
        sygnalizator1.id = 1;
        sygnalizator2.id = 2;
        sygnalizator3.id = 3;
        sygnalizator4.id = 4;
        sygnalizator1.grupa = 1;
        sygnalizator2.grupa = 1;
        sygnalizator3.grupa = 2;
        sygnalizator4.grupa = 2;
        sygnalizator1.czasSwiecenia = 10000;
        sygnalizator2.czasSwiecenia = 10000;
        sygnalizator3.czasSwiecenia = 7000;
        sygnalizator4.czasSwiecenia = 7000;


        sygnalizator1.wlaczZielone();
        if (sygnalizator1.wywolajNastepnySygnalizator() == Sygnalizator.class.getModifiers());
            ;
        int grupa=sygnalizator1.zwrocGrupe();
        System.out.println(grupa);
        sygnalizator1.pobierzGrupe(grupa);


        System.out.println("Zmiana swiatla dobiegla konca");
    }
}
