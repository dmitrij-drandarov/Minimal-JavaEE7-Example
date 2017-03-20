package com.drandarov.javaee;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerResource {

    @Inject
    CustomerService cs;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> all() {
        return cs.all();
    }

}
