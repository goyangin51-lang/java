package sec02;

public class Ex07_WhileSumFrom1To100Example {
	public static void main(String[] args) {
		// 1���� 100���� ���� ���
		int sum = 0;	// �հ踦 ������ ����
		
		int i = 1;		// ���� ī���� ����
		
		while(i <= 100) {
			sum += i;
			i++;
		} // while
		System.out.println("1 ~ " + (i - 1) + " �� : " + sum);
	} // main()
} // class