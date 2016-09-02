package decorator.concrete;

import component.Aspect;
import decorator.AddProcess;

public class MainProcess extends AddProcess {

	public MainProcess(Aspect aspect) {
		super(aspect);
	}

	@Override
	public void process() {
		System.out.println("�����ؾ� �ϴ� ���� �ڵ�");
	}
}
