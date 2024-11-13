import java.util.ArrayList;

public class ParcoVeicoli {
    private double profittoTot;
    private ArrayList<Veicolo> listaVeicoli;
    private ArrayList<Veicolo> listaNoleggi;
    private ArrayList<Veicolo> listaManutenzioni;
    private ArrayList<Veicolo> storicoNoleggi;
    int countNoleggi;
    public ParcoVeicoli(){
        super();
        listaVeicoli = new ArrayList<>();
        listaNoleggi = new ArrayList<>();
        listaManutenzioni = new ArrayList<>();
        storicoNoleggi = new ArrayList<>();
        profittoTot = 0;
    }


    public ArrayList<Veicolo> getListaVeicoli() {
        return listaVeicoli;
    }

    public void setListaVeicoli(ArrayList<Veicolo> listaVeicoli) {
        this.listaVeicoli = listaVeicoli;
    }

    public ArrayList<Veicolo> getListaNoleggi() {
        return listaNoleggi;
    }

    public void setListaNoleggi(ArrayList<Veicolo> listaNoleggi) {
        this.listaNoleggi = listaNoleggi;
    }

    public ArrayList<Veicolo> getListaManutenzioni() {
        return listaManutenzioni;
    }

    public void setListaManutenzioni(ArrayList<Veicolo> listaManutenzioni) {
        this.listaManutenzioni = listaManutenzioni;
    }

    public ArrayList<Veicolo> getStoricoNoleggi() {
        return storicoNoleggi;
    }

    public void setStoricoNoleggi(ArrayList<Veicolo> storicoNoleggi) {
        this.storicoNoleggi = storicoNoleggi;
    }

    public double getProfittoTot() {
        return profittoTot;
    }

    public void setProfittoTot(double profittoTot) {
        this.profittoTot = profittoTot;
    }

    public void noleggiaVeicolo(String targa, int giorni){
        for (Veicolo v : listaVeicoli){
            if (v.getTarga().equals(targa) && v.disponibile()){
                 {
                     invioManutenzione(v);
                     if (invioManutenzione(v)){
                         System.out.println("Veicolo in manutenzione, non noleggiabile!");
                     } else {
                         v.setIsDisponibile(false);
                         listaNoleggi.add(v);
                         storicoNoleggi.add(v);
                         System.out.println("Tipo di Veicolo: " + v.getClass().getSimpleName() + "\n" +
                                 "Costo totale noleggio:" + " " + v.calcoloCosto(giorni) + "\n" +
                                 "Veicolo:" + v.getTarga() + " " + "Noleggiato!");
                         setProfittoTot(v.calcoloCosto(giorni));
                     }

                }
            }
        }
    }

    public void rimuoviNoleggio(String targa){
        for (Veicolo v : listaVeicoli){
            if (v.getTarga().equals(targa)){
                listaNoleggi.remove(v);
                v.setIsDisponibile(true);
                System.out.println("Veicolo rimosso dalla lista dei noleggi");
            }
        }
    }

    public boolean invioManutenzione(Veicolo veicolo){
        for (int i = 0; i < storicoNoleggi.size() ; i++) {
            if (veicolo.getTarga().equals(storicoNoleggi.get(i).getTarga())){
                countNoleggi += 1;
            }
        }
        if (countNoleggi >= 2){
            listaManutenzioni.add(veicolo);
            return true;
        } else {
            return false;
        }
    }

    public void aggiungiVeicolo(Veicolo veicolo) {
        listaVeicoli.add(veicolo);
    }

    public void visualizzaVeicoliDisponibili(){
        for (Veicolo v : listaVeicoli){
            if (v.getIsDisponibile()){
                System.out.println("Tipo di Veicolo: " + v.getClass().getSimpleName() + "\n" +
                "Targa: " + v.getTarga() + ", Modello: " + v.getModello() + "\n" +
                "Costo giornaliero" + v.getCostoGiornaliero());
                System.out.println("------------------------------");
            }
        }
    }

    public void visualizzaVeicoliNoleggiati(){
        for (Veicolo v : listaVeicoli){
            if (!v.getIsDisponibile()){
                System.out.println("Tipo di Veicolo: " + v.getClass().getSimpleName() + "\n" +
                        "Targa: " + v.getTarga() + ", Modello: " + v.getModello() + "\n" +
                        "Costo giornaliero" + v.getCostoGiornaliero());
                System.out.println("------------------------------");
            }
        }
    }

    public void visualizzaListaVeicoli() {
        for (Veicolo v : listaVeicoli) {
            System.out.println("Tipo di Veicolo: " + v.getClass().getSimpleName() + "\n" + // Stampa il tipo di veicolo
                    "Modello: " + v.getModello() + "\n" +
                    "Targa: " + v.getTarga() + "\n" +
                    "Costo giornaliero: " + v.getCostoGiornaliero() + "\n");
            System.out.println("------------------------------");
        }
    }

    public void visualizzaListaVeicoliManutenzione() {
        for (Veicolo v : listaManutenzioni) {
            System.out.println("Tipo di Veicolo: " + v.getClass().getSimpleName() + "\n" + // Stampa il tipo di veicolo
                    "Modello: " + v.getModello() + "\n" +
                    "Targa: " + v.getTarga() + "\n");
            System.out.println("------------------------------");
        }
    }


}
