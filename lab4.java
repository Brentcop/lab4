import java.util.Scanner;

public class lab4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j, k, num;
		char ans;
		String l,m,n;
		

		do {
			int i = 0;
			System.out.println("Enter an integer :");
			num = scan.nextInt();
			System.out.println("Number    Squared   Cubed");
			System.out.println("======    =======   =====");
			do {
				++i;

				j = (i * i);
				k = (j * i);
				System.out.printf("%-10d %-10d %-10d\n", i, j, k);				

			} while (i <= num);

			System.out.println("Continue?(y/n)");
			ans = scan.next().charAt(0);
		} while ((ans != 'n') && (ans != 'N'));

		scan.close();
	}

}