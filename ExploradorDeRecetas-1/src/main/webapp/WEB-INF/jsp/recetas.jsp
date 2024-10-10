<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Importante para usar JSTL -->
<html>
<head>
    <title>Lista de Recetas</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css">
    <link rel="stylesheet" href="/css/estilos.css">
</head>
<body>
    <h1>Recetas disponibles</h1>
    <ul>
        <c:forEach var="receta" items="${listaRecetas}">
            <li><a href="/recetas/${receta}">${receta}</a></li>
        </c:forEach>
    </ul>
</body>
</html>
