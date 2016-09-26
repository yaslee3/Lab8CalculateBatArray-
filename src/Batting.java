import java.text.DecimalFormat;
import java.util.Scanner;

public class Batting {

	
	public static void main(String[] args) {
		
		// Create a Scanner
				Scanner scan = new Scanner(System.in);
		// Add decimal Format so the three decimal places are shown
				DecimalFormat decimalFormat = new DecimalFormat("0.000");
				String choice = "y";// declare variables
				int timesAtBat = 0;
				int atBatResult;
				int totalScore = 0;
				
				// print welcome message to console
				System.out.println("Welcome to Batting Average Calculator!");
				while (choice.equalsIgnoreCase("y")) {
					
					System.out.println("Enter number of times player at bat:");
					timesAtBat = scan.nextInt();
					
					int[][] baseball = new int[timesAtBat][];
					
					System.out.println("0=out,1=single , 2=double,3= triple, 4= homerun");
					
					for (int i = 0; i < timesAtBat; i++) {
						
						int x = i + 1;
						System.out.println("input results for at bat " + x + ":" + "\t");
						// Scanner scan = null;
						atBatResult = scan.nextInt();
						totalScore = totalScore + atBatResult;
						//inputs.add(atBatResult);
						scan.nextLine();
						

					}
					
					float battingAverage = (float) 3 / (float) timesAtBat;
					System.out.println("\nBatting Percentage:" + decimalFormat.format(battingAverage));

					float slugginPercentage = (float) totalScore / (float) timesAtBat;
					System.out.println("\nSlugging Percentage:" + decimalFormat.format(slugginPercentage));
					System.out.print("Another batter?(y/n):");
					choice = scan.next();
					System.out.println();
					
					if (choice.equalsIgnoreCase("n")) {

						System.out.println("Peace Out");
						scan.close();

					}
				}
	}
}
