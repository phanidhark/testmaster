package org.bit.db.domain;

public class UserProfile {
	private String userId;
	private String roleId;
	private String firstName;
	private String mInitial;
	private String lastName;
	private String email;
	private String phone;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getmInitial() {
		return mInitial;
	}
	public void setmInitial(String mInitial) {
		this.mInitial = mInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", roleId=" + roleId
				+ ", firstName=" + firstName + ", mInitial=" + mInitial
				+ ", lastName=" + lastName + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	
}
