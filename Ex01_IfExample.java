package sec01;

public class Ex01_IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} // if
		
		if(score < 90) {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");	// if������ ��� ���� ���๮
		} // if
	} // main()
} // class