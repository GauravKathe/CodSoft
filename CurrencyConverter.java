import java.util.*;
import java.text.DecimalFormat;




public class CurrencyConverter {
 
	public static void main(String[] args) {
 
		double amount, dollar, pound, code, euro, yen, ringgit, rupee;

		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
        System.out.println("**********************************************");
		System.out.println("||  Hi, Welcome to the Currency Converter!  ||");
        System.out.println("**********************************************");

        System.out.println("                                              ");
		System.out.println("Which currency You want to Convert ? ");
	    System.out.println("                                              ");

		
        System.out.println("1:Ruppe");
        System.out.println("2:Dollar");
        System.out.println("3:Pound");
        System.out.println("4:Euro");
        System.out.println("5:Yen");
        System.out.println("6:Ringgit");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For Indian Rupee Conversion
		if (code == 1) {
 
			dollar = amount / 76.85;
			System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
 
			pound = amount / 101.54;
			System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");
 
			euro = amount / 83.55;
			System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
 
			yen = amount / 0.67;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
 
			ringgit = amount / 18.39;
			System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " ringgit");
		} else if (code == 2) {
			// For Dollar Conversion
 
			rupee = amount * 76.85;
			System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
 
			pound = amount * 0.76;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.92;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
 
			yen = amount * 114.93;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 4.18;
			System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
		} else if (code == 3) {
			// For Pound Conversion
 
			rupee = amount * 101.66;
			System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 1.32;
			System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
 
			euro = amount * 1.21;
			System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
 
			yen = amount * 151.89;
			System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 5.52;
			System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " ringgit");
		} else if (code == 4) {
			// For Euro Conversion
 
			rupee = amount * 83.75;
			System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 1.09;
			System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.82;
			System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
 
			yen = amount * 125.08;
			System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 4.55;
			System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");
		} else if (code == 5) {
 
			// For Yen Conversion
 
			rupee = amount * 0.67;
			System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 0.0087;
			System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.0066;
			System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.0080;
			System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");
 
			ringgit = amount * 0.036;
			System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
		} else if (code == 6) {
			// For Ringgit Conversion
 
			rupee = amount * 18.41;
			System.out.println("Your " + amount + " ringgit is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 0.24;
			System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");
 
			pound = amount * 0.18;
			System.out.println("Your " + amount + " ringgit is : " + f.format(pound) + " pound");
 
			euro = amount * 0.22;
			System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");
 
			yen = amount * 27.27;
			System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");
		} else {
			System.out.println("Invalid input!!");
		}
		
		System.out.println("Thank you for choosing our System!!");
	}
 
}