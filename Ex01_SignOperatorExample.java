package sec02;

public class Ex01_SignOperatorExample {
	public static void main(String[] args) {
		// ��ȣ ������
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
//		byte result3 = -b;	// byte Ÿ�� ���� ��ȣ �����ϸ� int Ÿ�� ������ �ٲ�Ƿ� ���� �߻�
		int result3 = -b;
		System.out.println("result3 = " + result3);
	} // main()
} // class