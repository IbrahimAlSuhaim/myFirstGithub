import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			int x=0, digit=1;
			
			
			System.out.print("Enter a number (-1 to end): ");
			x=input.nextInt();
			
			
			while(x!=-1){digit=1;
				
			while(x!=0){
				
				
				System.out.println("Digit"+digit+" = "+(x%10));
				digit++;
				x/=10;
				
				
			}
			
			System.out.print("Enter a number (-1 to end): ");
			x=input.nextInt();
			
			}
				
				
				
				
			
			
	}

}
