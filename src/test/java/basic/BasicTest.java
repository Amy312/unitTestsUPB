package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicTest {
    @BeforeEach
    public void before(){
        System.out.println("before");
    }
    @Test
    public void verifySomething(){
        System.out.println("test1");
    }
    @Test
    public void verifySomething2(){
        System.out.println("test2");
    }
    @AfterEach
    public void after(){
        System.out.println("After");
    }
}
