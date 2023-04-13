
package BLL;

import DAL.OrderDAL;
import DAL.OrderDetailDAL;
import DAL.VegetableDAL;
import DTO.Order;
import DTO.OrderDetail;
import DTO.Vegetable;
import java.util.List;

public class OrderDetailBLL {
    OrderDetailDAL orderDetailDAL;
    VegetableDAL vegetableDAL;
    OrderDAL orderDAL;
    
    public OrderDetailBLL()
    {
        orderDetailDAL=new OrderDetailDAL();
        vegetableDAL=new VegetableDAL();
        orderDAL=new OrderDAL();
    }
    
    public List<OrderDetail> getOrderDetailList()
    {
        return orderDetailDAL.getOrderDetail();
    }
    
    public Object[][] getOrderDetail()
    {
        List<OrderDetail> orderDetailList=orderDetailDAL.getOrderDetail();
        if(orderDetailList==null)
            return null;
        
        int rows = orderDetailList.size();
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = orderDetailList.get(i).getOrder().getOrderID();
            obj[i][1] = orderDetailList.get(i).getVegetable().getVegetableID();
            obj[i][2] = orderDetailList.get(i).getVegetable().getVegetableName();
            obj[i][3] = orderDetailList.get(i).getQuantity();
            obj[i][4] = orderDetailList.get(i).getPrice();
        }
        return obj;

    }
    
    public Object[][] getOrderDetailByID(int orderDetailID)
    {
        List<OrderDetail> orderDetailList=orderDetailDAL.getOrderDetailByID(orderDetailID);
        if(orderDetailList==null)
            return null;
        
        int rows = orderDetailList.size();
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = orderDetailList.get(i).getOrder().getOrderID();
            obj[i][1] = orderDetailList.get(i).getVegetable().getVegetableID();
            obj[i][2] = orderDetailList.get(i).getVegetable().getVegetableName();
            obj[i][3] = orderDetailList.get(i).getQuantity();
            obj[i][4] = orderDetailList.get(i).getPrice();
        }
        return obj;

    }
    
    public List<OrderDetail> getOrderDetailListByID(int orderDetailID)
    {
        return orderDetailDAL.getOrderDetailByID(orderDetailID);
    }
    
    public int addOrderDetail(OrderDetail orderDetail)
    {
        OrderDetail orderDetailOLD=orderDetailDAL.getOrderDetailByIDAndVegetableID(orderDetail.getOrder().getOrderID(),
                orderDetail.getVegetable().getVegetableID());
        if(orderDetailOLD!=null)//Check if the orderID exist
        {
            System.out.println("Trường Hợp Trùng ID");
            int orderID=orderDetail.getOrder().getOrderID();
            int newQuantity=orderDetailOLD.getQuantity()+orderDetail.getQuantity();
            float newPrice=calculatePrice(orderDetail.getVegetable().getVegetableID(), newQuantity);
            if(newQuantity==-1||newPrice==-1)
            {                
                System.out.println("Lỗi tính toán Price và Quantity");
                return -1;
            }
            
            orderDetail.setQuantity(newQuantity);
            orderDetail.setPrice(newPrice);
            
            if(updateOrderDetail(orderDetail)==0)//Update OrderDetail
            {
                //Decrease Vegetable Amount
                Vegetable vegetable=orderDetail.getVegetable();
                if(vegetable==null)
                {
                    System.out.println("Lỗi Lấy Vegetable");
                    return -1;
                }
                vegetable.setAmount(vegetable.getAmount()-orderDetail.getQuantity());
                
                //Update the Vegetable
                if(vegetableDAL.updateVegetable(vegetable)==-1)
                {
                    System.out.println("Lỗi Cập Nhật Vegetable");
                    return -1;
                }
                
                //Update the Order Total
                Order order=orderDetail.getOrder();
                if(order==null)
                {
                    System.out.println("Lỗi lấy Order");
                    return -1;
                }
                order.setTotal(calculateTotal(orderID));
                
                return orderDAL.updateOrder(order);
            }
            else
            {
                System.out.println("Trường hợp update OrderDetail lỗi");
                return -1;
            }
            
        }else
        {
            if(orderDetailDAL.addOrderDetail(orderDetail)==0)//Add OrderDetail
            {
                System.out.println("Trường Hợp Tạo Mới");
                int orderID=orderDetail.getOrder().getOrderID();
                //Decrease Vegetable Amount
                Vegetable vegetable=orderDetail.getVegetable();
                if(vegetable==null)
                {
                    System.out.println("Lỗi Lấy Vegetable");
                    return -1;
                }
                vegetable.setAmount(vegetable.getAmount()-orderDetail.getQuantity());
                
                //Update the Vegetable
                if(vegetableDAL.updateVegetable(vegetable)==-1)
                {
                    System.out.println("Lỗi Cập Nhật Vegetable");
                    return -1;
                }
                
                //Update the Order Total
                Order order=orderDetail.getOrder();
                if(order==null)
                {
                    System.out.println("Lỗi lấy Order");
                    return -1;
                }
                order.setTotal(calculateTotal(orderID));
                return orderDAL.updateOrder(order);
            }
            else
            {
                System.out.println("Trường Hợp Lỗi Add OrderDetail");
                return -1;
            }
        }
    }
    
    public int deleteOrderDetailByID(int orderID)
    {
        Order order=orderDAL.getOrderByID(orderID);
        order.setTotal(0);
        if(orderDetailDAL.deleteOrderDetailByID(orderID)==-1)
        {
            System.out.println("Lỗi Không Thể Xóa OrderDetail");
            return -1; 
        }            
        return orderDAL.updateOrder(order);
        
    }
    
    public int deleteOrderDetailByIDAndVegetableID(int orderDetailID,int vegetableID)
    {
        float total=orderDetailDAL.calculateTotal(orderDetailID,vegetableID);
        Order order=orderDAL.getOrderByID(orderDetailID);
        order.setTotal(order.getTotal()-total);
        
        if(orderDetailDAL.deleteOrderDetailByIDAndVegetableID(orderDetailID, vegetableID)==-1)
        {
            System.out.println("Lỗi Không Thể Xóa OrderDetail");
            return -1;
        }
        return orderDAL.updateOrder(order);
    }
    
    public int updateOrderDetail(OrderDetail orderDetail)
    {
        return orderDetailDAL.updateOrderDetail(orderDetail);
    }
    
    public float calculatePrice(int vegetableID,int quantity)
    {
        return orderDetailDAL.calculatePrice(vegetableID, quantity);
    }
    
    public float calculateTotal(int orderID)
    {
        return orderDetailDAL.calculateTotal(orderID);
    }
    
}
