package creator.concrete;

import java.util.Date;

import creator.PotionCreator;
import product.Potion;
import product.concrete.HPPotion;

public class HPPotionCreator extends PotionCreator {

	private String potionName;
	
	public HPPotionCreator(String potionName) {
		this.potionName = potionName;
	}

	@Override
	protected void getPotionDataFromDB() {
		System.out.println("DB ���� HP Potion ������ �����´�.");
	}

	@Override
	protected void printPotionData() {
		System.out.println( potionName + " ���� " + new Date() );
	}
	
	@Override
	protected Potion createPotion() {
		return new HPPotion();
	}

}
