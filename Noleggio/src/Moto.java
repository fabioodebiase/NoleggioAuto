public class Moto extends Veicolo implements Noleggiabile{
    public Moto(String targa, String modello, double costoGiornaliero){
        super(targa,modello,costoGiornaliero);
    }

    public double calcoloCosto(int giorni) {
        return getCostoGiornaliero() * giorni;
    }

    public boolean disponibile() {
        return true;
    }

}
