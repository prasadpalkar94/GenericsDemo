import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GenericTest {
   

    @Test
    public void checkmax_at_first() {
        GenericsMax obj= new GenericsMax(10,5,2);
        Comparable check = obj.maxValue();
        Assert.assertEquals(10,check);
    }

    @Test
    public void checkmax_at_second() {
        GenericsMax obj= new GenericsMax(5,15,2);
        Comparable check = obj.maxValue();
        Assert.assertEquals(15,check);
    }

    @Test
    public void checkmax_at_third() {
        GenericsMax obj= new GenericsMax(10,15,22);
        Comparable check = obj.maxValue();
        Assert.assertEquals(22,check);
    }

    @Test
    public void checkmax_at_first_forFloat() {
        GenericsMax obj= new GenericsMax(5.5f,2.5f,1.5f);
        Comparable check = obj.maxValue();
        Assert.assertEquals(5.5,(float)check,1);
    }

    @Test
    public void checkmax_at_second_forFloat() {
        GenericsMax obj= new GenericsMax(3.5f,5.5f,1.5f);
        Comparable check = obj.maxValue();
        Assert.assertEquals(5.5,(float)check,1);
    }

    @Test
    public void checkmax_at_third_forFloat() {
        GenericsMax obj= new GenericsMax(5.5f,7.5f,10.5f);
        Comparable check = obj.maxValue();
        Assert.assertEquals(10.5,(float)check,1);
    }

    @Test
    public void checkmax_at_first_forString() {
        GenericsMax obj= new GenericsMax("pineapple","kiwi","mango");
        Comparable check = obj.maxValue();
        Assert.assertEquals("largest Strings is:","pineapple",check);
    }

    @Test
    public void checkmax_at_second_forString() {
        GenericsMax obj= new GenericsMax("kiwi","pineapple","mango");
        Comparable check = obj.maxValue();
        Assert.assertEquals("largest Strings is:","pineapple",check);
    }

    @Test
    public void checkmax_at_third_forString() {
        GenericsMax obj= new GenericsMax("kiwi","mango","pineapple");
        Comparable check = obj.maxValue();
        Assert.assertEquals("largest Strings is:","pineapple",check);
    }

    @Test
    public void check_max_for_Integers() {
        Comparable check= GenericsMax.getMax(15,10,5,15,25);
        Assert.assertEquals(25,check);
    }

    @Test
    public void check_max_for_Floats() {
        Comparable check= GenericsMax.getMax(15.5f,15.9f,5.2f,10.8f,19.5f);
        Assert.assertEquals(19.5,(float)check,1);
    }

    @Test
    public void check_max_for_Strings() {
        Comparable check= GenericsMax.getMax("prasad","abhishek","ahsaan","gaurav","ravi");
        Assert.assertEquals("Long Word is:","ravi",check);
    }
}
