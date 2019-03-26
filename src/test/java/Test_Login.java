package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;

import main.java.*;

public class Test_Login {

    @Test
    public void test1(){
        guru_login check = new guru_login();
        assertEquals("Login is valid", true, check.isUserValid("medyo","sprint"));
        assertNotEquals("Login is invalid", true, check.isUserValid("wrong","mistake"));
    }
}