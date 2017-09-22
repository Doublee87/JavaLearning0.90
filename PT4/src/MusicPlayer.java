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
			playList[i].incrementCount();
			
			
		}
	}
	public void setAllSongsToNotPlayed(){
		for (int i=0; i<playList.length; i++){
			playList[i].setAlreadyPlayed(false);
		}
	}
	public void randomMix(){
		setAllSongsToNotPlayed();
		rand = new Random();
		
		for (int i=0; i<playList.length; i++){
	
			int num = rand.nextInt(playList.length);
			while(playList[num].getAlreadyPlayed() == true){
				num = rand.nextInt(playList.length);
			}	
				System.out.println(playList[num].getTitle());
				playList[num].setAlreadyPlayed(true);
				playList[num].incrementCount();
			}                        
		}
	public void playThese(String str){
		setAllSongsToNotPlayed();
		for (int i = 0; i<playList.length; i++){
			String st = playList[i].getTitle();
			int n = st.indexOf(str);
			if (n != -1){
				System.out.println(playList[i].getTitle());
				playList[i].incrementCount();
			}
		}
	}
public void playPopularFirst(){
		setAllSongsToNotPlayed();
		

		for (int i= 0; i<playList.length; i++){
			int maxc = 0;
			
			for (int j=0; j<playList.length; j++ ){
				if (playList[j].getAlreadyPlayed() == false){
					int x =  playList[j].getCount();
					maxc = Math.max(x, maxc);
				}
			}
			
			for (int k=0; k<playList.length; k++){
				if(playList[k].getCount() == maxc && playList[k].getAlreadyPlayed() == false){
					System.out.println(playList[k].getTitle());
					playList[k].setAlreadyPlayed(true);
					playList[k].incrementCount();
				}
				
				
			}
		}
		
	}
}
			
