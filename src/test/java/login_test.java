package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.*;

import main.java.*;

public class login_test {

    @Test
    public void test1(){
        guru_login check = new guru_login();
        assertEquals("Login is valid", true, check.isUserValid("medyo","sprint"));
    }
}