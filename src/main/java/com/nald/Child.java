package com.nald;

public class Child {

	public String childId;
	public String childName;
	public int childAge;
	public String personId;

	public String getChildId() {
		return childId;
	}

	public void setChildId(String childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public int getChildAge() {
		return childAge;
	}

	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Child [childId=" + childId + ", childName=" + childName + ", childAge=" + childAge + ", personId="
				+ personId + "]";
	}

}
