import junit.framework.Assert;
import run.Hello;

/**
 * Created by kraluk01 on 7/22/2016.
 */
public class Test {

    @org.junit.Test
    public void TestOne() throws Exception {

        Hello hello = new Hello();
        String name = hello.Action();
        Assert.assertEquals("hello",name);

        System.out.println("Result!!!!");

    }
}
