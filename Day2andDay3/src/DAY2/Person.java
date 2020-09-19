package DAY2;

public class Person {
	String name;
	int age;
	String gender;
	public Person(String name, int age, String gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
	}
	public static void main(String[]args) {
		Person person = new Person("gakki",20,"female");
		System.out.println(person.name+"\n"+person.age+"\n"+person.gender);
		
	}
}
