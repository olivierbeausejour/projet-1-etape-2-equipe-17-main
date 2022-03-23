package ca.ulaval.glo3004.domain.base;

public class Cellule extends Thread {

    private String grandeur;
    private String ordre;    
    private Object mutexLaser;
    private Object mutexMiseEnModule;

    public Cellule(String grandeur, String ordre, Object mutexLaser, Object mutexMiseEnModule) {
        this.grandeur = grandeur;
        this.ordre = ordre;
        this.mutexLaser = mutexLaser;
        this.mutexMiseEnModule = mutexMiseEnModule;
    }

    public void run() {
        while (true) {
            System.out.println(grandeur + "." + ordre + "." + "requeteLaser");

            synchronized (mutexLaser) {
                System.out.println(grandeur + "." + ordre + "." + "ouvreLaser");
                System.out.println(grandeur + "." + ordre + "." + "sceller");
                System.out.println(grandeur + "." + ordre + "." + "fermerLaser");
            }

            System.out.println(grandeur + "." + ordre + "." + "deposeCellule");
            System.out.println(grandeur + "." + ordre + "." + "requeteMiseEnModule");

            synchronized (mutexMiseEnModule) {
                System.out.println(grandeur + "." + ordre + "." + "orienteCellule");
                System.out.println(grandeur + "." + ordre + "." + "connecteAuModule");
                System.out.println(grandeur + "." + ordre + "." + "deposeDansModule");
            }
        }
    }
}
