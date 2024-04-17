<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Items List</title>
  </head>
  <body>
    <h2>Items List</h2>
    <table border="1">
      <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Remaining</th>
        <th>Quantity In Cart</th>
      </tr>
      <x:parse xml="${itemsXml}" var="xmlItems" />
      <x:forEach select="$xmlItems/Items/Item" var="item">
        <tr>
          <td><x:out select="$item/Name" /></td>
          <td><x:out select="$item/Price" /></td>
          <td><x:out select="$item/Remaining" /></td>
          <td><x:out select="$item/QuantityInCart" /></td>
        </tr>
      </x:forEach>
    </table>
  </body>
</html>
