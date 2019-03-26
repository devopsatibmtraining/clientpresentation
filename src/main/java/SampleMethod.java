package main.java;
public class SampleMethod {
    public String myMethod(String fname, String lname) {
        String ufname = fname.toUpperCase();
        String ulname = lname.toUpperCase();

        if  (ufname.equals("RONALD") && ulname.equals("ZAIDE")){
            return "Yes!";
        }
        else if (ufname.equals("SUCCEED") && ulname.equals("SUCCEED")) {
            return "Yes!";
        }else{
            return "No";
        }

    }

}
