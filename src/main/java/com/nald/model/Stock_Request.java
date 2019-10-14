package com.nald.model;

public class Stock_Request {
	public String SR_Brand;
	public String SR_Model_No;
	public String SR_Description;
	public int SR_Suggested_Order;
	public int SR_Quantity;
	public String SR_UM;
	public String SR_Recommendation;
	public String SR_Site;
	public String SR_Remarks;

	public String getSR_Brand() {
		return SR_Brand;
	}

	public void setSR_Brand(String sR_Brand) {
		SR_Brand = sR_Brand;
	}

	public String getSR_Model_No() {
		return SR_Model_No;
	}

	public void setSR_Model_No(String sR_Model_No) {
		SR_Model_No = sR_Model_No;
	}

	public String getSR_Description() {
		return SR_Description;
	}

	public void setSR_Description(String sR_Description) {
		SR_Description = sR_Description;
	}

	public int getSR_Suggested_Order() {
		return SR_Suggested_Order;
	}

	public void setSR_Suggested_Order(int sR_Suggested_Order) {
		SR_Suggested_Order = sR_Suggested_Order;
	}

	public int getSR_Quantity() {
		return SR_Quantity;
	}

	public void setSR_Quantity(int sR_Quantity) {
		SR_Quantity = sR_Quantity;
	}

	public String getSR_UM() {
		return SR_UM;
	}

	public void setSR_UM(String sR_UM) {
		SR_UM = sR_UM;
	}

	public String getSR_Recommendation() {
		return SR_Recommendation;
	}

	public void setSR_Recommendation(String sR_Recommendation) {
		SR_Recommendation = sR_Recommendation;
	}

	public String getSR_Site() {
		return SR_Site;
	}

	public void setSR_Site(String sR_Site) {
		SR_Site = sR_Site;
	}

	public String getSR_Remarks() {
		return SR_Remarks;
	}

	public void setSR_Remarks(String sR_Remarks) {
		SR_Remarks = sR_Remarks;
	}

	@Override
	public String toString() {
		return "Stock_Request [SR_Brand=" + SR_Brand + ", SR_Model_No=" + SR_Model_No + ", SR_Description="
				+ SR_Description + ", SR_Suggested_Order=" + SR_Suggested_Order + ", SR_Quantity=" + SR_Quantity
				+ ", SR_UM=" + SR_UM + ", SR_Recommendation=" + SR_Recommendation + ", SR_Site=" + SR_Site
				+ ", SR_Remarks=" + SR_Remarks + "]";
	}

}
