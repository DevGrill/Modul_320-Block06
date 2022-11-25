package me.devgrill;

public class Kegelstumpf {
    private Kreis m_Deckkreis = null;
    private Kreis m_Grundkreis = null;
    private double m_Hoehe;
    public Kegelstumpf(Kreis m_Deckkreis, Kreis m_Grundkreis, double m_Hoehe){
        this.m_Deckkreis = m_Deckkreis;
        this.m_Grundkreis = m_Grundkreis;
        this.m_Hoehe = m_Hoehe;
    }

    public Kegelstumpf(double m_Deckkreis, double m_Grundkreis, double m_Hoehe){
        this.m_Deckkreis = new Kreis(m_Deckkreis);
        this.m_Grundkreis = new Kreis(m_Grundkreis);
        this.m_Hoehe = m_Hoehe;
    }

    public double getMantellinie(){

    }

    public double getMantelflaeche(){

    }

    public double getOberflaeche(){

    }

    public double getVolumen(){

    }

    public void setHoehe(double m_Hoehe){
        this.m_Hoehe = m_Hoehe;
    }
}
