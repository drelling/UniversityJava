package Week8;
import java.util.Date;
// Administrator class extends Faculty

public class Administrator extends Faculty implements Payable
{
	private String bonusEligible;
	
	// constructor
	public Administrator(String firstName, String lastName, String socialSecurityNumber,
			Date birthDate, Date hireDate, String occupation, String insurancePlan,
			String retirement, String department, double wages, String bonusEligible)
	{
		super(firstName, lastName, socialSecurityNumber, birthDate,
				hireDate, occupation, insurancePlan, retirement, wages, department);
		
		this.bonusEligible = bonusEligible;
	}
	
	// set department
	public void setBonusEligible(String bonusEligible)
	{	
		this.bonusEligible = bonusEligible;
	}
	
	// return department
	public String getBonusEligible()
	{
		return bonusEligible;
	}
	
	// calculate weekly earnings
	public double getWeeklyEarnings()
	{
		return (getWages() * 12) / 52;
	}
	
	// calculate earnings; override abstract method earnings in Employee
		@Override
		public double earnings()
		{
			return getWeeklyEarnings();
		}
	
	// return String representation of Administrator object
	@Override
	public String toString()
	{
		return String.format("%n%n%s%s: %s",
			super.toString(), "Eligible for Bonus",
			getBonusEligible());
	}
} // end class Administrator
