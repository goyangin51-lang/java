package sec02;

public class Scopetest {
	
	public static void main(String[] args) 
	{
		//int d = a;
		int a = 10;
		
		if(a > 1) 
		{
			int b = a;
		}
		
		for(int i = 0; i< 10; i++) 
		{
			int c = a + i;
			c = b + i;
		}
	}

}
