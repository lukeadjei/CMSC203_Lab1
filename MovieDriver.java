import java.util.Scanner;
public class MovieDriver {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		//Comment out the task that you currently don't want to use or just let both run.
		Movie movieObject = new Movie();
		boolean testCase = true;
		//Task 1
		System.out.println("Enter the title of a movie");
		movieObject.setTitle(scan.nextLine());
		System.out.println("Enter the movie's raiting");
		movieObject.setRating(scan.nextLine());
		System.out.println("Enter the number of tickets sold at __ Theater");
		movieObject.setSoldTickets(scan.nextInt());
		
		scan.nextLine(); 
		System.out.println(movieObject.toString());
		//task 2 
		while (testCase) {
			System.out.println("Enter the title of a movie");
			movieObject.setTitle(scan.nextLine());
			System.out.println("Enter the movie's raiting");
			movieObject.setRating(scan.nextLine());
			System.out.println("Enter the number of tickets sold at __ Theater");
			movieObject.setSoldTickets(scan.nextInt());
			scan.nextLine();
			System.out.println("Do you want to enter another? (y or n)");
			String testInput = scan.nextLine();
			if (testInput.equalsIgnoreCase("y")){
				testCase = true;
			}
			else {
				testCase = false;
			}
		}
	}
}
