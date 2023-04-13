/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Category;
import DTO.Customer;
import DTO.Order;
import DTO.OrderDetail;
import DTO.Vegetable;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author ADMIN
 */
public class HibernateUtil {
    
    private final static SessionFactory FACTORY;
    
    static{
        Configuration conf=new Configuration();
        
        Properties pros=new Properties();
        pros.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        pros.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        pros.put(Environment.URL, "jdbc:mysql://localhost:3306/market?zeroDateTimeBehavior=CONVERT_TO_NULL");
        pros.put(Environment.USER, "root");
        pros.put(Environment.PASS, "");
        
        conf.setProperties(pros);
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Vegetable.class);
        conf.addAnnotatedClass(Customer.class);
        conf.addAnnotatedClass(Order.class);
        conf.addAnnotatedClass(OrderDetail.class);
        
        ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        
        FACTORY=conf.buildSessionFactory(registry);
        
    }
    
    public static SessionFactory getSessionFactory()
    {
        return FACTORY;
    }
    
    public static void close()
    {
        getSessionFactory().close();
    }
    
    
    public static void main(String[] args) {
        System.out.println(HibernateUtil.getSessionFactory());
    }
}
