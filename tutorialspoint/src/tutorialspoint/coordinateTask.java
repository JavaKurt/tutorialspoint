import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Kurtis
 
    * Coordinate axes:
    * The coordinate system for the java graphing window poitions (0,0) in the upper left hand corner. 
    * The grid is then numbered in a positive direction on the x-axhis (horizontally to the right)
    * and in a positive direction on the y-axis (vertically going down).
    * https://mathbits.com/MathBits/Java/Graphics/GraphingMethods.htm
 * 
 * 
 * 
 * .trim() removes unwanted spaces at the start or end of a String
 * .split(" ") will split the string against given regular expression and returns a char array
 */
public class coordinateTask {
    
public static void main(String[] args) throws IOException {
		
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
                BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			line = line.trim();
			String[] coords = line.trim().split(" ");
			int hereX = Integer.parseInt(coords[0]);
			int hereY = Integer.parseInt(coords[1]);
			int destX = Integer.parseInt(coords[2]);
			int destY = Integer.parseInt(coords[3]);

			if (hereX == destX && hereY == destY)
				System.out.println("here");
			else if (hereX == destX && hereY < destY)
				System.out.println("N");
			else if (hereX == destX && hereY > destY)
				System.out.println("S");
			else if (hereX < destX && hereY == destY)
				System.out.println("E");
			else if (hereX > destX && hereY == destY)
				System.out.println("W");
			else if (hereX < destX && hereY < destY)
				System.out.println("NE");
			else if (hereX > destX && hereY < destY)
				System.out.println("NW");
			else if (hereX > destX && hereY > destY)
				System.out.println("SW");
			else if (hereX < destX && hereY > destY)
				System.out.println("SE");
		}
	}
}



/*
Compare Points
Programming challenge description:
Bob's hiking club is lost in the mountains on the way to a scenic overlook. Fortunately, 
Bob has a GPS device, so that he can see the coordinates where the group is currently at. 
The GPS gives the current X/Y coordinates as O, P, and the scenic overlook is located at Q, R. 
Bob now just needs to tell the group which way to go so they can get to the overlook in time for s'mores.

Input:
The input consists of four integers O, P, Q, R on a line, separated by spaces. |O,P,Q,R| < 10000.

Output:
Print a line containing one of the following:
N
NE
E
SE
S
SW
W
NW
here

if the coordinates Q,R are (respectively) north, northeast, east, southeast, south, southwest, west, northwest, or already at ("here") the coordinates O,P.
Test 1
Test Input
0 0 1 5

Expected Output
NE
*/