<%@ page language="java" contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hlinks List</title>
    	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" type="text/css">
    
</head>
<body>
<div id="mvc"> 
    <h1>List of Vacancies</h1>
    <table>
	<tr><th>title</th><th>dateofpost</th><th>purchases</th>></tr>
	<c:forEach var="Vacancy" items="${vanciesList}">
	      <tr>
		<td><c:out value="${vacancy.id}" /></td>
	    <td><c:out value="${vacancy.hlName}" /></td>
	    <td><c:out value="${hlinks.getSupplier().getSupName()}" /></td>
		<td><c:out value="${hlinks.hlCatalogId}" /></td>
		<td><c:out value="${hlinks.hlPrice}" /></td>
		<td><c:out value="${hlinks.hlRating}" /></td>
		
		<td><a href="${vacancy.id}" title="Edit">
		<img alt="Edit" border ="0" src="<c:url value="/resources/images/edit.ico" />" width="16" height="16" >
		</a></td>
		
		
	    </tr> 
	</c:forEach>
     </table>
     </div> 
     </body>
     </html>
	        