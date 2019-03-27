package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;

import main.java.*;

public class Test_Login {

    @Test
    public void test1(){
        guru_login check = new guru_login();
        assertEquals("Login should be valid", true, check.isUserValid("medyo","sprint"));
    }

    @Test
    public void test2(){
        guru_login check2 = new guru_login();
        assertNotEquals("Login should be invalid", true, check2.isUserValid("wrong","mistake"));
    }

    @Test
    public void test3(){
        guru_login check = new guru_login();
        assertEquals("Login should be valid", true, check.isUserValid("valid","valid"));
    }
}