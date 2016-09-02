package decorator.concrete;

import component.Aspect;
import decorator.AddProcess;

public class AfterProcess extends AddProcess {

	public AfterProcess(Aspect aspect) {
		super(aspect);
	}
	
	@Override
	public void before() {}
	
	@Override
	public void after() {
		System.out.println("���� ��...");
	}
	
	@Override
	public void error() {}
}
