package snakes;

public class Constrictor extends Snake {
	public Constrictor(String name) {
		super(name);
	}

	public void constrict() {
		System.out.println("The " + this.name.toLowerCase() + " squeezes you to death!");
	};
}
