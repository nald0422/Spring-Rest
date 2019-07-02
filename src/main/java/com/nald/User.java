package com.nald;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "person_id", "company_name", "job_description" })
public class User {

	@JsonProperty("person_id")
	public String person_id;
	@JsonProperty("user_id")
	public String user_id;
	@JsonProperty("company_name")
	public String company_name;
	@JsonProperty("job_designation")
	public String job_designation;

	public String getPerson_id() {
		return person_id;
	}

	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getJob_designation() {
		return job_designation;
	}

	public void setJob_designation(String job_designation) {
		this.job_designation = job_designation;
	}

	@Override
	public String toString() {
		return "User [person_id=" + person_id + ", user_id=" + user_id + ", company_name=" + company_name
				+ ", job_designation=" + job_designation + "]";
	}

}
