package ca.ulaval.glo3004.domain.contact;

public class CarteDeBanqueConjoints extends Thread {

  private int nombreDeTransactions;

  private CompteEnBanque compte;

  public CarteDeBanqueConjoints(int nombreTransactions, CompteEnBanque compte) {
    this.nombreDeTransactions = nombreTransactions;
    this.compte = compte;
  }

  @Override
  public void run() {
    for (int i = 0; i < nombreDeTransactions; i++) {

      compte.retraitArgent(2);

      System.out.println(getName() + ": Retrait effectué");
    }
  }

}
