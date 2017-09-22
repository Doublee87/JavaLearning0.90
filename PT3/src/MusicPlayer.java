import java.util.Random;


public class MusicPlayer {

	private Song[]playList;
	private static Random rand = new Random();
	
	public void setPlayList(Song[]s){
		playList = s;
	}
	public MusicPlayer(Song[]s){
		playList= s;
	}
	public void playInOrder(){
		for (int i=0; i<playList.length; i++){
			System.out.println(playList[i].getTitle());
			playList[i].setAlreadyPlayed(true);
			
		}
	}
	public void setAllSongsToNotPlayed(){
		for (int i=0; i<playList.length; i++){
			playList[i].setAlreadyPlayed(false);
		}
	}
	public void randomMix(){
		setAllSongsToNotPlayed();
		Random rand = new Random();
		
		for (int i=0; i<playList.length; i++){
	
			int num = rand.nextInt(playList.length);
			while(playList[num].getAlreadyPlayed() == true){
				num = rand.nextInt(playList.length);
			}	
				System.out.println(playList[num].getTitle());
				playList[num].setAlreadyPlayed(true);
			}                        
		}
	}
