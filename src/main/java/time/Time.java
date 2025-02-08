package time;
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
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     * 
     * <u>Vengono distribuite in automatico i secondi tra le ore, minuti e secondi.</u>
     * Esempio: se in input viene passato 100 allora ora 0, minuti 1 e secondi 40
     * @param secondi - secondi da assegnare al nuovo oggetto
     */
    public Time(int secondi) {
        this.secondi = secondi;
    }

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
     * Vengono addizionati il numero di secondi specificati.
     * 
     * Il tempo viene normalizzato in automatico.
     * @param secondi numero di secondi da aggiungere
     */
    public void addSecondi(int secondi) {
        while (this.secondi >= 60) {
            this.secondi -= 60;
            this.minuti++;
        }

        while (this.minuti >= 60) {
            this.minuti -= 60;
            this.ore++;
        }
    }

    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi.
     * 
     * Esempio. 1 ora, 20 min, 10 secondi -> 4810s
     * @return il numero totale dei secondi
     */
    public int convertiSecondi() {
        return (ore * 3600) + (minuti * 60) + secondi;
    }

    /**
     * Restituisce il numero di secondi
     * @return il numero di secondi dell'oggetto Time
     */
    public int getSecondi() {
        return secondi;
    }

    /**
     * @deprecated
     * @param secondi
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }
    
    /**
     * Restituisce il numero di minuti
     * @return il numero di minuti dell'oggetto Time
     */
    public int getMinuti() {
        return minuti;
    }

    /**
     * @deprecated
     * @param minuti 
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /**
     * Restituisce il numero delle ore
     * @return il numero di ore dell'oggetto Time
     */
    public int getOre() {
        return ore;
    }

    /**
     * @deprecated
     * @param ore
     */
    public void setOre(int ore) {
        this.ore = ore;
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Time {ore:minuti:secondi}
     */
    @Override
    public String toString() {
        return ore + ":" + minuti + ":" + secondi;
    }
}
