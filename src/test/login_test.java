package test;

import static org.junit.Assert.assertEquals;

import main.java.guru_login;

public class login_test {

    @Test
    public void test1(){
        guru_login check = new guru_login();
        assertEquals("Login is valid", true, check.isUserValid("medyo","sprint"));
    }
}