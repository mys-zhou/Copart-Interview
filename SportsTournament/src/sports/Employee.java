package sports;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int maxSportsCount;
	private int curSportsCount;
	private List<Team> teamList; // employee's current team list
	private List<Sports> sportsList; // employee's current sports list

	public Employee() {

	}

	public Employee(String name) {
		this.name = name;
		this.maxSportsCount = 3;
		this.curSportsCount = 0;
		this.teamList = new ArrayList<>();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCurSportsCount(int curSportsCount) {
		this.curSportsCount = curSportsCount;
	}

	public int getCurSportsCount() {
		return curSportsCount;
	}

	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}

	public List<Team> getTeamList() {
		return teamList;
	}

	public void setSportsList(List<Sports> sportsList) {
		this.sportsList = sportsList;
	}

	public List<Sports> getSportsList() {
		return sportsList;
	}

}
