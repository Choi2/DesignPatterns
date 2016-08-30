package strategy.impl;

import strategy.Weapon;

public class Sword implements Weapon {

	private final int damage = 80;
	
	@Override
	public void attack() {
		System.out.printf("Į(���ݷ� :%d)�� �ֵθ��ϴ�.\n", damage);
	}

}
