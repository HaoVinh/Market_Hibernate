
package BLL;

import DAL.OrderDAL;
import DTO.Order;
import java.util.List;

public class OrderBLL {
    OrderDAL orderDAL;
    
    public OrderBLL()
    {
        orderDAL=new OrderDAL();
    }
    
    public List<Order> getOrderList()
    {
        return orderDAL.getOrder();
    }
    
    public Object[][] getOrder()
    {
        List<Order> orderList=orderDAL.getOrder();
        if(orderList==null)
            return null;
        
        int rows = orderList.size();
        int cols = 6;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = orderList.get(i).getOrderID();
            obj[i][1] = orderList.get(i).getCustomer().getCustomerID();
            obj[i][2] = orderList.get(i).getCustomer().getFullName();
            obj[i][3] = orderList.get(i).getDate();
            obj[i][4] = orderList.get(i).getNote();
            obj[i][5] = orderList.get(i).getTotal();
        }
        return obj;

    }
    
    public Object[][] getOrderByID(int orderID)
    {
        Order order=orderDAL.getOrderByID(orderID);
        if(order==null)
            return null;
        
        int rows = 1;
        int cols = 6;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = order.getOrderID();
            obj[i][1] = order.getCustomer().getCustomerID();
            obj[i][2] = order.getCustomer().getFullName();
            obj[i][2] = order.getDate();
            obj[i][3] = order.getNote();
            obj[i][4] = order.getTotal();
        }
        return obj;

    }
    
    public Object[][] getOrderByCustomerID(int customerID)
    {
        List<Order> orderList=orderDAL.getOrderByCustomerID(customerID);
        if(orderList==null)
            return null;
        
        int rows = orderList.size();
        int cols = 6;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = orderList.get(i).getOrderID();
            obj[i][1] = orderList.get(i).getCustomer().getCustomerID();
            obj[i][2] = orderList.get(i).getCustomer().getFullName();
            obj[i][3] = orderList.get(i).getDate();
            obj[i][4] = orderList.get(i).getNote();
            obj[i][5] = orderList.get(i).getTotal();
        }
        return obj;

    }
    
    public Order getOrderListByID(int orderID)
    {
        return orderDAL.getOrderByID(orderID);
    }
    
    public int addOrder(Order order)
    {
        return orderDAL.addOrder(order);
    }
    
    public int deleteOrder(int orderID)
    {
        return orderDAL.deleteOrder(orderID);
    }
    
    public int updateOrder(Order order)
    {
        return orderDAL.updateOrder(order);
    }
}
