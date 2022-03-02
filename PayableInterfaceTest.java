package Week8;
import java.util.Date;
// processes employee salaries polymorphically
public class PayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payable[] payableObjects = new Payable[3];
		
		// populate array with objects that implement Payable
		Date birth = new Date("06/11/1960");
		Date hire = new Date("01/25/1990");
		payableObjects[0] = new Staff("Beverly", "Anderson", "555-55-5555", birth,
		hire, "Bookstore Manager", "BCBS Gold", "401k Contributor", 20.00,
		40);
		Date birth1 = new Date("07/21/1950");
		Date hire1 = new Date("08/01/1985");
		payableObjects[1] = new Teacher("James", "Shipman", "123-45-6789", birth1,
		hire1, "Professor", "BCBS Platinum", "Science", "401k Contributor",
		5000, 3);
		Date birth2 = new Date("05/29/1980");
		Date hire2 = new Date("02/15/2005");
		payableObjects[2] = new Administrator("Jessica", "Johnson", "987-65-4321",
		birth2, hire2, "Director", "BCBS Gold", "none", "Admissions",
		4000, "yes");
		
		System.out.println("Employees processed polymorphically:");
		
		for (Payable currentPayable : payableObjects)
		{
			System.out.printf("%s %n%s: $%,.2f%n",
				currentPayable.toString(), "Weekly Payment", currentPayable.earnings());
		}
	}
}
