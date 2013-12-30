package com.crashpost.scm.crowd.auth.svc.model;

/**
 * Represents fields found in the Crowd system related to a given user
 * 
 * @author tobyboyd
 * 
 */
public class CrowdUser {

	private String firstName;
	private String lastName;
	private String displayName;
	private String username;
	private String email;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("### CrowdUser ### \r\n");
		sb.append("firstName=" + firstName + "\r\n");
		sb.append("lastName=" + lastName + "\r\n");
		sb.append("displayName=" + displayName + "\r\n");
		sb.append("username=" + username + "\r\n");
		sb.append("email=" + email + "\r\n");

		return sb.toString();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
