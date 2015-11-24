package snakes;

public class Venomous extends Snake {
	public Venomous(String name) {
		super(name);
	}

	public void invenomate() {
        System.out.println("The " + this.name.toLowerCase() + " bites you and the poison kills you!");
    }
}
