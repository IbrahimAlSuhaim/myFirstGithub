import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the number of lines: ");
		        int numberOfLines = input.nextInt();

		        
		        for (int currentRow = 1; currentRow <= numberOfLines; currentRow++) {

		            for (int currentColumn = 1; currentColumn <= numberOfLines - currentRow; currentColumn++) {
		                System.out.printf("%3s", " ");
		            }
		            for (int number = currentRow; number >= 1; number--) {
		                
		                System.out.printf("%3d", number);
		            }
		            for (int number = 2; number <= currentRow; number++) {
		               
		                System.out.printf("%3d", number);

		            }
		            System.out.println();
		
		
	}

	}
}

