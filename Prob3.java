
public class Prob3{
	public static void main(String[] args) { 
                int sub1 = 80;
		int sub2 = 90;
		int sub3 = 75;
		int sub4 = 60;
		int sub5 = 100;
		int aggregateMarks = sub1 + sub2 + sub3 + sub4 + sub5;
		int totalMarks = 500;
		int  percentage = (int) ((aggregateMarks / totalMarks) * (100));
		System.out.println("Aggregate Marks are " + aggregateMarks);
		System.out.println("Percentage is " + percentage + "%");  
	}
}