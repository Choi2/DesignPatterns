package concrete;

import abst.Connector;

public class MSSQLConnector extends Connector {

	public MSSQLConnector(String url, String userName, String password) {
		super(url, userName, password);
	}

	@Override
	protected void loadDriver() {
		System.out.println("...MS-SQL Driver Load...");
	}

	@Override
	protected String createConnection() {
		return "connection�� �����մϴ�.";
	}

	@Override
	protected String createdStatement(String query) {
		return query + " ����...";
	}

}
