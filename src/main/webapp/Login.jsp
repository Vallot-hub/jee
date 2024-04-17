<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Login Page</title>
  </head>
  <body>
    <h2>Login Page</h2>
    <form action="LoginServlet" method="post">
      <label for="username">/Login:</label>
      <input type="text" id="username" name="username" required="required" />
      <br /><br />

      <label for="password">Mot de passe:</label>
      <input
        type="password"
        id="password"
        name="password"
        required="required"
      />
      <br /><br />

      <input type="submit" value="Connect" />
    </form>
  </body>
</html>
