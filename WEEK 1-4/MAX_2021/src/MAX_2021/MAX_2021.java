package MAX_2021;
import java.util.*;
public class MAX_2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare variables

double SA=0.0;
double side=0.0;

Scanner Input= new Scanner(System.in);
System.out.println("Enter the length of a side: ");
side=Input.nextDouble();
SA=(side*side*6);
System.out.println("Surface Area of the Cube is "+ SA);


}//end of main
}//end of class
