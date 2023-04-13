
package BLL;

import DAL.VegetableDAL;
import DTO.Vegetable;
import java.util.List;

public class VegetableBLL {
    VegetableDAL vegetableDAL=new VegetableDAL();
    
    public VegetableBLL()
    {
        vegetableDAL=new VegetableDAL();
    }
    
    public List<Vegetable> getVegetableList()
    {
        return vegetableDAL.getVegetable();
    }
    
    public Object[][] getVegetable()
    {
        List<Vegetable> vegetableList=vegetableDAL.getVegetable();
        if(vegetableList==null)
            return null;
        
        int rows = vegetableList.size();
        int cols = 8;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = vegetableList.get(i).getVegetableID();
            obj[i][1] = vegetableList.get(i).getVegetableName();
            obj[i][2] = vegetableList.get(i).getCategory().getCategoryID();
            obj[i][3] = vegetableList.get(i).getCategory().getName();
            obj[i][4] = vegetableList.get(i).getUnit();
            obj[i][5] = vegetableList.get(i).getAmount();
            obj[i][6] = vegetableList.get(i).getImage();
            obj[i][7] = vegetableList.get(i).getPrice();
        }
        return obj;

    }
    
    public Object[][] getVegetableByID(int vegetableID)
    {
        Vegetable vegetable=vegetableDAL.getVegetableByID(vegetableID);
        if(vegetable==null)
            return null;
        
        int rows = 1;
        int cols = 8;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = vegetable.getVegetableID();
            obj[i][1] = vegetable.getVegetableName();
            obj[i][2] = vegetable.getCategory().getCategoryID();
            obj[i][3] = vegetable.getCategory().getName();
            obj[i][4] = vegetable.getUnit();
            obj[i][5] = vegetable.getAmount();
            obj[i][6] = vegetable.getImage();
            obj[i][7] = vegetable.getPrice();
        }
        return obj;

    }
    
    public Object[][] getVegetableByVegetableName(String vegetableName)
    {
        List<Vegetable> vegetableList=vegetableDAL.getVegetableByVegetableName(vegetableName);
        if(vegetableList==null)
            return null;
        
        int rows = vegetableList.size();
        int cols = 8;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = vegetableList.get(i).getVegetableID();
            obj[i][1] = vegetableList.get(i).getVegetableName();
            obj[i][2] = vegetableList.get(i).getCategory().getCategoryID();
            obj[i][3] = vegetableList.get(i).getCategory().getName();
            obj[i][4] = vegetableList.get(i).getUnit();
            obj[i][5] = vegetableList.get(i).getAmount();
            obj[i][6] = vegetableList.get(i).getImage();
            obj[i][7] = vegetableList.get(i).getPrice();
        }
        return obj;

    }
    
    public Vegetable getVegetableListByID(int vegetableID)
    {
        return vegetableDAL.getVegetableByID(vegetableID);
    }
    
    public Object[][] getVegetableByCategory(int categoryID)
    {
        List<Vegetable> vegetableList=vegetableDAL.getVegetableByCategoryID(categoryID);
        if(vegetableList==null)
            return null;
        
        int rows = vegetableList.size();
        int cols = 8;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = vegetableList.get(i).getVegetableID();
            obj[i][1] = vegetableList.get(i).getVegetableName();
            obj[i][2] = vegetableList.get(i).getCategory().getCategoryID();
            obj[i][3] = vegetableList.get(i).getCategory().getName();
            obj[i][4] = vegetableList.get(i).getUnit();
            obj[i][5] = vegetableList.get(i).getAmount();
            obj[i][6] = vegetableList.get(i).getImage();
            obj[i][7] = vegetableList.get(i).getPrice();
        }
        return obj;
    }
    
    public int addVegetable(Vegetable vegetable)
    {
        return vegetableDAL.addVegetable(vegetable);
    }
    
    public int deleteVegetable(int vegetableID)
    {
        return vegetableDAL.deleteVegetable(vegetableID);
    }
    
    public int updateVegetable(Vegetable vegetable)
    {
        return vegetableDAL.updateVegetable(vegetable);
    }
    
    
}
