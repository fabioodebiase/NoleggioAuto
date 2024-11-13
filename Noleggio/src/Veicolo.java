abstract class Veicolo implements Noleggiabile{
    private String targa;
    private String modello;
    private double costoGiornaliero;
    private boolean isDisponibile = true;


    public Veicolo(String targa, String modello, double costoGiornaliero){
        this.targa = targa;
        this.modello = modello;
        this.costoGiornaliero = costoGiornaliero;
    }

    public Veicolo(){
        String targa = "";
        String modello = "";
        costoGiornaliero = 0;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getCostoGiornaliero() {
        return costoGiornaliero;
    }

    public void setCostoGiornaliero(double costoGiornaliero) {
        this.costoGiornaliero = costoGiornaliero;
    }

    public boolean getIsDisponibile() {
        return isDisponibile;
    }

    public void setIsDisponibile(boolean isDisponibile) {
        this.isDisponibile = isDisponibile;
    }

    public boolean disponibile() {
        return getIsDisponibile();
    }

    abstract double calcoloCosto(int giorni);




}
