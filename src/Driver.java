import shapes.Squares;
import shapes.Rectangle;
import utils.Math;
public class Driver {
	
	public static void main(String[] args) {
		Squares n = new Squares(100) ;
		System.out.println(n.getArea());
		
		Rectangle b = new Rectangle(50, 80);
		System.out.println(b.getArea());
	
	double num = 15.6;
	
	System.out.println(Math.factorial((int)num));
	System.out.println(Math.loopfactorial((int)num));
	
	}
}