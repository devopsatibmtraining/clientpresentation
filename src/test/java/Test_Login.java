package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.*;

import main.java.*;

public class Test_Login {

    @Test
    public void test1(){
        guru_login check = new guru_login();
        assertEquals("Login is valid", true, check.isUserValid("medyo","sprint"));
    }

    @Test
    public void test2(){
        guru_login check = new guru_login();
        assertEquals("Login is valid", true, check.isUserValid("wrong","mistake"));
    }
}