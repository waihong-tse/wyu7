package DAY2;

public class Vehicle {
	String name;
	double speed;
	double size;
public Vehicle(String name, double speed, double size) {
	this.name=name;
	this.speed=speed;
	this.size=size;
	// TODO Auto-generated constructo
}
	public void move() {
		System.out.println(name+"在移动");
	}
	public void speedUp() {
		System.out.println(name+"在加速");
	}
	public void speedDown() {
		System.out.println(name+"在减速");
	}
	public static void main(String[] args) {
		Vehicle Bike=new Vehicle("Bike", 50.5, 20.3);
		Bike.speedDown();
		Bike.speedUp();
	System.out.println(Bike.name+"\n"+Bike.speed+Bike.size);
	}
}
