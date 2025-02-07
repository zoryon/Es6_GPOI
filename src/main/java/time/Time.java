package time;

public class Time {
    protected int secondi;
    protected int minuti;
    protected int ore;

    public Time(int minuti, int ore, int secondi) {
        this.minuti = minuti;
        this.ore = ore;
        this.secondi = secondi;
    }

    public Time(int secondi) {
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
