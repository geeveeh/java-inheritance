/**
 * 
 */
package inheritance;

/**
 * @author ganga
 *
 */
public class ClassifiedStaff extends Employee {
	
	String name;
	String id;
	boolean isWorkStudy;
	double weeklySalary;
	String division;
	double payRate;
	



	/**
	 * @param name
	 * @param id
	 * @param isWorkStudy
	 * @param weeklySalary
	 * @param division
	 * @param payRate
	 */
	public ClassifiedStaff(String name, String id, boolean isWorkStudy, double weeklySalary, String division,
			double payRate) {
		super();
		this.name = name;
		this.id = id;
		this.isWorkStudy = isWorkStudy;
		this.weeklySalary = weeklySalary;
		this.division = division;
		this.payRate = payRate;
	}


	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return this.weeklySalary*this.payRate;
	}


	@Override
	public String toString() {
		return "ClassifiedStaff [name=" + name + ", id=" + id + ", isWorkStudy=" + isWorkStudy + ", weeklySalary="
				+ weeklySalary + ", division=" + division + ", payRate=" + payRate + "]";
	}




}
