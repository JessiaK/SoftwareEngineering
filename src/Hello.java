import java.util.Scanner;
import java.util.*;

//This program prints the users name who is running this program.

public class Hello {
	
	public static void main(String[] args){
		
		Scanner x = new Scanner(System.in);  //declared and initialized the scanner
		String name = x.nextLine(); 
		System.out.println("The person running this program is:" + name); //printing the user's name
	}
	
}
