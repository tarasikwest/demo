<%@ page language="java" contentType="text/html; 	charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" 	prefix="cf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01   
       Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; 		charset=UTF-8">
	<title>New Hlinks</title>
	<style>.error{color:red; font-weight:bold;}</style>
	
</head>
<body>
     <h2>Hlinks Information13</h2>
     <cf:form method="POST" action="addVacancy"
 	modelAttribute="vacancy">
 	
     <table>
     <tr>
	     <td><cf:label path="id">id</cf:label></td>
	     <td><cf:input path="id" />
	     <br/><cf:errors path="id" cssClass="error"/></td>
	</tr>
	<tr>
	     <td><cf:label path="hlName">hlName</cf:label></td>
	     <td><cf:input path="hlName" />
	     <br/><cf:errors path="hlName" cssClass="error"/></td>
	</tr>
	
	<tr>
	     <td><cf:label path="hlLink">hlLink</cf:label></td>
         <td><cf:input path="hlLink" />
         <br/><cf:errors path="hlLink" cssClass="error"/></td>
	</tr>
	
	<tr>
	     <td><cf:label path="supplier.id">hlSupplierId</cf:label></td>
	     <td><cf:input path="supplier.id" /></td>
	</tr>
	
	<tr>
	     <td><cf:label path="hlCatalogId">hlCatalogId</cf:label></td>
	     <td><cf:input path="hlCatalogId" /></td>
	</tr>
	
	<tr>
	     <td><cf:label path="hlPrice">hlPrice</cf:label></td>
	     <td><cf:input path="hlPrice" />
	     <br/><cf:errors path="hlPrice" cssClass="message"/></td>
	</tr>
	
	<tr>
	     <td><cf:label path="hlRating">hlRating</cf:label></td>
	     <td><cf:input path="hlRating" /></td>
	</tr>
	
	<tr>
	     <td colspan="2">
		<input type="submit" value="Submit"/>
	     </td>
	</tr>
     </table> </cf:form>
</body> </html>
	    