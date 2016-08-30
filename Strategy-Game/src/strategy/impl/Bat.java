package strategy.impl;

import strategy.Weapon;

public class Bat implements Weapon {

	private final int damage = 30;
	
	@Override
	public void attack() {
		System.out.printf("�����(���ݷ� :%d)�� �ֵθ��ϴ�.\n", damage);
	}

}
