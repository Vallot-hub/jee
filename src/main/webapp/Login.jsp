
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    
    <c:if style="color: red;" test="${sessionScope.FAILED != null}">
        mot de passe ou utilisateur incorrect
    </c:if>
     
    <h2>Login</h2>
    <form action="" method="post">
        <div>
        <label> username </label>
        <input type="text" name="username">
    </div>
    <div>
        <label> password </label>
        <input type="password" name="password"></input>
    </div>
    <div>
    <input type="submit" value="Subscribe!" />
</div>
    </form>

</body>
</html>
