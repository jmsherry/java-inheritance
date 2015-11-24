package snakes;

public class Snake {
	protected String noise = "Hiss";
	protected String name;
	
	public Snake(String name){
		this.name = name;
	}
	
	public void makeNoise(){
		System.out.println(name +" says " + noise + "!!");
	}
	
}
