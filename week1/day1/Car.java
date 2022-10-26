package week1.day1;

public class Car {
    public void driveCar() {
    	System.out.println("driveCar");
    }
    public void applyBrake() {
    	System.out.println("applyBrake");
    }
    public void soundHorn() {
    	System.out.println("soundHorn");
    }
    public void isPuncture() {
    	System.out.println("isPuncture");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1=new Car();
		obj1.applyBrake();
		obj1.driveCar();
		obj1.soundHorn();
		obj1.isPuncture();
		}
	}
