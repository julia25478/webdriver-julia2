package trainingJUnit.selenium;

import org.junit.*;

public class TestSuite_1 {

    @BeforeClass
    public static void beforeClass (){
        System.out.println("I'm beforeClass method!") ;
    }

    @Before
    public void before (){
        System.out.println("I'm before method") ;

    }

    @Test
    public void test1 (){
        System.out.println("I'm test1");
    }

    @Test
    public void test2 (){
        System.out.println("I'm test2");
    }

    @After
    public void after (){
        System.out.println("I'm after method") ;

    }

    @AfterClass
    public static void afterClass (){
        System.out.println("I'm afterClass method") ;
    }
}
