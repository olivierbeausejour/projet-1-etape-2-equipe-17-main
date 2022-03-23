package ca.ulaval.glo3004;

import ca.ulaval.glo3004.domain.base.Cellule;
import ca.ulaval.glo3004.domain.base.ChaineMontage;

public class Main {
	public static void main(String[] args) {
		
		ChaineMontage petiteChaineMontage = new ChaineMontage();

		Object mutexLaser = new Object();
		Object mutexMiseEnModule = new Object();

		Cellule petiteCellule1 = new Cellule("petite", "1", mutexLaser, mutexMiseEnModule);
		Cellule petiteCellule2 = new Cellule("petite", "2", mutexLaser, mutexMiseEnModule);

		petiteCellule1.start();
		petiteCellule2.start();

		try {
			petiteCellule1.join();
			petiteCellule2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
