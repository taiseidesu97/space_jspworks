package practis;



public class MyDog {
	
	String name;
	String type;

	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return name +" "+ type;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDog dog = new MyDog("백구", "시바");
		System.out.println(dog);
	}

}
