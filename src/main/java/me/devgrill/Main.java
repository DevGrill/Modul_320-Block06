package me.devgrill;

public class Main {
    public static void main(String[] args) {
        Kegelstumpf f1 = new Kegelstumpf(12, 5.3, 7.5);
        System.out.println("Oberflaeche= {0,10:N2}", f1.getOberflaeche());
        System.out.println("Mantelflaeche= {0,8:N2}", f1.getMatelflaeche());
        System.out.println("Mantellinie= {0,10:N2}", f1.getMantellinie());
        System.out.println("Volumen= {0,14:N2}" , f1.getVolumen());
        System.out.println("\n");
        Kegelstumpf f2 = new Kegelstumpf(new Kreis(12), new Kreis(5.3), 7.5);
        System.out.println("Oberflaeche= {0,10:N2}" , f2.getOberflaeche());
        System.out.println("Mantelflaeche= {0,8:N2}", f2.getMatelflaeche());
        System.out.println("Mantellinie= {0,10:N2}", f2.getMantellinie());
        System.out.println("Volumen= {0,14:N2}" , f2.getVolumen());
    }
}