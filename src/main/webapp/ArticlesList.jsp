<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="fr.univtours.polytech.exam.model.ArticleBean"%>
<!DOCTYPE html>
<html>
<head>
    <title>Articles List</title>
</head>
<body>
    <h2>Articles List</h2>
    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Prix</th>
            <th>Restants</th>
        </tr>
        <% 
            List<ArticleBean> articles = (List<ArticleBean>)request.getAttribute("articles");
            for(ArticleBean article : articles) {
        %>
            <tr>
                <td><%= article.getName() %></td>
                <td><%= article.getPrice() %></td>
                <td><%= article.getNbRestant() %></td>
            </tr>
        <% 
            }
        %>
    </table>
</body>
</html>
