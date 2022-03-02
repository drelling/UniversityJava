package Week8;
import java.util.Date;
import java.util.InputMismatchException;
// Alumnus class extends CommunityMember

public class Alumnus extends CommunityMember
{
	private Date graduationDate;
	private String occupation;
	private double totalDonated;
	
	// constructor
	public Alumnus(String firstName, String lastName, String socialSecurityNumber,
		Date birthDate, Date graduationDate, String occupation, double totalDonated)
	{
		super(firstName, lastName, socialSecurityNumber, birthDate);
		
		this.graduationDate = graduationDate;
		this.occupation = occupation;
		
		if (totalDonated < 0.0)
			throw new IllegalArgumentException(
			"Total Donated must be >= 0.00");
		
		this.totalDonated = totalDonated;
	}
	
	// set graduation date
	public void setGraduationDate(Date graduationDate)
	{
		this.graduationDate = graduationDate;
	}
	
	// return graduation date
	public Date getGraduationDate()
	{
		return graduationDate;
	}
	
	// set occupation
	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}
	
	// return occupation
	public String getOccupation()
	{
		return occupation;
	}
	
	// set total donated
	private void setTotalDonated(double totalDonated)
	{
		if (totalDonated < 0.0)
			throw new IllegalArgumentException(
				"Total Donated must be >= 0.00");
		
		this.totalDonated = totalDonated;
	}
	
	// return total donated
	public double getTotalDonated()
	{
		return totalDonated;
	}
	
	// get new donation total
	public void donate(double donationAmount)
	{
		try
		{
		if (donationAmount > 0.0)
			totalDonated += donationAmount;
		}
		catch (InputMismatchException inputMismatchException)
		{
			System.err.printf("%nException: %s%n", inputMismatchException);
		}
	}
	// return String representation of Alumnus object
	@Override
	public String toString()
	{
		return String.format("%n%nAlumnus %s%s: %s%n%s: %s%n%s: $%.2f",
			super.toString(), "Graduation Date", getGraduationDate(),
			"Occupation", getOccupation(), "Total Donated", getTotalDonated());
	}
} // end class Alumnus
