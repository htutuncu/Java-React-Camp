package Entities;

public class User {
	private String idString;
	private String firstName;
	private String lastName;
	private int birthYear;
	
	
	
	
	public User(String idString, String firstName, String lastName, int birthYear) {
		this.idString = idString;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	
	
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
}
