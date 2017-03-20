package com.drandarov.javaee;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class CustomerView {

    private Customer customer;
    private List<Customer> allCustomers;

    @Inject
    CustomerService cs;

    public CustomerView() {
        customer = new Customer();
        allCustomers = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void save() {
        cs.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return cs.all();
    }

    public void setAllCustomers(List<Customer> allCustomers) {
        this.allCustomers = allCustomers;
    }
}
