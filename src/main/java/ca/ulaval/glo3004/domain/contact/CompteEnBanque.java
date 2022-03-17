package ca.ulaval.glo3004.domain.contact;

public class CompteEnBanque {
  private Integer solde = 100;
  private Object lock = new Object();

  public int getSolde() {
    if (this.solde < 0)
      System.out.println("Vous êtes à découvert !");

    return this.solde;
  }

  public void retraitArgent(int retrait) {
    synchronized (lock) {
      solde = solde - retrait;
    }
    System.out.println("Solde = " + solde);
  }
}
