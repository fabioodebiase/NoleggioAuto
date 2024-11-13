import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static ParcoVeicoli parcoVeicoli = new ParcoVeicoli();
    public static void main(String[] args) {
        int scelta, numGiorni, capacitaCarico;
        String targa, modello;
        double costoGiornaliero, profitto = 0;
        boolean continua = true, cambioAutomatico = true;
        System.out.println("Benvenuto!");
            do {
                do {
                    //Menu per la visualizzazione delle scelte
                System.out.println("1:Visualizza Veicoli | 2:Visualizza Veicoli disponibili | 3: Aggiungi Veicolo | 4:Noleggia veicolo | 5:Rimuovi noleggio | 6:Visualizza i profitti dell'autonoleggio");
                scelta = s.nextInt();
                switch (scelta){
                    case 1:
                        System.out.println("Visualizza veicoli");
                        parcoVeicoli.visualizzaListaVeicoli();
                        break;
                    case 2:
                        System.out.println("Visualizza veicoli disponibili");
                        parcoVeicoli.visualizzaVeicoliDisponibili();
                        break;
                    case 3:
                        System.out.println("Aggiungi veicolo");
                        System.out.println("1:Auto | 2:Moto | 3:Furgone | 4:Bicicletta");
                        scelta = s.nextInt();
                        switch (scelta){  //Per ogni scelta di veicolo si va a creare un oggetto diverso (Auto, Moto, Furgone, Bicicletta)
                            case 1:
                                s.nextLine();
                                System.out.println("Inserisci la targa");
                                targa = s.nextLine();
                                System.out.println("Inserisci il modello");
                                modello = s.nextLine();
                                System.out.println("Inserisci il costo giornaliero");
                                costoGiornaliero = s.nextDouble();
                                System.out.println("1:Cambio automatico | 0:Cambio manuale"); //Se il cliente volesse noleggiare una macchina a cambio automatico
                                                                                              //Il costo del noleggio sarà maggiore del 10%
                                scelta = s.nextInt();
                                if (scelta == 1){
                                    cambioAutomatico = true;
                                } else {
                                    cambioAutomatico = false;
                                }
                                Auto newAuto = new Auto(targa, modello, costoGiornaliero,cambioAutomatico); //Creazione del veicolo
                                parcoVeicoli.aggiungiVeicolo(newAuto); //Aggiunta del veicolo alla lista

                                break;
                            case 2:
                                s.nextLine();
                                System.out.println("Inserisci la targa");
                                targa = s.nextLine();
                                System.out.println("Inserisci il modello");
                                modello = s.nextLine();
                                System.out.println("Inserisci il costo giornaliero");
                                costoGiornaliero = s.nextDouble();

                                Moto newMoto = new Moto(targa, modello, costoGiornaliero); //Creazione dell'oggetto moto
                                parcoVeicoli.aggiungiVeicolo(newMoto);  //Aggiunta dell'oggetto alla lista
                                break;
                            case 3:
                                s.nextLine();
                                System.out.println("Inserisci la targa");
                                targa = s.nextLine();
                                System.out.println("Inserisci il modello");
                                modello = s.nextLine();
                                System.out.println("Inserisci il costo giornaliero");
                                costoGiornaliero = s.nextDouble();
                                System.out.println("Inserisci la capacità di carico");
                                capacitaCarico = s.nextInt();
                                Furgone newFurgone = new Furgone(targa, modello, costoGiornaliero,capacitaCarico); //Se il cliente volesse noleggiare un furgone con una capacità
                                                                                                                     //superiore a 1000kg, il costo del noleggio sarà maggiore del 15%
                                parcoVeicoli.aggiungiVeicolo(newFurgone); //Aggiunta del furgone alla lista
                                break;
                            case 4:
                                s.nextLine();
                                System.out.println("Inserisci la targa");
                                targa = s.nextLine();
                                System.out.println("Inserisci il modello");
                                modello = s.nextLine();
                                System.out.println("Inserisci il costo giornaliero");
                                costoGiornaliero = s.nextDouble();
                                Bicicletta newBicicletta = new Bicicletta(targa, modello, costoGiornaliero); //Aggiunta della bici alla lista
                                parcoVeicoli.aggiungiVeicolo(newBicicletta);
                                break;

                            default:
                                System.out.println("Inserisci una scelta valida");

                        }
                        break;

                    case 4:
                        System.out.println("Noleggia veicolo");
                        System.out.println("----------------------------");
                        System.out.println("Veicoli disponibili per il noleggio");
                        parcoVeicoli.visualizzaVeicoliDisponibili();
                        s.nextLine();
                                System.out.println("Inserisci il numero di targa del veicolo da noleggiare");
                                targa = s.nextLine();
                                System.out.println("Per quanti giorni vuoi noleggiare il veicolo?");
                                numGiorni = s.nextInt();
                                parcoVeicoli.noleggiaVeicolo(targa,numGiorni);
                                break;
                    case 5:
                        s.nextLine();
                        System.out.println("Rimuovi noleggio");
                        System.out.println("Lista veicoli noleggiati");
                        parcoVeicoli.visualizzaVeicoliNoleggiati();
                        System.out.println("Inserisci la targa del veicolo da rimuovere");
                        targa = s.nextLine();
                        parcoVeicoli.rimuoviNoleggio(targa);
                        break;

                    case 6:
                        profitto = parcoVeicoli.getProfittoTot() + profitto;
                        System.out.println("Profitto Totale:" + " " + profitto);
                        break;
                }


                System.out.println("Continuare? 1:Si | 2:No");
                scelta = s.nextInt();
                if (scelta == 2){
                    continua = false;
                } else if (scelta == 1){
                    continua = true;
                }
                }while(scelta != 1 && scelta != 2 && scelta != 3 );
            } while(continua);
    }
}