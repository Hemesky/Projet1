package model;

public class Door extends Immobile {

	//niveau
	double posX;
	double posY;
	boolean isDoorTouched ;
	
	public Door(double posX, double posY, boolean isDoorTouched) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.isDoorTouched = isDoorTouched;
	}
	
	public double setX (double posX) {return posX;};
	public double setY (double posY) {return posY;};
	
	
	
}
