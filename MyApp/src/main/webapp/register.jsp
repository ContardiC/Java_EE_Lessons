<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
</head>
<body>
<form action="RegisterServlet" method="POST">
    <table>
        <tr>
            <td>Nome: </td>
            <td><input type="text" name="first-name" maxlength="60"></td>
            <td>Cognome: </td>
            <td><input type="text" name="last-name" maxlength="60"></td>
        </tr>
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