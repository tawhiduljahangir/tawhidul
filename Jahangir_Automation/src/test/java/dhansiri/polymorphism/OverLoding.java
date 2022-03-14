package dhansiri.polymorphism;


public class OverLoding {



public void getRafi(int salary) {
		System.out.println(salary);
	}

public void getRafi(int salary, String name) {
	System.out.println(salary );
	System.out.println(name);
}
		
public void getRafi( String name,int salary) {
	System.out.println(name);
	System.out.println(salary);
}

public void getRafi( String name, double salary) {
	System.out.println(name);
	System.out.println(salary);
}

public static void main(String[] args) {
	OverLoding obj = new OverLoding();
	obj.getRafi(50000);
	obj.getRafi(9000,"tawhid");
	
	
}

}
