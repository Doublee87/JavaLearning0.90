import java.awt.Color;


public class Bird {
	private int idNum;
	private Color myColor;
	
	public int getIdNum(){
		return idNum;
	}
	public Color getMyColor(){
		return myColor;
	}
	public Bird (Color lon, int rgm){
		myColor = lon;
		idNum =rgm;
	}
    public String toString() {
        if(myColor==Color.red){
             return "red "+idNum;
        }else{
             return "blue "+idNum;
        }
  }     

}
