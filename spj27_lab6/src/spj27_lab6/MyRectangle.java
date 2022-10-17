package spj27_lab6;

public class MyRectangle
{
	int width = 0;
	int height = 0;
	int startX = 0;
	int startY = 0;

	public MyRectangle()
	{
		width = 0;
		height = 0;
		startX = 0;
		startY = 0;
	}

	public MyRectangle(int x, int y, int w, int h)
	{
		startX = x;
		startY = y;
		width = w;
		height = h;
	}

	public int area()
	{
		return width * height;
	}


	// I have written this method for you.  Note how a StringBuilder is
	// utilized, since (as we discussed in lecture) it can be modified
	// without having to create a new object each time (unlike a String).
	public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y)
	{
		// This is the trickiest of the methods to write.  This should
		// return true if point (x,y) is anywhere within the borders of the
		// current MyRectangle (including the borders themselves).  Use a
		// pencil and paper to figure out how this can be determined with
		// just a few simple relational operations.
		
		int x1 = startX;
		int y1 = startY;
		int x2 = x1 + width;
		int y2 = y1 + height;
		
		if (x > x1 && x < x2 && y > y1 && y < y2) {
			return true;
		} else {
			return false;
		}
	}

	public void setSize(int w, int h)
	{
		// Update width and height as shown
		width = w;
		height = h;
	}

	public void setPosition(int x, int y)
	{
		// Update startX and startY as shown
		startX = x;
		startY = y;
	}

	public static void testInside(MyRectangle R, int x, int y)
	{
		System.out.print("Point (" + x + "," + y + ")");
		if (R.isInside(x, y))
			System.out.println(" is INSIDE " + R);
		else
			System.out.println(" is OUTSIDE " + R);
	}

	public static void main(String [] args)
	{
		MyRectangle R1, R2, R3;

		R1 = new MyRectangle(100, 50, 80, 20);
		R2 = new MyRectangle();
		R3 = new MyRectangle(60, 60, 100, 100);
 
		// In Java, when Objects are printed (as shown below), the toString()
		// method is implicitly called.  Thus the statements below will call
		// toString() for each of the three MyRectangle objects
		System.out.println("R1: " + R1 + " Area: " + R1.area());
		System.out.println("R2: " + R2 + " Area: " + R2.area());
		System.out.println("R3: " + R3 + " Area: " + R3.area());

		int x1 = 120, y1 = 70;
		int x2 = 130, y2 = 110;

		// Verify with a pencil and paper which of these should be true and
		// which should be false.
		testInside(R1, x1, y1);
		testInside(R3, x1, y1);
		testInside(R1, x2, y2);
		testInside(R3, x2, y2);

		R1.setSize(120, 240);
		R3.setPosition(400, 350);
		testInside(R1, x2, y2);
		testInside(R3, x2, y2);
	}
}