package builder.concrete;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		// HTTP ��û �غ� �۾�
		Builder http = new Builder("POST", "http://www.naver.com");

		// �Ķ���͸� �����Ѵ�.
		// ���� �Ķ���� ����
		// http.addOrReplace("test", "�ѱ��ѱ�...");
		Map<String, String> result = new HashMap<String, String>();
		result.put("data1", "�޸𿡿�~");
		result.put("data2", "�޸��Դϴ�~~~");
		http.addAllParameters(result );

		// HTTP ��û ����
		HttpClient post = http.create();
		post.request();

		// ���� �����ڵ� ��������
		int statusCode = post.getHttpStatusCode();

		// ���� ���� ��������
		String body = post.getBody();
		
		System.out.println(body);
	}
	
}
