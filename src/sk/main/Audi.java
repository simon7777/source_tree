package sk.main;

public class Audi implements Car {
	private String color;
	
	@Override
	public boolean color(String color) {
		this.color = color;
		return false;
	}
	
	public String getColor(){
		System.out.println(color);
		return color;
	}

}
