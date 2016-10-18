package polymorph;

public class CallStaticMorph {
	
	public static void main (String[] args){
		
		StaticMorph Morph = new StaticMorph();
		
		System.out.println(Morph.sum(0.25, 1));
		
		System.out.println(Morph.sum(2, 1));
		
		System.out.println(Morph.sum(2, 1, 3));
	}

}
