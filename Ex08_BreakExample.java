package sec02;

public class Ex08_BreakExample {
	public static void main(String[] args) {
		// break�� while�� ����
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			} // if
		} // while
		System.out.println("���α׷� ����");
	} // main()
} // class