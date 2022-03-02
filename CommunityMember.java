package Week8;
import java.util.Date;
// CommunityMember superclass
public class CommunityMember
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final Date birthDate;
	
	// constructor
	public CommunityMember(String firstName, String lastName,
		String socialSecurityNumber, Date birthDate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
	} // end constructor
	
	// return first name
	public String getFirstName()
	{
		return firstName;
	}
	
	// return last name
	public String getLastName()
	{
		return lastName;
	}
	
	// return social security number
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	
	// return birth date
	public Date getBirthDate()
	{
		return birthDate;
	}
	
	// return String representation of CommunityMember object
	@Override
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %s%n", "Community Member Name",
			getFirstName(), getLastName(), "Social Security Number", getSocialSecurityNumber(),
			"Birth Date", getBirthDate());
	}
} // end class CommunityMember
