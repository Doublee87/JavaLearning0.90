public class Disk {
	private int width;
	
	public Disk(int w){
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public String toString() {
		switch(width){
		case 1: return  "   1     ";
		case 2: return  "  2 2    ";
		case 3: return  " 3 3 3   ";
		default: return "4 4 4 4  ";
		}
	}
}
