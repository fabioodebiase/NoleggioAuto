public class Bicicletta extends Veicolo implements Noleggiabile{
    public Bicicletta(String targa, String modello, double costoGiornaliero){
        super(targa,modello,costoGiornaliero);
    }

    public boolean disponibile() {
        return true;
    }

    public double calcoloCosto(int giorni) {
        return  (getCostoGiornaliero() - ((getCostoGiornaliero() * 50)/ 100)) * giorni;
    }
}
