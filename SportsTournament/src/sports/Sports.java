package sports;

import java.util.ArrayList;
import java.util.List;

public class Sports {
	private SportsName name;
	private SportsType type;
	private int maxGroupNumber;
	private int maxPeopleNumber;
	private int curGroupNumber;
	private int curPeopleNUmber;
	private List<Employee> employeeList;

	public Sports () {

	}

	public Sports (SportsName name, SportsType type, int maxGroupNumber, int maxPeopleNumber) {
		this.name = name;
		this.type = type;
		this.maxGroupNumber = maxGroupNumber;
		this.maxPeopleNumber = maxPeopleNumber;
		this.employeeList = new ArrayList<>();
	}

	public void setName (SportsName name) {
		this.name = name;
	}

	public SportsName getName () {
		return name;
	}

	public void setType (SportsType type) {
		this.type = type;
	}

	public SportsType getType () {
		return type;
	}

	public void setMaxGroup (int maxGroupNumber) {
		this.maxGroupNumber = maxGroupNumber;
	}

	public int getMaxGroup () {
		return maxGroupNumber;
	}

	public void setMaxPeople (int maxPeopleNumber) {
		this.maxPeopleNumber = maxPeopleNumber;
	}

	public int getMaxPeople () {
		return maxPeopleNumber;
	}

	public void setCurGroupNumber (int curGroupNumber) {
		this.curGroupNumber = curGroupNumber;
	}

	public int getCurGroupNumber () {
		return curGroupNumber;
	}

	public void setCurPeopleNUmber (int curPeopleNUmber) {
		this.curPeopleNUmber = curPeopleNUmber;
	}

	public int getCurPeopleNUmber () {
		return curPeopleNUmber;
	}

	public void setEmployeeList (List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public List<Employee> getEmployeeList () {
		return employeeList;
	}

}
