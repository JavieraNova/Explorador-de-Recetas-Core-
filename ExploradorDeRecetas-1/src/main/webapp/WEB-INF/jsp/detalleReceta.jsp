<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Importante para usar JSTL -->
<html>
<head>
    <title>Detalles de la Receta</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css">
    <link rel="stylesheet" href="/css/estilos.css">
</head>
<body>
    <h1>Detalles de la Receta</h1>

    <c:choose>
        <c:when test="${not empty ingredientes}">
            <h2>Receta: ${nombreReceta}</h2>
            <ul>
                <c:forEach var="ingrediente" items="${ingredientes}">
                    <li>${ingrediente}</li>
                </c:forEach>
            </ul>
        </c:when>
        <c:otherwise>
            <p>${mensaje}</p>
        </c:otherwise>
    </c:choose>
</body>
</html>
