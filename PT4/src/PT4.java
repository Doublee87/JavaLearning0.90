
public class PT4 {

	public static void main(String[] args) {
		Song[] mySongs = new Song[7];
		mySongs[0] = new Song("Poker Face");
		mySongs[1] = new Song("I'm Yours");
		mySongs[2] = new Song("1, 2, 3, 4");
		mySongs[3] = new Song("Lucky");
		mySongs[4] = new Song("Rhythm of Love");
		mySongs[5] = new Song("Love Story");
		mySongs[6] = new Song("Yours");

		MusicPlayer player = new MusicPlayer( mySongs );

		System.out.println("\nPrint the songs with \"Love\"");
		player.playThese("Love");
		System.out.println("\nPrint the songs with \"Yours\"");
		player.playThese("Yours");
		System.out.println("\nPrint the songs with an \"e\"");
		player.playThese("e");
		System.out.println("\nPrint the songs with a \"y\"");
		player.playThese("y");
		System.out.println("\nPrint the popular songs first");
		player.playPopularFirst();
		System.out.println("\nPrint the songs with an \"r\"");
		player.playThese("r");
		System.out.println("\nPrint the popular songs first");
		player.playPopularFirst();
	}

}
