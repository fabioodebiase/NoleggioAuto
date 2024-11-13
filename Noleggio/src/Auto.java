public class Auto extends Veicolo implements Noleggiabile{

    public Auto(String targa, String modello, double costoGiornaliero, boolean automatica){
        super(targa,modello,costoGiornaliero);
        this.automatica = automatica;
    }
    private boolean automatica;

    public boolean isAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    public boolean disponibile() {
        return true;
    }

    public double calcoloCosto(int giorni){
        if (automatica){
            return (((getCostoGiornaliero() * 10)/ 100) + getCostoGiornaliero()) * giorni;
        } else {
            return getCostoGiornaliero() * giorni;
        }
    }
}
