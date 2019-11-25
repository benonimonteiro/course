package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program34 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		try {
			System.out.println("Enter rental data");		
			System.out.print("Car model: ");
			String model = sc.nextLine();
			
			System.out.print("Pickup (DD/MM/YYYY HH:MM): ");
			Date start = sdf.parse(sc.nextLine());
			System.out.print("Return (DD/MM/YYYY HH:MM): ");
			Date finish = sdf.parse(sc.nextLine());
			
			CarRental carRental = new CarRental(start, finish, new Vehicle(model));
			
			System.out.print("Enter price per hour: ");
			double pricePerHour = sc.nextDouble();
			System.out.print("Enter price per day: ");
			double pricePerDay = sc.nextDouble();
			
			RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
			rentalService.processInvoice(carRental);
			
			System.out.println("\nINVOICE:");
			System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
			System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
			System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		}
		catch (ParseException e) {
			System.out.println("Invalid date/time");
		}
		finally {
			sc.close();
		}
	}
}
