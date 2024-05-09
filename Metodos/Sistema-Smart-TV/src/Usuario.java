public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        
        System.out.println("Canal Atual da  TV! :" + smartTv.canal);
        smartTv.mudarCanal(22);
        
        System.out.println("TV Ligada? :" + smartTv.ligada);
        System.out.println("Canal Atual da  TV! :" + smartTv.canal);
        System.out.println("Volume Atual! :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada? : Novo Status  : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada? : Novo Status  : " + smartTv.ligada);
    }
}
