package ant;


public class Worker extends Ant {

	
	public Worker(int Birthrank, int antType) {
			// TODO Auto-generated constructor stub
			super();
			this.id = Birthrank;
			this.age = 0;
			this.maxAge = 50;
			this.alive = true;}
/*
	public Worker WorkerCreate(int Birthrate ) {
		id = Birthrate;
		age = 0;
		maxAge = 50;
		alive = true;
		return this;
	}
*/
}
