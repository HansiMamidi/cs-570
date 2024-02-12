// Mamidi_Sri_Naga_Hansi

package Maze;

public class PairInt {

	private int x;
	private int y;
	
	// Defined a constructor here
	public PairInt(int x, int y) {
		
		this.x=x;
		this.y=y;
	}
	
	//accessor and mutator methods for private variables
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public boolean equals(Object p) {
      if(!(p instanceof PairInt)) {
    	  return false;
      }	
      else {
    	  PairInt pairint= (PairInt)p;
    	  return this.x==pairint.x && this.y==pairint.y;
    	  
      }   
	}
	
	public String toString() {
		
		return "[" + String.valueOf(x) + "," + String.valueOf(y)+"]";
	}
	
	//returns the copy of PairInt
	public PairInt copy() {
		PairInt solution= new PairInt(x,y);
		return solution;
		
	}
}
