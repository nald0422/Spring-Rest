package com.nald;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "branch", "documentNo", "applicationDate", "cierDate", "age", "customer", "model", "status",
		"statusDate", "remarks" })
public class ApprovedStatus {

	@JsonProperty("branch")
	public String branch;
	@JsonProperty("documentNo")
	public String documentNo;
	@JsonProperty("applicationDate")
	public Date applicationDate;
	@JsonProperty("cierDate")
	public Date cierDate;
	@JsonProperty("age")
	public int age;
	@JsonProperty("customer")
	public String customer;
	@JsonProperty("model")
	public String model;
	@JsonProperty("status")
	public String status;
	@JsonProperty("statusDate")
	public Date statusDate;
	@JsonProperty("remarks")
	public String remarks;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Date getCierDate() {
		return cierDate;
	}

	public void setCierDate(Date cierDate) {
		this.cierDate = cierDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "AprrovedStatus [branch=" + branch + ", documentNo=" + documentNo + ", applicationDate="
				+ applicationDate + ", cierDate=" + cierDate + ", age=" + age + ", customer=" + customer + ", model="
				+ model + ", status=" + status + ", statusDate=" + statusDate + ", remarks=" + remarks + "]";
	}

}
