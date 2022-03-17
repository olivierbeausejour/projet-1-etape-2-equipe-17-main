package ca.ulaval.glo3004;

import ca.ulaval.glo3004.domain.contact.CarteDeBanqueConjoints;
import ca.ulaval.glo3004.domain.contact.CompteEnBanque;

/**
 * Project setup without using DI or spring   
 */
@SuppressWarnings("all")
public class EvBatteriesMain {
  public static boolean isDev = true; // Would be a JVM argument or in a .property file

  public static void main(String[] args) throws Exception {

    // Starting your program here!
    CompteEnBanque compteEnBanque = new CompteEnBanque();

    CarteDeBanqueConjoints carteDuMari = new CarteDeBanqueConjoints(10, compteEnBanque);
    CarteDeBanqueConjoints carteEpouse = new CarteDeBanqueConjoints(10, compteEnBanque);

    carteDuMari.start();
    carteEpouse.start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Solde en banque: " + compteEnBanque.getSolde());
  }

}
