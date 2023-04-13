
package DAL;

import java.util.regex.Pattern;

public class PatternCheck {
    
    private final Pattern So= Pattern.compile("^[0-9]+$");
    private final Pattern doubleNumberPattern=Pattern.compile("[0-9]{1,13}(\\.[0-9]*)?");
    
    public PatternCheck()
    {
        
    }
    
    public boolean CheckDoubleNumber(String number)
    {
        return doubleNumberPattern.matcher(number).find();
    }
    
    public boolean CheckNumber(String SoCanCheck)
    {
        return So.matcher(SoCanCheck).find();
    }
    
}
