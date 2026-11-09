/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.CustomerManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CustomersReport {
    ArrayList<CustomerSummary> customerlist;
    
  public CustomersReport(){
        customerlist = new ArrayList();
    }
    public void addCustomerSummary(CustomerSummary cs){
        customerlist.add(cs);
    }

    // Assignment 9 - Report 2: customers sorted from highest total sales to lowest
    public ArrayList<CustomerSummary> getCustomersSortedBySales() {
        customerlist.sort((a, b) -> b.getOrderTotal() - a.getOrderTotal());
        return customerlist;
    }
}
