package com.drandarov.javaee;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CustomerService {

    Logger logger = Logger.getLogger(CustomerService.class.getSimpleName());

    @PersistenceContext
    EntityManager em;

    public List<Customer> all() {
        logger.info("Getting all customers...");
        return em.createQuery("select c from Customer c", Customer.class).getResultList();
    }

    public void save(Customer c) {
        logger.info("Saving customers...");
        em.persist(c);
    }

}
