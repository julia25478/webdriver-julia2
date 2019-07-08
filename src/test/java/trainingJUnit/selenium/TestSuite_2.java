package trainingJUnit.selenium;

import org.junit.*;

public class TestSuite_2 {

    @BeforeClass
    public static void beforeClass (){
        System.out.println("I'm beforeClass method for TestSuite_2") ;
    }

    @Before
    public void before (){
        System.out.println("I'm before method for TestSuite_2") ;

    }

    @Test
    public void test1 (){
        System.out.println("I'm test1 or TestSuite_2");
    }

    @Test
    public void test2 (){
        System.out.println("I'm test2 or TestSuite_2");
    }

    @After
    public void after (){
        System.out.println("I'm after method or TestSuite_2") ;

    }

    @AfterClass
    public static void afterClass (){
        System.out.println("I'm afterClass method or TestSuite_2") ;
    }
}

