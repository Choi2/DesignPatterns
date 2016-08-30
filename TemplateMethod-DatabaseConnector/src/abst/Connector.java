package abst;

public abstract class Connector {

	protected String url;
	protected String userName;
	protected String password;
	
	public Connector(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	protected abstract void loadDriver();
	protected abstract String createConnection();
	protected abstract String createdStatement(String query);
	
	public String select(String query) {
		loadDriver();
		
		String connection = createConnection();
		System.out.println(connection + " ����");
		
		String preparedStatement = createdStatement(query);
		System.out.println(preparedStatement + " ����");
		
		String resultSet = query + "�� ������ ����� �����ݴϴ�.";
		
		return resultSet;
	}
	
	public int insert(String query) {
		loadDriver();
		
		String connection = createConnection();
		System.out.println(connection + " ����");
		
		String preparedStatement = createdStatement(query);
		System.out.println(preparedStatement + " ����");
		
		System.out.println(query + " ���� �߽��ϴ�.");
		
		return 1;
	}
	
	
	
}
