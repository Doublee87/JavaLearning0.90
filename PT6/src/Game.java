public class Game {
	private Peg[] pegs = new Peg[3];
	
	public Game (){
		pegs[0] = new Peg();
		pegs[1] = new Peg();
		pegs[2] = new Peg();
		Disk d1 = new Disk(1);
		Disk d2 = new Disk(2);
		Disk d3 = new Disk(3);
		Disk d4 = new Disk(4);
		pegs[0].addDisk(d4);
		pegs[0].addDisk(d3);
		pegs[0].addDisk(d2);
		pegs[0].addDisk(d1);
		
	}
	public boolean move(int wheredn, int wheredm){
		if (pegs[wheredn-1].isEmpty() == true){
			return false;
		}else{
			if (pegs[wheredm - 1].addDisk(pegs[wheredn -1].getTopDisk())){
				pegs[wheredn - 1].removeTopDisk();
				return true;
			}else{
				return false;
				
			}
		}
		
	}
	// This is done. Do not modify.
	public void setPegs(Peg[] p){
		pegs = p;
	}
	
    // This is done. Do not modify.
	public void printGame(){
		for(int level=4; level>=1; level--){
			System.out.print("            ");
			for(int i=0; i<pegs.length; i++){
				pegs[i].printLevel(level);			
			}
			System.out.println();
		}
	}
	
}
