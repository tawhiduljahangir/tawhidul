package dhansiri.inheritance;



public class ClassC implements ClassA,ClassB{
	public void getKorim() {
		
		int cash = 10000;
		
		System.out.println("I have cash " + cash);
	}

	public void getAhInfo() {
		// TODO Auto-generated method stub
		String care = "BMW";
		
		System.out.println(" I have a care " + care);
	}

	public void getKazi() {
		// TODO Auto-generated method stub
		
	String gold = "100gm";
		System.out.println("I have gold" + gold);
	}
		
		public static void main(String[] args) {
			
			ClassC obj = new ClassC();
			obj.getKorim();
			obj.getAhInfo();
			obj.getKazi();
			
			
			
		}
		
		
		

}
