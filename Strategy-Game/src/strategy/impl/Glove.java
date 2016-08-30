package strategy.impl;

import strategy.Weapon;

public class Glove implements Weapon {

	private final int damage = 10;
	
	@Override
	public void attack() {
		System.out.printf("�۷���(���ݷ� :%d)�� �����ϴ�.\n", damage);
	}

}
