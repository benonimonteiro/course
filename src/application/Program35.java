package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalPaymentService;

public class Program35 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter contract data");			
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Contract value: ");
			double totalValue = sc.nextDouble();
			
			Contract contract = new Contract(number, date, totalValue);
			
			System.out.print("Enter number of installments: ");
			int numberOfInstallments = sc.nextInt();
			
			ContractService installmentService = new ContractService(new PaypalPaymentService());
			installmentService.proccessContract(contract, numberOfInstallments);
			
			System.out.println("\nInstallments:");
						
			for (Installment installment : contract.getInstallments()) {
				System.out.println(installment);
			}
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
