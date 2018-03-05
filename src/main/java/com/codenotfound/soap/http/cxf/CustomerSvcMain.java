package com.codenotfound.soap.http.cxf;

import javax.xml.ws.Holder;

import com.fusesource.demo.customer.Customer;
import com.fusesource.demo.wsdl.customerservice.CustomerService;

public class CustomerSvcMain implements CustomerService {

	@Override
	public Customer lookupCustomer(String customerId) {
		// TODO Auto-generated method stub
		System.out.println("================ called by client =========");
		Customer c = new Customer();
		c.setFirstName("Abraham");
		c.setLastName("Lincoln");
		return c;
	}

	@Override
	public void updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerStatus(String customerId, Holder<String> status, Holder<String> statusMessage) {
		// TODO Auto-generated method stub

	}

}
