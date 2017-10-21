package com.fengluyan.JavaWeb.service;

import com.fengluyan.JavaWeb.helper.DataBaseHelper;
import com.fengluyan.JavaWeb.model.Customer;

import java.util.List;

/**
 * Created by fly on 10/22/17.
 */
public class CustomerService {
    private static final String SQL_GET_CUSTOMER_LIST = "SELECT * FROM customer";

    public List<Customer> getCustomerList() {
        return DataBaseHelper.queryEntityList(Customer.class, SQL_GET_CUSTOMER_LIST);
    }
}
