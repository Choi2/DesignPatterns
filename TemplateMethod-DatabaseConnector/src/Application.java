import abst.Connector;
import concrete.MSSQLConnector;

public class Application {

	public static void main(String[] args) {
		
		Connector connector = new MSSQLConnector("localhost", "root", "password");
		int count = connector.insert("�μ�Ʈ ����");
		System.out.println(count + "�� �μ�Ʈ �Ϸ�");
		
		String result = connector.select("����Ʈ ����");
		System.out.println(result);
	}
	
}
