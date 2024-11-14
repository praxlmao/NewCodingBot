package interfaceconcept;

public class Grade10students implements Educationsystem {
	
	public void aggregate(int avg) {
		if (avg>=(avg*(75/100))) {
			System.out.println("you have been promoted!");
		}
		
		else {
			System.out.println("not promoted!");
		}
	}

}
