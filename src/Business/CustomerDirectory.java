/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Krina Thakkar
 */
public class CustomerDirectory {
    private ArrayList<Customers> customerlist;

    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customers>();
    }

    public ArrayList<Customers> getCustomerlist() {
        return customerlist;
    } 

    public void setCustomerlist(ArrayList<Customers> customerlist) {
        this.customerlist = customerlist;
    }
    
    public Customers addCustomer(){
        Customers customer = new Customers();
        //System.out.println(customer);
        customerlist.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customers customer){
        customerlist.remove(customer);
    }
    
    public Customers searchCustomer(String name){
        System.out.println("Hello");
        for(Customers customer: customerlist){
            if(customer.getName().equals(name)){
                return customer;
        }
        }
        return null;
}
}
