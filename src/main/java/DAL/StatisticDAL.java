package DAL;


import java.util.List;
import org.hibernate.Session;

public class StatisticDAL {

    private Session session;

    public StatisticDAL() {
        
    }

    public List<Object[]> getVegetableSoldByYear()
    {
        try{
            
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Object[]> objList=session.createQuery("SELECT YEAR(O.date) as YEAR,Sum(OD.quantity) as Sold,OD.vegetable.vegetableID as VegetableID\n" +
                                "From Order O,OrderDetail OD\n" +
                                "Where O.orderID=OD.order.orderID\n" +
                                "Group By YEAR(O.date),VegetableID\n" +
                                "Order BY Sold DESC").list();
            session.getTransaction().commit();
            return objList;
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }
    
    public List<Object[]> getVegetableSoldByMonth()
    {
        try{
            
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Object[]> objList=session.createQuery("SELECT MONTH(O.date) as MONTH,Sum(OD.quantity) as Sold,OD.vegetable.vegetableID as VegetableID\n" +
                                "From Order O,OrderDetail OD\n" +
                                "Where O.orderID=OD.order.orderID\n" +
                                "Group By MONTH(O.date),VegetableID\n" +
                                "Order BY Sold DESC").list();
            session.getTransaction().commit();
            return objList;
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }
    
    public List<Object[]> getRevenueByMonth()
    {
        try{
            
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Object[]> objList=session.createQuery("SELECT MONTH(O.date) as MONTH,SUM(O.total) as Revenue\n" +
                                            "FROM Order O\n" +
                                            "GROUP BY MONTH(O.date)").list();
            session.getTransaction().commit();
            return objList;
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }
    
    public List<Object[]> getRevenueByYear()
    {
        try{
            
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Object[]> objList=session.createQuery("SELECT YEAR(O.date) as YEAR,SUM(O.total) as Revenue\n" +
                                            "FROM Order O\n" +
                                            "GROUP BY YEAR(O.date)").list();
            session.getTransaction().commit();
            return objList;
        }catch(Exception er)
        {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }
    

}
