
public class Song {
	private String title;
	private boolean alreadyPlayed;
	
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
