
package BLL;

import DAL.CategoryDAL;
import DTO.Category;
import java.util.List;

public class CategoryBLL {
    CategoryDAL categoryDAL;
    
    public CategoryBLL()
    {
        categoryDAL=new CategoryDAL();
    }
    
    public List<Category> getCategoryList()
    {
        return categoryDAL.getCategory();
    }
    
    public Object[][] getCategory()
    {
        List<Category> categoryList=categoryDAL.getCategory();
        if(categoryList==null)
            return null;
        
        int rows = categoryList.size();
        int cols = 3;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = categoryList.get(i).getCategoryID();
            obj[i][1] = categoryList.get(i).getName();
            obj[i][2] = categoryList.get(i).getDescription();
        }
        return obj;

    }
    
    public Object[][] getCategoryByName(String categoryName)
    {
        List<Category> categoryList=categoryDAL.getCategoryByName(categoryName);
        if(categoryList==null)
            return null;
        
        int rows = categoryList.size();
        int cols = 3;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = categoryList.get(i).getCategoryID();
            obj[i][1] = categoryList.get(i).getName();
            obj[i][2] = categoryList.get(i).getDescription();
        }
        return obj;

    }
    
    public Object[][] getCategoryByID(int categoryID)
    {
        Category category=categoryDAL.getCategoryByID(categoryID);
        if(category==null)
            return null;
        
        int rows = 1;
        int cols = 3;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = category.getCategoryID();
            obj[i][1] = category.getName();
            obj[i][2] = category.getDescription();
        }
        return obj;

    }
    
    public Category getCategoryListByID(int categoryID)
    {
        return categoryDAL.getCategoryByID(categoryID);
    }
    
    
    public int addCategory(Category category)
    {
        return categoryDAL.addCategory(category);
    }
    
    public int deleteCategory(Category category)
    {
        return categoryDAL.deleteCategory(category);
    }
    
    public int updateCategory(Category category)
    {
        return categoryDAL.updateCategory(category);
    }
}
