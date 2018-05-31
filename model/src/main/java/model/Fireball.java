package model;

public class Fireball  extends Mobile {
	
	double  lastX;
	double  lastY;
	// - world : World; (pour le niveau)
	
	public Fireball(double lastX, double lastY) {
		super();
		// Implementer le SpriteID !
		this.lastX = lastX;
		this.lastY = lastY;
	}
	
	// Modifier toutes les methodes 
	
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
	
		
	public boolean isFireballPossible (int x, int y) {
		return false;};
	}
	
	
	
	
	


