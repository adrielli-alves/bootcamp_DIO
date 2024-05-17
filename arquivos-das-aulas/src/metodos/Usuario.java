public class Usuario {
    public static void main(String[] args) {
        
        SmartTV SmartTV = new SmartTV();

        System.out.println("Tv ligada: " + SmartTV.ligada);
        System.out.println("Canal atual: " + SmartTV.canal);
        System.out.println("Volume atual: " + SmartTV.volume);
        
        SmartTV.diminuirVolume();
        SmartTV.diminuirVolume();
        SmartTV.diminuirVolume();
        SmartTV.diminuirVolume();
        SmartTV.aumentarVolume();

        SmartTV.aumentarCanal();
        SmartTV.aumentarCanal();
        SmartTV.aumentarCanal();
        SmartTV.diminuirCanal();
            
        SmartTV.desligar();

        SmartTV.ligar();

        SmartTV.mudarCanal(15);
    }
}
