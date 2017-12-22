package Paczka;

public class Sygnalizator {
    int id;
    Status swiatloZielone = Status.wylaczone;
    Status swiatloZolte = Status.wylaczone;
    Status swiatloCzerwone = Status.wylaczone;
    int grupa;
    int czasSwiecenia;


    public int getGrupa() {        //Sprawdzenie numeru grupy
        return grupa;
    }
    public int getId(){
        return id;
    }
    public int getCzasSwiecenia(){
        return czasSwiecenia;
    }
    //Rozpoczęcie bloku metod zmiany kazdego pojedynczego swiatla.


    public void wlaczZielone(){
        getGrupa();
        int numerGrupy = getGrupa();
        System.out.println("Numer grupy "+numerGrupy);
        swiatloZielone = Status.wlaczone;
    }
    public void wylaczZielone(){
        getGrupa();
        int numerGrupy = getGrupa();
        System.out.println(numerGrupy);
        swiatloZielone = Status.wylaczone;
    }
    public void wlaczZolte(){
        getGrupa();
        int numerGrupy = getGrupa();
        System.out.println(numerGrupy);
        swiatloZolte = Status.wylaczone;
    }
    public void wylaczZolte(){
        getGrupa();
        int numerGrupy = getGrupa();
        System.out.println(numerGrupy);
        swiatloZolte = Status.wylaczone;
    }
    public void wlaczCzerwone(){
        getGrupa();
        int numerGrupy = getGrupa();
        System.out.println(numerGrupy);
        swiatloCzerwone = Status.wlaczone;
    }
    public void wylaczCzerwone(){
        getGrupa();
        int numerGrupy = getGrupa();
        System.out.println(numerGrupy);
        swiatloCzerwone = Status.wylaczone;
    }

    //Koniec bloku metod zmiany każdego pojedynczego swiatla.

//Operacja przekazania informacji do klasy Sygnalizator
    int zwrocGrupe(){
        return grupa;
    }
    boolean pobierzGrupe(int grupa){
        if(grupa == zwrocGrupe()){
            System.out.println("Prawda");
            return true;
        }
        else{return false;}
    }

    public int wywolajNastepnySygnalizator(){
       int NumerNastepnegoSygnalizatora = Sygnalizator.this.id+1;
        return NumerNastepnegoSygnalizatora;
    }
    public int wywolajKolejnaGrupe(){
       int NumerGrupy = Sygnalizator.this.grupa+1;
        System.out.println(Sygnalizator.this.grupa);
        return NumerGrupy;
    }


}

