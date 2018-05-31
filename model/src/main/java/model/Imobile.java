package model;

public interface Imobile {

	
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
	public void moveUpperLeft();
	public void moveUpperRight();
	public void moveBottomLeft();
	public void moveBottomRight();
	public boolean isMovePossible(int x, int y);
	
	
	
}
