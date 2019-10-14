package com.nald;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nald.model.Stock_Request;

public class PersonRepo {

	Connection con = null;
	Statement st = null;
	ResultSet res = null;

	public PersonRepo() {
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "tmcdonald";

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

				persons.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return persons;
	}

	public List<Child> getChildren(String personId) {
		List<Child> children = new ArrayList<>();
		String sql = "SELECT * FROM CHILDREN WHERE PERSONID = " + personId;

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
			st.setString(4, child.getPersonId());

			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return child;
	}

	public List<ApprovedStatus> getApproved() {
		String sql = "SELECT * FROM approvedstatus";

		List<ApprovedStatus> asList = new ArrayList<>();

		System.out.println("After");

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				ApprovedStatus as = new ApprovedStatus();
				as.setBranch(rs.getString(1));
				System.out.println("Branch : " + rs.getString(1));
				as.setDocumentNo(rs.getString(2));
				System.out.println("Document No: " + rs.getString(2));
				as.setApplicationDate(rs.getDate(3));
				System.out.println("Application Date: " + rs.getDate(3));
				as.setCierDate(rs.getDate(4));
				System.out.println("Cier Date : " + rs.getDate(4));
				as.setAge(rs.getInt(5));
				System.out.println("Age : " + rs.getInt(5));
				as.setCustomer(rs.getString(6));
				System.out.println("Customer : " + rs.getString(6));
				as.setModel(rs.getString(7));
				System.out.println("Model : " + rs.getString(7));
				as.setStatus(rs.getString(8));
				System.out.println("Status : " + rs.getString(8));
				as.setStatusDate(rs.getDate(9));
				System.out.println("Status Date : " + rs.getDate(9));
				as.setRemarks(rs.getString(10));
				System.out.println("Remarks : " + rs.getString(10));
				// System.out.println(as.toString());

				asList.add(as);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return asList;
	}

	public List<Stock_Request> createStockRequest(List<Stock_Request> stockRequest) {

		String sql = "insert into tbl_stock_request values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			for (Stock_Request sr : stockRequest) {
				PreparedStatement st = con.prepareStatement(sql);

//				System.out.println("Person Id : " + p.getPersonId());

				st.setString(1, sr.getSR_Brand());
				st.setString(2, sr.getSR_Model_No());
				st.setString(3, sr.getSR_Description());
				st.setInt(4, sr.getSR_Suggested_Order());
				st.setInt(5, sr.getSR_Quantity());
				st.setString(6, sr.getSR_UM());
				st.setString(7, sr.getSR_Recommendation());
				st.setString(8, sr.getSR_Site());
				st.setString(9, sr.getSR_Remarks());

				st.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stockRequest;
	}
}
