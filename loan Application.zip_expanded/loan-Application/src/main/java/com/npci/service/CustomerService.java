/*package com.npci.service;

import java.util.List;

import com.npci.beans.Customer;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long customerId);
    Customer getCustomerById(Long customerId);
    List<Customer> getAllCustomers();
    Customer getCustomerByEmail(String email);
	void deleteById(Long customerId);
}*/


package com.npci.service;

import com.npci.beans.Customer;
import com.npci.exceptions.CustomerNotFoundException;

public interface CustomerService {

	public Customer getCustomer(String email_id);
	public Customer login(String email_id, String password) throws CustomerNotFoundException;
	public Customer createCustomer(Customer customer);
	
}