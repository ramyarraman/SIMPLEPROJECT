import java.util.Scanner;

public class SIMPLEPROJECT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String s4=sc.nextLine();
		System.out.println("Please enter the character to remove");
		String noNeed = sc.nextLine();
		s4=s4.replace(noNeed,"");
		System.out.println(s4);		
		sc.close();
	
		
		
	}

}
