public class Furgone extends Veicolo implements Noleggiabile{

    public Furgone(String targa, String modello, double costoGiornaliero, int capacitaCarico){
        super(targa,modello,costoGiornaliero);
        this.capacitaCarico = capacitaCarico;
    }

    private int capacitaCarico;

    public int getCapacitaCarico() {
        return capacitaCarico;
    }

    public void setCapacitaCarico(int capacitaCarico) {
        this.capacitaCarico = capacitaCarico;
    }

    public boolean disponibile() {
        return true;
    }


    public double calcoloCosto(int giorni) {
        if (getCapacitaCarico() > 1000){
            return  (((getCostoGiornaliero() * 15)/ 100) + getCostoGiornaliero()) * giorni;
        } else {
            return getCostoGiornaliero() * giorni;
        }
    }
}
