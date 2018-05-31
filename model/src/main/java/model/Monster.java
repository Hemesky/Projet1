package model;

public class Monster {
private World world;
	
	// ne pas oulier le idsprite qui manque 
	
	public Monster(World world) {
		super();
		this.world = world;
	}
	
	public void getX() {}
	public void getY() {}
	public void setPosX(int posX) {}
	public void setPosY(int posY) {}
	public boolean isMovePossible(int x, int y) {
		return false;};
	public void moveUp() {}
	public void moveDown() {}
	public void moveUpperLeft() {}
	public void moveUpperRight() {}
	public void moveBottomRight() {}
	public void moveBottomLeft() {}
	
	
}
