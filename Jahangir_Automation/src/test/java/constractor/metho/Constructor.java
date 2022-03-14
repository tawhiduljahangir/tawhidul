package constractor.metho;


public class Constructor {

public Constructor(int age) {
		
		System.out.println(age);
	}
	
	
	public Constructor(String name, int id) {
		System.out.println(name + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj = new Constructor(33);
		Constructor obj1 = new Constructor("tawhid", 3644);
	}
}
