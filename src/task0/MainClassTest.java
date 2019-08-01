package task0;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.Assert;
import org.junit.Test;
import task0.MainClass;

public class MainClassTest extends MainClass {

    @Test
    @Description("Test1")
    public void testGetLocalNumber() {
       int a = 14;
       Assert.assertTrue("метод не возвращает " + this.getLocalNumber(),this.getLocalNumber() == a);
    }

    @Test
    @Description("Test2")
    public void testGetClassNumber() {
        int a = 45;
        Assert.assertFalse( a + " - значение должно быть больше " + this.getClassNumber(), this.getClassNumber() > a);
    }

    @Test
    @Description("Test3")
    public void testGetClassString() {
        Assert.assertTrue("подстрок 'hello' или 'Hello' не найдено", this.getClassString().matches(".*(H|hello).*"));
    }

}

