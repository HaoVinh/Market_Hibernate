
package BLL;

import DAL.CustomerDAL;
import DTO.Customer;
import java.util.List;

public class CustomerBLL {
    CustomerDAL customerDAL;
    
    public CustomerBLL()
    {
        customerDAL=new CustomerDAL();
    }
    
    public List<Customer> getCustomerList()
    {
        return customerDAL.getCustomer();
    }
    
    public Object[][] getCustomer()
    {
        List<Customer> customerList=customerDAL.getCustomer();
        if(customerList==null)
            return null;
        
        int rows = customerList.size();
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = customerList.get(i).getCustomerID();
            obj[i][1] = customerList.get(i).getFullName();
            obj[i][2] = customerList.get(i).getPassword();
            obj[i][3] = customerList.get(i).getAddress();
            obj[i][4] = customerList.get(i).getCity();
        }
        return obj;

    }
    
    public Object[][] getCustomerByID(int customerID)
    {
        Customer customer=customerDAL.getCustomerByID(customerID);
        if(customer==null)
            return null;
        
        int rows = 1;
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = customer.getCustomerID();
            obj[i][1] = customer.getFullName();
            obj[i][2] = customer.getPassword();
            obj[i][3] = customer.getAddress();
            obj[i][4] = customer.getCity();
        }
        return obj;
    }
    
    public Object[][] getCustomerByName(String customerName)
    {
        List<Customer> customerList=customerDAL.getCustomerByCustomerName(customerName);
        if(customerList==null)
            return null;
        
        int rows = customerList.size();
        int cols = 8;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = customerList.get(i).getCustomerID();
            obj[i][1] = customerList.get(i).getFullName();
            obj[i][2] = customerList.get(i).getPassword();
            obj[i][3] = customerList.get(i).getAddress();
            obj[i][4] = customerList.get(i).getCity();
        }
        return obj;

    }
    
    public Customer getCustomerListByID(int customerID)
    {
        return customerDAL.getCustomerByID(customerID);
    }
    
    public int addCustomer(Customer customer)
    {
        return customerDAL.addCustomer(customer);
    }
    
    public int deleteCustomer(int customerID)
    {
        return customerDAL.deleteCustomer(customerID);
    }
    
    public int updateCustomer(Customer customer)
    {
        return customerDAL.updateCustomer(customer);
    }
}
