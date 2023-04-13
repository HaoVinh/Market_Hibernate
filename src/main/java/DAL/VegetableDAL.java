package DAL;

import DTO.Category;
import DTO.Vegetable;
import java.util.List;
import org.hibernate.Session;

public class VegetableDAL {

    private Session session;

    public VegetableDAL() {

    }

    public List<Vegetable> getVegetable() {
        List<Vegetable> vegetableList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            vegetableList = session.createQuery("From Vegetable").list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        } finally {
            session.close();
        }
        return vegetableList;
    }

    public Vegetable getVegetableByID(int vegetableID) {
        Vegetable vegetableDTO = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            vegetableDTO = session.get(Vegetable.class, vegetableID);
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        } finally {
            session.close();
        }
        return vegetableDTO;
    }

    public List<Vegetable> getVegetableByCategoryID(int categoryID) {
        List<Vegetable> vegetableList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            vegetableList = session.createQuery("FROM Vegetable V WHERE V.category.categoryID =:categoryID")
                    .setParameter("categoryID", categoryID).list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        }
        return vegetableList;
    }

    public List<Vegetable> getVegetableByVegetableName(String vegetableName) {
        List<Vegetable> vegetableList = null;
        vegetableName = "%" + vegetableName + "%";
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            vegetableList = session.createQuery("From Vegetable V Where V.vegetableName like :vegetableName")
                    .setParameter("vegetableName", vegetableName).list();
            session.getTransaction().commit();

        } catch (Exception er) {
            er.printStackTrace();
        } finally {
            session.close();
        }
        return vegetableList;
    }

    public int updateVegetable(Vegetable vegetable) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(vegetable);
            session.getTransaction().commit();
            return 0;

        } catch (Exception er) {
            er.printStackTrace();
        } finally {
            session.close();
        }
        return -1;

    }

    public int addVegetable(Vegetable vegetable) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(vegetable);
            session.getTransaction().commit();
            return 0;

        } catch (Exception er) {
            er.printStackTrace();
        } finally {
            session.close();
        }

        return -1;
    }

    public int deleteVegetable(int vegetableID) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Vegetable vegetable = session.get(Vegetable.class, vegetableID);
            session.delete(vegetable);
            session.getTransaction().commit();
            return 0;

        } catch (Exception er) {
            er.printStackTrace();
        } finally {
            session.close();
        }

        return -1;
    }

    public static void main(String[] args) {
        VegetableDAL test = new VegetableDAL();
        //int result=test.updateVegetable(new Vegetable(0,1,"Tomato","kg",100,"images/tomato.jpg",30000));
        //test.deleteVegetable(new Vegetable(1,1,"Tomato","kg",100,"images/tomato.jpg",30000) {});
        //test.addVegetable(new Vegetable(1,1,"Tomato","test",100,"images/tomato.jpg",30000));

    }

}
