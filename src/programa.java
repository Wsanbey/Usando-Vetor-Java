import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Well
 *
 */
public class programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número de entradas:");
		int  n = scan.nextInt();
		double[] vetor = new double[n];
		
		for(int i = 0 ; i < n; i++ ) {
			System.out.println("Entrado numer (" + i+1 +") : ");
			vetor[i] = scan.nextDouble();
		}
		
		double soma=0;
		for(int i = 0 ; i < n; i++ ) {
			soma += vetor[i]; 
		}	
		
		double total = soma / n;
		
		System.out.printf("\nA média total é: %.2f ", total );
		
		scan.close();
	}
}
