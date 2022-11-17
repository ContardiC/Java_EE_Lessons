<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login </title>
</head>
<body>
<form action="LoginServlet" method="POST">
    <table>
        <tr>
            <td>Email: </td>
            <td><input type="email" name="email" maxlength="60"></td>
            <td>Password: </td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit"></td>
            <td><input type="reset"></td>
        </tr>
    </table>
</form>
</body>
</html>