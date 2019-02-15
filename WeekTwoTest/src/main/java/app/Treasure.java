package app;

public class Treasure {
	
	private boolean found;
	
		
	public boolean isFound() {
		return found;
	}




	public void setFound(boolean found) {
		this.found = found;
	}




	public boolean isThere(int j) {
		
		if (j == 3) {
			return true;
		} else {
			return false;
		}
		
	}

}
