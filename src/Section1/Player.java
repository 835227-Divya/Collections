package Section1;

import java.util.List;

public class Player {
	private String name;
	private String country;
	private String skill;
	public String getName() {
	return name;

}
	public void setName(String name) {
		this.name=name;
	}
	public String getCountry() {
		return country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Player(String name,String country,String skill) {
		super();
		this.name=name;
		this.country=country;
		this.skill=skill;
	}
	@Override
	public String toString() {
		return /*"Player [name=" + name + ", country=" + country + ", skill=" + skill + "]";*/
				String.format("%-15s%-15s%-15s", name,country,skill);
	}
	
	}

