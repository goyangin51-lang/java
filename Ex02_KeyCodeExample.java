package sec04;

public class Ex02_KeyCodeExample {
	public static void main(String[] args) throws Exception { // ����Ϳ� ���� ������ ���
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // a�� Ű�ڵ� 97
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // Enter Ű�� ĳ���� ���� 13
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // Enter Ű�� ���� �ǵ� 10
	} // main()
} // class