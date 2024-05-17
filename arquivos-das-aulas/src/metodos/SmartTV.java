package metodos;
public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligar() {
        ligada = true;
        System.out.println("A televisão está ligada");
    }
    
    public void desligar() {
        ligada = false;
        System.out.println("A televisão está desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume atual é de " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("O volume atual é de " + volume);
    }
    
    public void aumentarCanal(){
        canal++;
        System.out.println("O canal atual é " + canal);
    }
    
    public void diminuirCanal(){
        canal--;
        System.out.println("O canal atual é " + canal);
    }
    
    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("O canal atual é " + canal);
    }
}
