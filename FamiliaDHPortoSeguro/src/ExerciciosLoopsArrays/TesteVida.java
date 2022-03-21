package ExerciciosLoopsArrays;

import java.util.ArrayList;

public class TesteVida {
public static void main(String[] args) {
	ArrayList<String> vida = new ArrayList<>();
	
	vida.add("♥");
	vida.add("♥");
	vida.add("♥");
	
	System.out.println(vida);
	
	
		vida.remove(vida.size()-1);
		System.out.println(vida);
		
	
}
}
