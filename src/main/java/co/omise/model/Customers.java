package co.omise.model;

import java.util.List;

public class Customers extends OmiseList {
	protected List<Customer> data = null;
	
	public List<Customer> getData() {
		return data;
	}
}