package test;

import org.junit.Assert;
import org.junit.Test;
import validation.Validation;

public class ValidationTest {

    @Test
    public void checkBracketsTestOK(){
        boolean actualResult = Validation.checkBrackets("(data()Art())");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkBracketsTestInvalid(){
        boolean actualResult = Validation.checkBrackets("(data(Art())");
        Assert.assertTrue(!actualResult);
    }

    @Test
    public void checkBracketsTestValid(){
        boolean actualResult = Validation.checkBrackets("dataArt");
        Assert.assertTrue(actualResult);
    }
}