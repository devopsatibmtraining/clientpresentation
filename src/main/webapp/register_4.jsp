<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>New Customer Registration</title>
</head>
<body>
<table style="with: 50%">
    <tr><td>
        <% String username = request.getParameter("username");
            /*String username = (String)request.getAttribute("uname");*/%>

        <H2>Welcome <%=username.toUpperCase()%>!!!! You have logged in.</H2></td></tr>
    <tr></tr><tr><td></td><td></td><td><a href="index.jsp"></a></td></tr>
</table>
<h1>New Customer Registration</h1>

    <table style="with: 50%">
        <tr>
            <td>First Name</td>
            <td><input type="text" name="first_name" /></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="last_name" /></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="address" /></td>
        </tr>
        <tr>
            <td>Mobile Number</td>
            <td><input type="text" name="mobile" /></td>
        </tr>
        <tr>
            <td>Landline Number</td>
            <td><input type="text" name="landline" /></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><input type="radio" name="gender" value="male"> Male<br>
                <input type="radio" name="gender" value="female"> Female<br></td>
        </tr>

    </table>
    <input type=submit value="Submit" />
</body>
</html>