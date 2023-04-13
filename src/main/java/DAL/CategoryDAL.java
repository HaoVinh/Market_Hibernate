package DAL;

import DTO.Category;
import java.util.List;
import org.hibernate.Session;

public class CategoryDAL {

    private Session session;

    public CategoryDAL() {
        
    }

    public List<Category> getCategory() {
        List<Category> categoryList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            categoryList = session.createQuery("From Category").list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            System.out.println("I was here");
            session.close();
        }
        return categoryList;
    }
    
    public Category getCategoryByID(int categoryID) {
        Category categoryDTO=null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            categoryDTO=session.get(Category.class, categoryID);
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return categoryDTO;
    }
    
    public List<Category> getCategoryByName(String categoryName) {
        List<Category> categoryList = null;
        categoryName="%"+categoryName+"%";
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            categoryList = session.createQuery("From Category C where C.name like :categoryName")
                    .setParameter("categoryName", categoryName).list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }finally{
            session.close();
        }
        return categoryList;
    }
    
    
    public int updateCategory(Category category) 
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(category);
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
    
    public int addCategory(Category category)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(category);
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
    
    public int deleteCategory(Category category)
    {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.remove(category);
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
    
    
    
}
