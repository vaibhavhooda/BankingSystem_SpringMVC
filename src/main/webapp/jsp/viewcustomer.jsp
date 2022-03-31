<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<div align="center">
	<h1>Customer Info</h1>
	<table border="3" width="70%" cellpadding="3">
		<tr><th>CustomerId</th><th>CustomerName</th><th>Country</th><th>State</th><th>Address</th><th>PostalCode</th><th>Edit</th></tr>
	    <c:forEach var="customer" items="${list}"> 
			  <tr>
				   <td>${customer.customerId}</td>
				   <td>${customer.name}</td>
				   <td>${customer.country}</td>
				   <td>${customer.state}</td>
				   <td>${customer.addr}</td>
				   <td>${customer.postalcode}</td>
				   <td><a href="editcustomer/${customer.customerId}">Edit</a></td>
				   
			  </tr>
		 </c:forEach>
	</table>
	<br/>
	<a href="bookform">Add New Book -- to be disabled</a>
</div>

