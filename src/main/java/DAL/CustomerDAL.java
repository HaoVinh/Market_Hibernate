package DAL;

import DTO.Customer;
import java.util.List;
import org.hibernate.Session;

public class CustomerDAL {

    private Session session;

    public CustomerDAL() {
        
    }

    public List<Customer> getCustomer() {
        List<Customer> customerList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            customerList = session.createQuery("From Customer").list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return customerList;
    }
    
    public Customer getCustomerByID(int customerID) {
        Customer customerDTO=null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            customerDTO=session.get(Customer.class, customerID);
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return customerDTO;
    }
    
    public List<Customer> getCustomerByCustomerName(String customerName) {
        List<Customer> customerList = null;
        customerName="%"+customerName+"%";
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            customerList = session.createQuery("From Customer C Where C.fullName like :customerName")
                    .setParameter("customerName",customerName).list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return customerList;
    }
    
    public int updateCustomer(Customer customer) 
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(customer);
            session.getTransaction().commit();
            return 0;
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return -1;

    }
    
    public int addCustomer(Customer customer)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();
            return 0;
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        
        return -1;
    }
    
    public int deleteCustomer(int customerID)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Customer customer = session.get(Customer.class,customerID);
            session.delete(customer);
            session.getTransaction().commit();
            return 0;
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        System.out.println("Còn lại:"+getCustomer().size());
        return -1;
    }

}
