package model;

public class Lorann  extends Mobile {
	
	double lastX ;
	double lastY ;
	Fireball fireball;
	boolean isFireBallPossible ;
	//Implementer l'attribut niveau world;
	public Lorann(double lastX, double lastY, Fireball fireball, boolean isFireBallPossible) {
		super();
		//idSprite !
		this.lastX = lastX;
		this.lastY = lastY;
		this.fireball = fireball;
		this.isFireBallPossible = isFireBallPossible;
	}
	
	// Creer fonction isDoorTouched 
	
	public void launchFireball(int x, int y) {};
	
	public boolean isFireBallPossible () {
		return false; 
	}
	
	public void moveUp() {};
	public void moveDown() {};
	public void moveLeft() {};
	public void moveRight() {};
	public void moveUpperLeft() {};
	public void moveUpperRight() {};
	public void moveBottomLeft() {};
	public void moveBottomRight() {};
	public boolean isMovePossible(int x, int y) {
		return false;};
		
	public void getX() {};
	public void getY() {};
	public double setX(double posX) {
		return posX;};
	public double setY(double posY) {
		return posY;};
	
		
}
