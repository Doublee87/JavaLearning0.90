
public class Song {
	private String title;
	private boolean alreadyPlayed;
	private int count = 0;
	
	public int getCount(){
		return count; 
		
	}
	public void incrementCount(){
		count++;
	}
	public void resetCount(){
		count = 0;
	}
	
	public String getTitle(){
		return title;
	}
	public boolean getAlreadyPlayed(){
		return alreadyPlayed;
	}
	public void setAlreadyPlayed(boolean boo){
		alreadyPlayed = boo;
		
	}
	public Song(String str){
		title = str;
		alreadyPlayed = false;
	}
	
	

}
