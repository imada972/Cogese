package ant;
import anthill.*;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Ant {
	int id;
	int age;
	int maxAge;
	int antType;
	boolean alive;
	static int idAnt;
	
	
	public Ant(int id, int age, int maxAge, int antType, boolean alive) {
		super();
		this.id = id;
		this.age = age;
		this.maxAge = maxAge;
		this.antType = antType;
		this.alive = alive;
	}
	
	

	public Ant() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public int getAntType() {
		return antType;
	}

	public void setAntType(int antType) {
		this.antType = antType;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public static int getIdAnt() {
		return idAnt;
	}

	public static void setIdAnt(int idAnt) {
		Ant.idAnt = idAnt;
	}

	

}