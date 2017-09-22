import java.util.ArrayList;


public class Peg {
	private ArrayList<Disk> myDisks = new ArrayList<Disk>();
	/*
	 * For purposes of the Tower of Hanoi game, if myDisks.size() > 0
	 * myDisks.get(0) gets the bottom Disk.
	 * To get the top Disk, first find the size of myDisks and get the Disk at 
	 * that index - 1.
	 */
	
	
	
	

	// This method is done. Do not modify.
	public ArrayList<Disk> getMyDisks() {
		return myDisks;
	}
	
	// This method is done. Do not modify.
	public void setMyDisks(ArrayList<Disk> md) {
		myDisks = md;
	}	
	
	// This method is done. Do not modify.
	public void printLevel(int level){  // level 1 is the base. level 4 is the top
		if(myDisks.size()>=level){
			System.out.print(myDisks.get(level-1));
		}else {
			System.out.print("         ");
		}		
	}
	
	public boolean isEmpty(){
		if (myDisks.size() == 0){
			return true;
		}else{
			return false;
		}
	}
	public Disk getTopDisk(){
		int ds = myDisks.size();
		int td = ds-1;
		if (myDisks.size() == 0){
			return null;
		}else{
			return myDisks.get(td);
		}
	}
	public Disk removeTopDisk(){
		int ds = myDisks.size();
		int td = ds-1;
		if (myDisks.size() == 0){
			return null;
		}else{
			return myDisks.remove(td);
		}		
	}
	public boolean addDisk(Disk D){
		int ds = myDisks.size();
		if (ds == 0){
			myDisks.add(D);
			return true;
		}
		Disk topDisk = myDisks.get(ds-1);
		if (D.getWidth() < topDisk.getWidth()){
			myDisks.add(D);
			return true;
		}else{
			return false;
		}
		
	}
}// end of Peg class
