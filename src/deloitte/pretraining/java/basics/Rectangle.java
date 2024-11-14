package deloitte.pretraining.java.basics;

public class Rectangle {
	
	public static int perimeter(int length , int breadth)
	{ 
		return 2*(length + breadth);
	}
	
	public static int area(int length, int breadth)
	{
		return length * breadth;
	}
	

	public static void main(String[] args) {
		
		int length = 6;
		int breadth = 2;
		
		
		int perimeter = perimeter(length, breadth);
		int area = area(length, breadth);
		
		System.out.println("perimeter of the rectangle is:" + perimeter);
		System.out.println("area of the rectangle is:" + area);
		// TODO Auto-generated method stub

	}

}
