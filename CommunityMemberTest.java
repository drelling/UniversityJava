package Week8;
import java.util.Date;

// Community Member Hierarchy Test Program
public class CommunityMemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create subclass objects
		Date birth = new Date("08/30/1985");
		Date grad = new Date("05/30/2003");
		Alumnus alumnus = new Alumnus("Danielle", "Ellington", "333-33-3333", birth,
			grad, "Malware Analyst", 2000);
		Date birth1 = new Date("02/15/1990");
		Date grad1 = new Date("05/30/2019");
		Student student1 = new Student("John", "Smith", "444-44-4444", birth1,
			"Cyber Security", grad1, 70);
		Date birth2 = new Date("03/13/1989");
		Date grad2 = new Date("05/15/2021");
		Student student2 = new Student("Suzie", "Albert", "232-11-2222", birth2,
			"Accounting", grad2, 20);
		Date birth3 = new Date("06/11/1960");
		Date hire3 = new Date("01/25/1990");
		Staff staff = new Staff("Beverly", "Anderson", "555-55-5555", birth3,
			hire3, "Bookstore Manager", "BCBS Gold", "401k Contributor", 20.00,
			40);
		Date birth4 = new Date("07/21/1950");
		Date hire4 = new Date("03/01/1985");
		Teacher teacher = new Teacher("James", "Shipman", "123-45-6789", birth4,
			hire4, "Professor", "BCBS Platinum", "Science", "401k Contributor",
			5000, 3);
		Date birth5 = new Date("05/29/1980");
		Date hire5 = new Date("02/15/2005");
		Administrator administrator = new Administrator("Jessica", "Johnson", "987-65-4321",
			birth5, hire5, "Director", "BCBS Gold", "none", "Admissions",
			4000, "yes");
		
		System.out.printf("%s", alumnus.toString());
		System.out.printf("%s", student1.toString());
		System.out.printf("%s", student2.toString());
		System.out.printf("%s", staff.toString());
		System.out.printf("%s", teacher.toString());
		System.out.printf("%s", administrator.toString());
	}

}
