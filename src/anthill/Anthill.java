package anthill;
// dans cette classes sont cr�es toutes les fonctions r�gissant le fonctionnement de la fourmilli�re.
import ant.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Anthill {
	int birthrank=0;
	int day=0;
	ArrayList<Larva> larvae;
	ArrayList<Male>  males;
	ArrayList<Queen> queens;
	ArrayList<Worker> workers;
	public void Init() {
		
		larvae= new ArrayList<Larva>();

		males= new ArrayList<Male>();
		
		queens= new ArrayList<Queen>();
		
	    workers= new ArrayList<Worker>();	
	}
	public void AnthillStatus() {
		// Un r�sum� de l'�tat de la fourmilli�re
		
	}
	
	public void createAnt(int birthrank,int antType){   //Cr�ation des fourmis  
		birthrank++;
		switch (antType)
		{
		case 1:
			Queen newQueen = new Queen(birthrank,antType);
			 queens.add(newQueen);
		break ;
		case 2:
			Male newMale = new Male(birthrank,antType);
			males.add(newMale);
		break ;
		case 3:
			Worker newWorker = new Worker(birthrank,antType);
			workers.add(newWorker);
			break;

		default: 
		{
			Larva newLarva = new Larva(birthrank);
			larvae.add(newLarva);
		}
		}
			
			
			
			
		}
	
	public void Evo () {
		day++;
	    setAge(ant.Ant.getAge()) ;
	    

	}
	
}
