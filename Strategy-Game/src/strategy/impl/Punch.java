package strategy.impl;

import strategy.Weapon;

public class Punch implements Weapon {

	private final int damage = 5;
	
	@Override
	public void attack() {
		System.out.printf("���ָ�(���ݷ� :%d)���� �����ϴ�.\n", damage);
	}

}
