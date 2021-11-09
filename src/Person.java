
public class Person {
	private String name;
	private int age;
	private double height;
	private int shoesize;
	
	public Person(String name, int age, double height, int shoesize) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoesize = shoesize;
		
	
}

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
		
	public void greet() {
		System.out.println("Hi I`m " + name + " my age is " + age + " currently my height is " + height + " My shoe size is " + shoesize);
	}
	
}
