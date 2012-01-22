package ant;



public class Larva extends Ant {
	
	int larvatype;
	
	public Larva(int Birthrank) {
		// TODO Auto-generated constructor stub
		super();
		this.id = Birthrank;
		this.age = 0;
		this.maxAge = 10;
		this.alive = true;
		
		
		//This part allow me to define which type of ant this larva will be.
		int maxNum = 20;
		int minNum  = 1;
		
		int test = (int)( Math.random()*( maxNum - minNum + 1 ) ) + minNum ;
		
		if (test == 1) { 
			larvatype = 1; // Reine
		}  else if (test == 2 || test== 3) {
			larvatype = 2; // M‰le
		} else { 
			larvatype = 3; // Travailleuse
			}
		
		antType = larvatype;
	}
}

	
	