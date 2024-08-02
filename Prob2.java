public class Prob2{
	public static void main(String[] args) { 
                double Distance_in_km = 2614;
		double Distance_in_meters = Distance_in_km * 1000;
		double Distance_in_feet = Distance_in_km * 3281;
		double Distance_in_inches = Distance_in_km * 39370;
		double Distance_in_centimeters = Distance_in_km * 100000;
		System.out.println("Distance between two cities in km is "+ Distance_in_km);
		System.out.println("Distance between two cities in meters is "+ Distance_in_meters);
		System.out.println("Distance between two cities in feet is "+ Distance_in_feet);
		System.out.println("Distance between two cities in inches is "+ Distance_in_inches);
		System.out.println("Distance between two cities in centimeters is "+ Distance_in_centimeters);
	}
}
