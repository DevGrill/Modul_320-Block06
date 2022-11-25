package me.devgrill;

public class Kreis {
    private double m_Durchmesser;

    public Kreis(double m_Durchmesser){
        this.m_Durchmesser = m_Durchmesser;
    }

    public Kreis(){

    }

    public double getDurchmesser(){
        return this.m_Durchmesser;
    }

    public double getFlaeche(){
        double m_Flaeche = this.m_Durchmesser * Math.pow(getRadius(), 2) * Math.PI;
        return m_Flaeche;
    }

    public double getRadius(){
        return (this.m_Durchmesser / 2);
    }

    public void setDurchmesser(double m_Durchmesser){
        this.m_Durchmesser = m_Durchmesser;
    }

    public void setRadius(double m_Radius){
        this.m_Durchmesser = (m_Radius * 2);
    }
}
