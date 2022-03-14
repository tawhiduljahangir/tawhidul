package dhansiri.polymorphism;



public class OverRiding2 extends OverRiding1 {

public void getVehicle() {
		
		System.out.println(" I have a care Rav4");
	}
	
	public void getMarry() {
		System.out.println("My wife name is Sabina");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding2 obj = new OverRiding2();
		obj.getVehicle();
		obj.getMarry();
		obj.getCash();
		obj.getGold();
}
}