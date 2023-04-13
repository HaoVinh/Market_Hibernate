package DAL;

import DTO.Order;
import java.util.List;
import org.hibernate.Session;

public class OrderDAL {

    private Session session;

    public OrderDAL() {
        
    }

    public List<Order> getOrder() {
        List<Order> orderList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            orderList = session.createQuery("From Order").list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return orderList;
    }
    
    public Order getOrderByID(int orderID) {
        Order orderDTO=null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            orderDTO=session.get(Order.class, orderID);
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return orderDTO;
    }
    
    public List<Order> getOrderByCustomerID(int customerID) {
        List<Order> orderList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            orderList = session.createQuery("From Order O where O.customer.customerID=:customerID")
                    .setParameter("customerID", customerID).list();
            session.getTransaction().commit();
            return orderList;
            
        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return orderList;
    }
    
    public int updateOrder(Order order) 
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(order);
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
    
    public int addOrder(Order order)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(order);
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
    
    public int deleteOrder(int orderID)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Order order = session.get(Order.class,orderID);
            session.delete(order);
            session.getTransaction().commit();
            return 0;
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        System.out.println("Còn lại:"+getOrder().size());
        return -1;
    }
}
