package creator.concrete;

import java.util.Date;

import creator.PotionCreator;
import product.Potion;
import product.concrete.MPPotion;

public class MPPotionCreator extends PotionCreator {

	private String potionName;
	
	public MPPotionCreator(String potionName) {
		this.potionName = potionName;
	}
	
	@Override
	protected void getPotionDataFromDB() {
		System.out.println("DB ���� MP Potion ������ �����´�.");
	}

	@Override
	protected void printPotionData() {
		System.out.println(potionName + " ���� " + new Date() );
	}
	
	@Override
	protected Potion createPotion() {
		return new MPPotion();
	}

}
