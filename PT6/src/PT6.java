import java.util.Scanner;


public class PT6 {


	public static void main(String[] args) {
		Game g = new Game();
		Scanner sc = new Scanner(System.in);
		g.printGame();
		int from, to;

		while(true){
			System.out.print("\nFrom Peg (     1,       2,       3): ");
			from = sc.nextInt();
			System.out.print(  "To Peg   (     1,       2,       3): ");
			to = sc.nextInt();

			if(g.move(from, to)) { // if the move was legal, print how game looks now
				g.printGame();
			}
		}

	}

}
