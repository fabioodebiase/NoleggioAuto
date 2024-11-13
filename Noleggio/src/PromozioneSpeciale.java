public class PromozioneSpeciale{
    public static double calcolaSconto(Veicolo veicolo, int giorni){
        if (giorni > 7){
            return ((veicolo.calcoloCosto(giorni) - (veicolo.calcoloCosto(giorni) * 15) / 100));
        }else{
            return veicolo.calcoloCosto(giorni);
        }
    }

}
