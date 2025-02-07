package com.example;

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

    
}
