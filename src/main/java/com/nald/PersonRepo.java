package com.nald;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonRepo {

	Connection con = null;
	Statement st = null;
	ResultSet res = null;

	public PersonRepo() {
		String url = "jdbc:mysql://localhost:3307/test";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Person createPerson(Person person) {

		String sql = "insert into person values(?, ?, ?)";

		try {
			PreparedStatement st = con.prepareStatement(sql);

//				System.out.println("Person Id : " + p.getPersonId());

			st.setString(1, person.getPersonId());
			st.setString(2, person.getPersonName());
			st.setInt(3, person.getPersonAge());

			st.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return person;
	}

	public List<Person> createPersons(List<Person> person) {

		String sql = "insert into person values(?, ?, ?)";

		try {
			for (Person p : person) {
				PreparedStatement st = con.prepareStatement(sql);

//				System.out.println("Person Id : " + p.getPersonId());

				st.setString(1, p.getPersonId());
				st.setString(2, p.getPersonName());
				st.setInt(3, p.getPersonAge());

				st.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return person;
	}

	public List<Person> getPersons() {
		List<Person> persons = new ArrayList<>();
		String sql = "SELECT * FROM PERSON";
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Person person = new Person();
				
				person.setPersonId(rs.getString(1));
				person.setPersonName(rs.getString(2));
				person.setPersonAge(rs.getInt(3));
				person.setChildren(getChildren(rs.getString(1)));

				persons.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return persons;
	}
	
	public List<Child> getChildren(String personId) {
		List<Child> children = new ArrayList<>();
		String sql = "SELECT * FROM CHILDREN WHERE PERSONID = "+personId;

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Child child = new Child();
				
				child.setChildId(rs.getString(1));
				child.setChildName(rs.getString(2));
				child.setChildAge(rs.getInt(3));
				child.setPersonId(personId);

				children.add(child);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return children;
	}
	
	public Child setChildren(Child child, String personId) {
		String sql = "insert into children values(?, ?, ?, ?)";

		try {
			PreparedStatement st = con.prepareStatement(sql);

//				System.out.println("Person Id : " + p.getPersonId());

			st.setString(1, child.getChildId());
			st.setString(2, child.getChildName());
			st.setInt(3, child.getChildAge());
			st.setString(4,  child.getPersonId());

			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return child;
	}
	
	public 
}
