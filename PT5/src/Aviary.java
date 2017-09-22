import java.util.*;

public class Aviary {
	private ArrayList<Bird> aviary;
	private Random rand = new Random();
	
	public Aviary (ArrayList<Bird> avi){
		aviary = avi;	
	}
	public ArrayList<Bird> see10Birds(){
		if (aviary.size() <10){
			throw new RuntimeException ("Not enough birds.");
		}
		ArrayList<Bird> alb = new ArrayList<Bird>();
		for(int i = 0; i<10; i++){
			int rdm = rand.nextInt(aviary.size());
			alb.add(aviary.remove(rdm));
		}
		for (int i =0; i<10; i++){
			aviary.add(alb.get(i));
		}
		return alb;
	}

}
