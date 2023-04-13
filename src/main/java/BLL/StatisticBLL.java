

package BLL;

import DAL.StatisticDAL;
import DAL.VegetableDAL;
import java.util.List;

public class StatisticBLL {

    private StatisticDAL statisticDAL = new StatisticDAL();
    private VegetableDAL vegetableDAL = new VegetableDAL();

    public StatisticBLL() {
        statisticDAL = new StatisticDAL();
        vegetableDAL = new VegetableDAL();
    }

    public Object[][] getVegetableSoldByYear() 
    {
        List<Object[]> objList=statisticDAL.getVegetableSoldByYear();
        
        if(objList==null)
            return null;
        
        int rows = objList.size();
        int cols = 4, i = 0;
        Object[][] obj = new Object[rows][cols];
        for (Object[] objValue : objList) {
            obj[i][0] = objValue[0];
            obj[i][1] = objValue[1];
            obj[i][2] = objValue[2];
            obj[i][3] = vegetableDAL.getVegetableByID(Integer.parseInt(objValue[2].toString())).getVegetableName();
            i++;
        }
        return obj;
    }

    public Object[][] getVegetableSoldByMonth() 
    {
        List<Object[]> objList=statisticDAL.getVegetableSoldByMonth();
        
        if(objList==null)
            return null;
        
        int rows = objList.size();
        int cols = 4, i = 0;
        Object[][] obj = new Object[rows][cols];
        for (Object[] objValue : objList) {
            obj[i][0] = objValue[0];
            obj[i][1] = objValue[1];
            obj[i][2] = objValue[2];
            obj[i][3] = vegetableDAL.getVegetableByID(Integer.parseInt(objValue[2].toString())).getVegetableName();
            i++;
        }
        return obj;
    }
    
    public Object[][] getRevenueByYear() 
    {
        List<Object[]> objList=statisticDAL.getRevenueByYear();
        
        if(objList==null)
            return null;
        
        int rows = objList.size();
        int cols = 2, i = 0;
        Object[][] obj = new Object[rows][cols];
        for (Object[] objValue : objList) {
            obj[i][0] = objValue[0];
            obj[i][1] = objValue[1];
            i++;
        }
        return obj;
    }
    
    public Object[][] getRevenueByMonth() 
    {
        List<Object[]> objList=statisticDAL.getRevenueByMonth();
        
        if(objList==null)
            return null;
        
        int rows = objList.size();
        int cols = 2, i = 0;
        Object[][] obj = new Object[rows][cols];
        for (Object[] objValue : objList) {
            obj[i][0] = objValue[0];
            obj[i][1] = objValue[1];
            i++;
        }
        return obj;
    }
    
}
