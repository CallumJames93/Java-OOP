package Encapsulation;

public class Excaps {
	
	public static void main (String[] args){
		encaps encaps = new encaps();
		// Set data
		encaps.setName("Callum");
		encaps.setrollNo(1);
		
		System.out.println("Roll no is" + " " +encaps.getrollNo() + " " + "and name is" + " " + encaps.getName());
	}

}
