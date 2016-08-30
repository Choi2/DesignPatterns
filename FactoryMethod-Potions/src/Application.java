import creator.PotionCreator;
import creator.concrete.HPPotionCreator;
import creator.concrete.MPPotionCreator;
import product.Potion;

public class Application {

	public static void main(String[] args) {
		
		PotionCreator potionCreator = new HPPotionCreator("ȸ�� ����");
		Potion hpPotion = potionCreator.create();
		hpPotion.use();
		
		potionCreator = new MPPotionCreator("ȸ�� ����");
		Potion mpPotion = potionCreator.create();
		mpPotion.use();
		
	}
	
}
