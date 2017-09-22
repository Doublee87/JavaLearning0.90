import java.util.Random;


public class PT3 {
	public static void main(String[]args){
		Song s = new Song("Poker Face");
		Song s2 = new Song("I'm Yours");
		Song s3 = new Song("1, 2, 3, 4");
		Song s4 = new Song("naa");
		Song s5 = new Song("hee");
		Song s6 = new Song("hoo");
		Song s7 = new Song("haa");
		
		Song[] mySongs = new Song[7];
		mySongs[0] = s;
		mySongs[1] = s2;
		mySongs[2] = s3;
		mySongs[3] = s4;
		mySongs[4] = s5;
		mySongs[5] = s6;
		mySongs[6] = s7;
		
		
		MusicPlayer player = new MusicPlayer( mySongs ); // you have to send in a Song[] object

		player.randomMix();
		
		//player.randomMix(); // does this cause an infinite loop?????????



	}
}
