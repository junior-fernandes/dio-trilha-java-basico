public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Status atual da TV");
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Status atual da TV");
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Status atual da TV");
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("Status atual da TV");
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirCanal();

        System.out.println("Status atual da TV");
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.trocarCanal(5);

        System.out.println("Status atual da TV");
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.desligar();

        System.out.println("Status atual da TV");
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

    }

}
