<h1>Sistema di Autonoleggio</h1>

<p>Un'applicazione Java che gestisce un parco veicoli per un servizio di autonoleggio, con funzionalità per l'aggiunta, la visualizzazione e il noleggio dei veicoli, nonché la gestione della manutenzione e del calcolo dei profitti.</p>

<h2>Funzionalità Principali</h2>
<ul>
    <li><strong>Visualizzazione dei Veicoli</strong>: Mostra la lista di tutti i veicoli registrati, inclusi quelli disponibili e in manutenzione.</li>
    <li><strong>Aggiunta di Nuovi Veicoli</strong>: Consente di aggiungere nuovi veicoli al parco (auto, moto, furgoni e biciclette).</li>
    <li><strong>Noleggio di Veicoli</strong>: Permette di noleggiare un veicolo disponibile per un numero specifico di giorni, con calcolo automatico del costo.</li>
    <li><strong>Manutenzione Automatica</strong>: Dopo due noleggi, i veicoli vengono automaticamente messi in manutenzione e non sono disponibili per il noleggio.</li>
    <li><strong>Calcolo Profitti</strong>: Raccoglie e mostra i profitti totali derivanti dai noleggi.</li>
</ul>

<h2>Struttura del Progetto</h2>

<h3>Classi Principali</h3>
<ul>
    <li><strong>Main</strong>: Gestisce il flusso principale dell'applicazione e le interazioni utente attraverso un semplice menu.</li>
    <li><strong>ParcoVeicoli</strong>: Contiene la logica per aggiungere, visualizzare, noleggiare e gestire lo stato di manutenzione dei veicoli.</li>
    <li><strong>Veicolo</strong> (Classe Astratta): La classe base per tutti i tipi di veicoli con attributi come targa, modello, e costo giornaliero.</li>
    <li><strong>Auto, Moto, Furgone, Bicicletta</strong>: Classi concrete che estendono Veicolo e implementano la logica di costo di noleggio specifica per ogni tipo di veicolo.</li>
</ul>

<h3>Interfaccia Noleggiabile</h3>
<p>L'interfaccia <code>Noleggiabile</code> definisce il metodo <code>disponibile()</code> per controllare la disponibilità di un veicolo.</p>

<h2>Esempio di Utilizzo</h2>
<ol>
    <li><strong>Visualizzare i veicoli disponibili</strong>: Seleziona l'opzione 2 dal menu principale.</li>
    <li><strong>Aggiungere un veicolo</strong>: Seleziona l'opzione 3, scegli il tipo di veicolo e inserisci le informazioni richieste (targa, modello, costo giornaliero, ecc.).</li>
    <li><strong>Noleggiare un veicolo</strong>: Seleziona l'opzione 4, specifica la targa e il numero di giorni di noleggio.</li>
    <li><strong>Visualizzare i profitti</strong>: Seleziona l'opzione 6 per vedere i profitti accumulati dai noleggi.</li>
</ol>
