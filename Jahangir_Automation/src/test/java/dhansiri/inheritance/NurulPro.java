package dhansiri.inheritance;


public class NurulPro extends TorikPro {
	protected void getNProperty() {
		String gold = "100 gram";
		System.out.println(" Gold =" + gold);
	}
	
	public static void main(String[] args) {
		NurulPro obj = new NurulPro();
		obj.getNProperty();
		obj.getTrProperty();
		
	}
}
