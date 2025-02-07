package com.example;
/**
 * La classe rappresenta e gestisce dati di tipo temporale
 * @since JDK1.0
 */
public class Time {
    /**
     * numero di secondi dell'oggetto Time
     */
    protected int secondi;
    /**
     * numero di minuti dell'oggetto Time
     */
    protected int minuti;
    /**
     * numero di ore dell'oggetto Time
     */
    protected int ore;

    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     * 
     * <u>Se i parametri di ingresso non sono validi (es. minuti 78) allora l'oggetto Time verrÃ  inizializzato con tutti ore, minuti e secondi impostati a 0</u>
     * @param ore - ore da assegnare al nuovo oggetto
     * @param minuti - minuti da assegnare al nuovo oggetto
     * @param secondi - secondi da assegnare al nuovo oggetto
     */
    public Time(int minuti, int ore, int secondi) {
        this.minuti = minuti;
        this.ore = ore;
        this.secondi = secondi;
    }
    
    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     */
    public Time(int secondi) {
        this.secondi = secondi;
    }


}
