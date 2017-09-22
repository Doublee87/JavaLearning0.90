
import java.awt.Color;
import java.util.ArrayList;

public class Experiment {
	private Aviary av;
	private int[] results = new int[11];
	
	public Experiment(Aviary ava){
		av = ava;
	}
	public void printResults(){
		for (int i= 0; i<results.length; i++){
			System.out.print(results[i] + " ");
		}
	}
	public int howManyRed (ArrayList <Bird> alb){
		int redCounter=0; 
		for (int i = 0; i<alb.size(); i++){
			if (alb.get(i).getMyColor()== Color.red){
				redCounter++;
			}
		}
		return redCounter;
	}
	public void runExperimentOnce(){
		ArrayList<Bird> my10Birds = av.see10Birds();
		int redBurdz = howManyRed(my10Birds);
		results[redBurdz]++;

	}
	public void runExperimentManyTimes(int rxmt){
		results = new int[11];
		for (int i=0; i<rxmt; i++){
			runExperimentOnce();
		}
		double a=0;
		double b=0;
		int aa = 0;
		int bb = 0;
		int ab = 0;
		for(int i=0; i < results.length; i++){
			a = a+(i*results[i]);
		}
		b = a/rxmt;
		b = b*1.0;
		System.out.println(b+ " red birds out of 10" );
		for (int i=0; i< results.length; i++ ){
			aa = results[i];
			bb =Math.max(aa, bb);	
		}
		for (int i=0; i<results.length; i++){
			ab =results[i];
			if (bb == ab){
				System.out.println("Highest category was " +i+ " with " +bb+ " out of " +rxmt );
				
			}
		}
	}
}

