package DAL;

import DTO.Category;
import DTO.OrderDetail;
import DTO.Vegetable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class OrderDetailDAL {

    private Session session;

    public OrderDetailDAL() {
        
    }

    public List<OrderDetail> getOrderDetail() {
        List<OrderDetail> orderDetailList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            orderDetailList = session.createQuery("From OrderDetail").list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return orderDetailList;
    }
    
    
    public List<OrderDetail> getOrderDetailByID(int orderID)
    {
        List<OrderDetail> orderDetailList=null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            orderDetailList=session.createQuery("From OrderDetail O where O.order.orderID=:orderID")
                    .setParameter("orderID", orderID).list();
            session.getTransaction().commit();
        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return orderDetailList;
    }
    
    public OrderDetail getOrderDetailByIDAndVegetableID(int orderID,int vegetableID)
    {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<OrderDetail> orderDetailList =session.createQuery("From OrderDetail O where O.order.orderID=:orderID and O.vegetable.vegetableID=:vegetableID")
                    .setParameter("orderID", orderID).setParameter("vegetableID", vegetableID).list();
            session.getTransaction().commit();
            if(!orderDetailList.isEmpty())
                return orderDetailList.get(0);
            
        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }    
    
    public int updateOrderDetail(OrderDetail orderDetail) 
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(orderDetail);
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
    
    public int addOrderDetail(OrderDetail orderDetail)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(orderDetail);
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
    
    public int deleteOrderDetailByID(int orderDetailID)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query=session.createQuery("DELETE FROM OrderDetail OD WHERE OD.order.orderID=:orderID")
                    .setParameter("orderID",orderDetailID);
            int result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        
        return -1;
    }
    
    public int deleteOrderDetailByIDAndVegetableID(int orderDetailID,int vegetableID)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query=session.createQuery("DELETE FROM OrderDetail OD WHERE OD.order.orderID=:orderID and OD.vegetable.vegetableID=:vegetableID")
                    .setParameter("orderID",orderDetailID)
                    .setParameter("vegetableID", vegetableID);
            int result=query.executeUpdate();
            session.getTransaction().commit();
            return result;
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        
        return -1;
    }
    
    public float calculatePrice(int vegetableID,int quantity)
    {
        float result=-1;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Vegetable vegetable=session.get(Vegetable.class, vegetableID);
            result=vegetable.getPrice()*quantity;
            session.getTransaction().commit();
            return result;
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        
        return -1;
    }
    
    public float calculateTotal(int orderID)
    {
        float result=0;
        try{
            List<OrderDetail> orderDetailList=getOrderDetailByID(orderID);
            for(OrderDetail orderDetail:orderDetailList)
            {
                result+=orderDetail.getPrice();
            }
            return result;
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }
        return -1;
    }
    
    public float calculateTotal(int orderID,int vegetableID)
    {
        //float result=0;
        try{
            OrderDetail orderDetail=getOrderDetailByIDAndVegetableID(orderID, vegetableID);
            return orderDetail.getPrice();
            
        }catch(Exception er)
        {
            er.printStackTrace();
        }
        return -1;
    }
    
}
