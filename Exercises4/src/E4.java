
import java.util.Scanner;
public class E4 {
	
	 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner in = new Scanner(System.in);
 System.out.println("Enter three number ");
 
 int x=in.nextInt();
 double y=in.nextInt();
 int z=in.nextInt();
 int m=operation(z, x);
 operation(y,x);
 double d=operation(y);
 System.out.println("mult=" +m);
 System.out.println("div=" +d);

	}

public static void operation(double y, int x) {
	 System.out.println("Sum= "+(x+y));
}
public static void operation(int x, double y, int z) {
	 System.out.println("sub="+ (x-y-z));
	 
}
public static int operation(int z, int y ) {
	 return (z*y);
}
public static double operation(double y) {
	 return (y/y);
}

	}
