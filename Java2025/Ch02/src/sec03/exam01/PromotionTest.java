package sec03.exam01;

public class PromotionTest {

	public static void main(String[] args) {
		byte byteVal = 10;
		int intVal = byteVal;
		
	
		
		char charVal = 'A';
		//charVal = 65;
		//system.out.println(charVall);
		int intVall = charVal;
		System.out.println((char)intVall);
		
		byte byteVal1 = 65;
		int intVal2 = 65;
		char charVal2 = (char)byteVal1;
		char charVal3 = (char)intVal2;
	}

}
