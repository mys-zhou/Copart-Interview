package sports;

import java.util.HashMap;
import java.util.List;

public class Register {
	//use hashMap to store 
	HashMap<Sports, Integer> sportsGroupCount; // current number of groups for sport
	HashMap<Sports, List<Team>> sportGroupList;	

	public Register() {
		sportsGroupCount = new HashMap<>(); // current number of groups for sport
		sportGroupList = new HashMap<>();
	}

	public void addSports(Employee e, Sports s) { // currently for individual sports

		// check if sports is full
		if (s.getCurPeopleNUmber() >= s.getMaxPeople()) {
			System.out.println("Sports is fully registered!");
			return;
		}

		// check if employee has registered over 3 sports
		if (e.getCurSportsCount() >= 3) {
			System.out.println("Max registration exceeded!");
			return;
		} 

		// register new sports for employee
		// increment sport's current employee count
		int currentPeopleCount = s.getCurPeopleNUmber();
		s.setCurPeopleNUmber(currentPeopleCount + 1);

		// add employee into sports list
		List<Employee> employeeList = s.getEmployeeList();
		employeeList.add(e);
		s.setEmployeeList(employeeList);

		// add sports into employee's sports list
		List<Sports> sportsList = e.getSportsList();
		sportsList.add(s);
		e.setSportsList(sportsList);

	}

	public void addNewTeam(Employee e, Sports s) {
		// check if employee already registered 3 or more sports
		if (e.getCurSportsCount() >= 3) {
			System.out.println("Max registration exceeded!");
			return;
		}
		// check if sports is a individual sports
		if (s.getType().equals(SportsType.INDIVIDUAL)) {
			System.out.println("Cannot register team for individual game.");
			return;
		}
		// check if sports has room for a new player
		if (s.getCurPeopleNUmber() >= s.getMaxPeople()) {
			System.out.println("Sports is fully registered!");
			return;
		}
		// check if sports has room for a new team
		// create new team with team name, sports name and player list
	}

	public void addSports(Employee e) { // for 

	}

}
