public class SmartTv {
    //Sistema Smart Tv
    
    boolean ligada= false;
    int canal=1;
    int volume= 25;

    public void ligar(){
        ligada= true;
    }
    public void desligar(){
        ligada= false;
    }

    public void aumentarVolume(){
        System.out.println("Aumentando Volume para " + volume);
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("Diminuindo Volume para " + volume);
        volume--;
    }

    public void mudaCanal(int novoCanal){
        canal=novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
