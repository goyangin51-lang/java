package sec01;

public class Ex01_StringEqualsExample {
	public static void main(String[] args) {
		// ���ڿ� ��
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		} // if
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		} // if
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		} // if
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		} // if
	} // main()
} // class