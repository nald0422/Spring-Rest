package com.nald;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "userModel", "token" })
public class Authorization {

	@JsonProperty("userModel")
	private List<User> user = new ArrayList<>();

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Authorization [user=" + user + "]";
	}

}
