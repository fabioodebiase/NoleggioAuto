Sistema di Autonoleggio
Un'applicazione Java che gestisce un parco veicoli per un servizio di autonoleggio, con funzionalità per l'aggiunta, la visualizzazione e il noleggio dei veicoli, nonché la gestione della manutenzione e del calcolo dei profitti.

Funzionalità Principali
Visualizzazione dei Veicoli: Mostra la lista di tutti i veicoli registrati, inclusi quelli disponibili e in manutenzione.
Aggiunta di Nuovi Veicoli: Consente di aggiungere nuovi veicoli al parco (auto, moto, furgoni e biciclette).
Noleggio di Veicoli: Permette di noleggiare un veicolo disponibile per un numero specifico di giorni, con calcolo automatico del costo.
Manutenzione Automatica: Dopo due noleggi, i veicoli vengono automaticamente messi in manutenzione e non sono disponibili per il noleggio.
Calcolo Profitti: Raccoglie e mostra i profitti totali derivanti dai noleggi.
Struttura del Progetto
Classi Principali
Main: Gestisce il flusso principale dell'applicazione e le interazioni utente attraverso un semplice menu.
ParcoVeicoli: Contiene la logica per aggiungere, visualizzare, noleggiare e gestire lo stato di manutenzione dei veicoli.
Veicolo (Classe Astratta): La classe base per tutti i tipi di veicoli con attributi come targa, modello, e costo giornaliero.
Auto, Moto, Furgone, Bicicletta: Classi concrete che estendono Veicolo e implementano la logica di costo di noleggio specifica per ogni tipo di veicolo.
Interfaccia Noleggiabile
L'interfaccia Noleggiabile definisce il metodo disponibile() per controllare la disponibilità di un veicolo.

Esempio di Utilizzo
Visualizzare i veicoli disponibili: Opzione 2 dal menu principale.
Aggiungere un veicolo: Opzione 3, scegliere il tipo di veicolo e inserire le informazioni richieste (targa, modello, costo giornaliero, ecc.).
Noleggiare un veicolo: Opzione 4, specificare la targa e il numero di giorni di noleggio.
Visualizzare i profitti: Opzione 6 per vedere i profitti accumulati dai noleggi.
