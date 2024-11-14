package deloitte.pretraining.java.basics;

public class kmstometers {
	
	static int distanceInMeters;
	static int distanceInKilometers;
	
	public static int kilometerToMeterConverter(int kilometers) {
		return kilometers * 1000;
	}

	public static void main(String[] args) {
		
		distanceInKilometers = 9;
		distanceInMeters= kilometerToMeterConverter(distanceInKilometers);
		System.out.println(distanceInKilometers + "is equal to" + distanceInMeters);
		
		
		
		// TODO Auto-generated method stub

	}

}
