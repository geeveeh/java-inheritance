/**
 * 
 */
package inheritance;

/**
 * @author ganga
 *
 */
public class StudentEmployee extends Employee {
	String name;
	String id;
	boolean isWorkStudy;
	double hoursWorked;
	boolean someFlag;
	double payRate;

	/**
	 * @param name
	 * @param id
	 * @param isWorkStudy
	 * @param hoursWorked
	 * @param someFlag
	 * @param payRate
	 */
	public StudentEmployee(String name, String id, boolean isWorkStudy, double hoursWorked, boolean someFlag,
			double payRate) {
		super();
		this.name = name;
		this.id = id;
		this.isWorkStudy = isWorkStudy;
		this.hoursWorked = hoursWorked;
		this.someFlag = someFlag;
		this.payRate = payRate;
	}

	@Override
	public String toString() {
		return "StudentEmployee [name=" + name + ", id=" + id + ", isWorkStudy=" + isWorkStudy + ", hoursWorked="
				+ hoursWorked + ", someFlag=" + someFlag + ", payRate=" + payRate + "]";
	}

	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return this.payRate * this.hoursWorked;
	}

}
