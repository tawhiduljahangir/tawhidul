package dhansiri.variable;



public class Number_Swap1 {
	static int salam = 200;
	static int rafik =300;



	public static void getEmployeesInf() {
		
		int temp;
		salam = 200;
		rafik = 300;
		 
		temp = salam;
		salam = rafik;
		rafik = temp;
		
		System.out.println(" salam " + salam);
		System.out.println(" rafik " + rafik);
		
		
		
	}
		


	public static void getEmployees2() {
		
	int khaled = 500;
	int baten = 700;


	khaled = khaled + baten;
	baten = khaled - baten;
	khaled = khaled - baten;


	System.out.println( " khaled " + khaled);
	System.out.println( " baten " + baten);	
		
		
	}
		


	static int x = 100;
	static int y = 200;

	public static void getJob1() {
		
		int temp;
		x = 100;
		y = 200;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println( " x = " + x);
		System.out.println( " y = " + y);
		
		
	}
		
	static int a = 100;
	static int b = 200;


	public static void getJob2() {
		
		a = 100;
		b = 200;
		
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		
		System.out.println( " a = " + a);
		System.out.println( " b = " + b);
		
		
	}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			Number_Swap1.getEmployees2();
			Number_Swap1.getEmployeesInf();
			
			Number_Swap1.getJob1();
		    Number_Swap1.getJob2();
			
		}

}
